package PowerMiner;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Game;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

public class mine implements Strategy{
	
	int ore=PowerMiner.ore;
		
		@Override
		public boolean activate() {
			return !Inventory.isFull() && Game.getOpenBackDialogId() != 368;
		}

		@Override
		public void execute() {
			

				if (SceneObjects.getNearest(ore) != null)
				{
					
					SceneObject[] get1 = SceneObjects.getNearest(ore);
					
					if(get1!=null)
					{
						get1[0].interact(0);
						 Time.sleep(2000);
					}
				
				}
			}
			
					
			
		}
