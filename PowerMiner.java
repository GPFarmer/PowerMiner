package PowerMiner;

	import java.awt.Graphics;
	import java.util.ArrayList;

	import javax.swing.JOptionPane;

	import org.parabot.environment.api.interfaces.Paintable;
	import org.parabot.environment.scripts.Category;
	import org.parabot.environment.scripts.Script;
	import org.parabot.environment.scripts.ScriptManifest;
	import org.parabot.environment.scripts.framework.Strategy;


	@ScriptManifest(name = "PowerMiner", 
	category = Category.MINING, 
	description = "Will Mine Any Ore And Empty When Inventory Is Full", 
	author = "GPFarmer", 
	version = 1.0, 
	servers = { "Ikov" })

	public class PowerMiner extends Script implements Paintable{

		 private final ArrayList<Strategy> cookie = new ArrayList<Strategy>();
		

		 public static int ore;
		@Override
		 public boolean onExecute() {	
			ore = Integer.parseInt(JOptionPane.showInputDialog("ENTER ORE ID"));
			cookie.add(new drop());
			cookie.add(new mine());
			cookie.add(new AntiBan());
			cookie.add(new dialog());
			provide(cookie);
			return true;
		}


		@Override
		public void paint(Graphics g) {
			g.drawString("Power Miner", 20, 50);
			
		}
		
		
		
	}

		
		
		
		


	
	
	
	
	


