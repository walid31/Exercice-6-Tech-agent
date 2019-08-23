import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.*;
import java.util.*;

public class CreateAgent {
	public static void main(String[] args) {
		try {Runtime rt = Runtime.instance();
		rt.setCloseVM(true);
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			ArrayList<AgentController> liste = new ArrayList();
		
			
			liste.add(mc.createNewAgent("Walid", "Vendeur",null) );
			liste.get(liste.size()-1).start();
			
			
			
			
			AgentController ag1 = mc.createNewAgent("Walid", "Vendeur",null);
			ag1.start();
			AgentController ag2 = mc.createNewAgent("Cedric", "Acheteur",null);
			ag2.start();
		}catch (Exception e) {e.printStackTrace();}
	}

}
