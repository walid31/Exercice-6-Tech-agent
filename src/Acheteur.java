import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import jade.core.behaviours.CyclicBehaviour;

public class Acheteur extends Agent {
	protected void setup() {
		addBehaviour(new CyclicBehaviour(this) {
			public void action() {
				ACLMessage msg;
				Produit produit;
				msg = receive();
				if(msg != null) {
					try {
						produit = (Produit)msg.getContentObject();
						System.out.println("\nJe suis  "+getLocalName()+ " j'ai reçu le produit  "
						                  +produit.designation+ " avec le prix "+produit.prix);
						doDelete();
						Runtime.getRuntime().exit(Acheteur.AP_DELETED);
					}catch (UnreadableException e) {System.err.println(getLocalName() + "catched exception "+e.getMessage());
				}
			}block();
			}});
	}
	
	

}
