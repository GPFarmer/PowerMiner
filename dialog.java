package PowerMiner;

import java.awt.Point;

import org.parabot.environment.input.Mouse;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Game;

public class dialog implements Strategy {

	@Override
	public boolean activate() {
		return Game.getOpenBackDialogId() == 368;
	}

	@Override
	public void execute() {
		
		Point sellpoint = new Point(272, 445);
		Mouse.getInstance().click(sellpoint,false);
		
		
		
		
	}
	
	
	
	

}
