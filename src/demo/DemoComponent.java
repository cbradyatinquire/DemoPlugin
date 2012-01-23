package demo;

import java.awt.Graphics;
import javax.swing.JPanel;

import org.nlogo.api.CompilerException;
import org.nlogo.api.NetLogoListener;
import org.nlogo.window.GUIWorkspace;


public class DemoComponent extends JPanel implements NetLogoListener {

	private static final long serialVersionUID = 1L;
	private GUIWorkspace wspace;
	
	public DemoComponent( GUIWorkspace workspace ) {
		this.wspace = workspace;
		wspace.listenerManager.addListener(this);
	}
	
	
	public void paintComponent( Graphics g )  {
		g.drawString( "TICK COUNTER READS: " + String.valueOf(wspace.world.ticks()), 20 , 60 );
	}

	@Override
	public void tickCounterChanged(double arg0) {
		this.repaint();
	}
	
	
	@Override
	public void buttonPressed(String arg0) {
		// TODO Auto-generated method stub
	}


	@Override
	public void buttonStopped(String arg0) {
		// TODO Auto-generated method stub
	}

	
	@Override
	public void chooserChanged(String arg0, Object arg1, boolean arg2) {
		// TODO Auto-generated method stub	
	}

	
	@Override
	public void codeTabCompiled(String arg0, CompilerException arg1) {
		// TODO Auto-generated method stub	
	}


	@Override
	public void commandEntered(String arg0, String arg1, char arg2,
			CompilerException arg3) {
		// TODO Auto-generated method stub	
	}

	
	@Override
	public void inputBoxChanged(String arg0, Object arg1, boolean arg2) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void modelOpened(String arg0) {
		// TODO Auto-generated method stub		
	}


	@Override
	public void possibleViewUpdate() {
		// TODO Auto-generated method stub
	}


	@Override
	public void sliderChanged(String arg0, double arg1, double arg2,
			double arg3, double arg4, boolean arg5, boolean arg6) {
		// TODO Auto-generated method stub
	}


	@Override
	public void switchChanged(String arg0, boolean arg1, boolean arg2) {
		// TODO Auto-generated method stub
	}
	
	
}
