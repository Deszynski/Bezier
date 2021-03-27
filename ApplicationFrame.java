package grafika_3;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ApplicationFrame extends Frame 
{
    public ApplicationFrame(String title) 
    {
        super(title);
        createUI();
    }
   
    public void createUI() 
    {
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	setSize(screenSize.width, screenSize.height);

    	addWindowListener(new WindowAdapter() 
    	{
    		@Override
    		public void windowClosing(WindowEvent e) 
    		{
    			dispose();
    			System.exit(0);
    		}
    	});
    }
  
    public void center() 
    {
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        setLocation(x, y);
    }
}