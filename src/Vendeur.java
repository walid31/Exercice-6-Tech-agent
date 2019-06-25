import java.io.IOException;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Vendeur extends Agent {
	Produit produit = new Produit();
	ACLMessage msg;
	long start,end;
	protected void setup() {
	 produit.prix = (float) 1000;
	 produit.designation = "Clavier";		
	msg = new ACLMessage(ACLMessage.INFORM);
	msg.addReceiver(new AID("Cedric",AID.ISLOCALNAME));
	try {
		msg.setContentObject(produit);
		msg.setLanguage("JavaSerialization");
		send(msg);
	}catch (IOException e) {e.printStackTrace(); }
	doDelete();		
		
	}
}
