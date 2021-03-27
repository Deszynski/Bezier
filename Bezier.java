package grafika_3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

public class Bezier extends ApplicationFrame 
{
	    private int x1 = 200;
	    private int y1 = 200;
	    
	    private int ctrlx = 300;
	    private int ctrly = 300;
	    
	    private int x2 = 300;
	    private int y2 = 500;

	    public Bezier() 
	    {
	    	super("Inicja³y Bartosz Zalewski");   
	    	setSize(600, 600);
	    	center();
	    	setVisible(true);
	    }
	    
	    @Override
		public void paint(Graphics g) 
	    {
	    	// B
	    	Point2D.Double s1 = new Point2D.Double(40, 60); // start
	    	Point2D.Double e1 = new Point2D.Double(40, 500); // end
	    	Point2D.Double center = new Point2D.Double(130, 250); // end
	    	Point2D.Double ctrl1 = new Point2D.Double(40, 50); // control point 1
	    	Point2D.Double ctrl2 = new Point2D.Double(40, 510); // control point 2
	    	Point2D.Double ctrl3 = new Point2D.Double(250, 50); // control point 3
	    	Point2D.Double ctrl4 = new Point2D.Double(250, 250); // control point 4
	    	Point2D.Double ctrl5 = new Point2D.Double(300, 250); // control point 3
	    	Point2D.Double ctrl6 = new Point2D.Double(300, 500); // control point 4
	    	//górny wewnêtrzny
	    	Point2D.Double s2 = new Point2D.Double(100, 110); // start
	    	Point2D.Double e2 = new Point2D.Double(100, 200); // end
	    		//prosta
	    	Point2D.Double ctrl7 = new Point2D.Double(100, 90); // control point 7
	    	Point2D.Double ctrl8 = new Point2D.Double(100, 220); // control point 8
	    	
	    	Point2D.Double ctrl9 = new Point2D.Double(160, 110); // control point 9
	    	Point2D.Double ctrl10 = new Point2D.Double(160, 200); // control point 10
	    	//dolny wewnetrzny
	    	Point2D.Double s3 = new Point2D.Double(100, 300); // start
	    	Point2D.Double e3 = new Point2D.Double(100, 450); // end
	    		//prosta
	    	Point2D.Double ctrl11 = new Point2D.Double(100, 290); // control point 11
	    	Point2D.Double ctrl12 = new Point2D.Double(100, 460); // control point 12
	    	
	    	Point2D.Double ctrl13 = new Point2D.Double(200, 300); // control point 13
	    	Point2D.Double ctrl14 = new Point2D.Double(200, 450); // control point 14
	    	
	    	
	    	// Z
	    	//c8
	    	Point2D.Double s4 = new Point2D.Double(350, 70); // start
	    	Point2D.Double e4 = new Point2D.Double(550, 70); // end
	    	Point2D.Double ctrl15 = new Point2D.Double(450, 40); // control point 15
	    	Point2D.Double ctrl16 = new Point2D.Double(450, 100); // control point 16
	    	//c9
	    	Point2D.Double s5 = new Point2D.Double(350, 120); // start
	    	Point2D.Double e5 = new Point2D.Double(500, 120); // end
	    	Point2D.Double ctrl17 = new Point2D.Double(425, 90); // control point 17
	    	Point2D.Double ctrl18 = new Point2D.Double(425, 150); // control point 18
	    	//c10
	    	Point2D.Double s6 = new Point2D.Double(350, 500); // start
	    	Point2D.Double e6 = new Point2D.Double(550, 500); // end
	    	Point2D.Double ctrl19 = new Point2D.Double(450, 470); // control point 19
	    	Point2D.Double ctrl20 = new Point2D.Double(450, 530); // control point 20
	    	//c11
	    	Point2D.Double s7 = new Point2D.Double(400, 450); // start
	    	Point2D.Double e7 = new Point2D.Double(550, 450); // end
	    	Point2D.Double ctrl21 = new Point2D.Double(475, 420); // control point 21
	    	Point2D.Double ctrl22 = new Point2D.Double(475, 480); // control point 22
	    	
	    	//ma³e pionowe
	    	//górna
	    	Point2D.Double ctrl23 = new Point2D.Double(350, 50); // control point 23
	    	Point2D.Double ctrl24 = new Point2D.Double(350, 150); // control point 24
	    	//dolna
	    	Point2D.Double ctrl25 = new Point2D.Double(550, 430); // control point 25
	    	Point2D.Double ctrl26 = new Point2D.Double(550, 520); // control point 26
	    	
	    	
	    	
	    	CubicCurve2D.Double c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	    	//B zewnêtrzne
	    	c1 = new CubicCurve2D.Double( s1.x, s1.y, ctrl1.x, ctrl1.y, ctrl2.x, ctrl2.y, e1.x, e1.y);
	    	c2 = new CubicCurve2D.Double( s1.x, s1.y, ctrl3.x, ctrl3.y, ctrl4.x, ctrl4.y, center.x, center.y);
	    	c3 = new CubicCurve2D.Double( center.x, center.y, ctrl5.x, ctrl5.y, ctrl6.x, ctrl6.y, e1.x, e1.y);
	    	//B brzuszki wewnatrz
	    	c4 = new CubicCurve2D.Double( s2.x, s2.y, ctrl7.x, ctrl7.y, ctrl8.x, ctrl8.y, e2.x, e2.y);
	    	c5 = new CubicCurve2D.Double( s2.x, s2.y, ctrl9.x, ctrl9.y, ctrl10.x, ctrl10.y, e2.x, e2.y);
	    	
	    	c6 = new CubicCurve2D.Double( s3.x, s3.y, ctrl11.x, ctrl11.y, ctrl12.x, ctrl12.y, e3.x, e3.y);
	    	c7 = new CubicCurve2D.Double( s3.x, s3.y, ctrl13.x, ctrl13.y, ctrl14.x, ctrl14.y, e3.x, e3.y);
	    	
	    	// Z
	    	c8 = new CubicCurve2D.Double( s4.x, s4.y, ctrl15.x, ctrl15.y, ctrl16.x, ctrl16.y, e4.x, e4.y);
	    	c9 = new CubicCurve2D.Double( s5.x, s5.y, ctrl17.x, ctrl17.y, ctrl18.x, ctrl18.y, e5.x, e5.y);
	    	c10 = new CubicCurve2D.Double( s6.x, s6.y, ctrl19.x, ctrl19.y, ctrl20.x, ctrl20.y, e6.x, e6.y);
	    	c11 = new CubicCurve2D.Double( s7.x, s7.y, ctrl21.x, ctrl21.y, ctrl22.x, ctrl22.y, e7.x, e7.y);
	    	
	    	//ma³a pionowa górna
	    	c12 = new CubicCurve2D.Double( s4.x, s4.y+3, ctrl23.x, ctrl23.y, ctrl24.x, ctrl24.y, s5.x, s5.y-8);
	    	//ma³a pionowa dolna
	    	c13 = new CubicCurve2D.Double( e6.x, e6.y, ctrl25.x, ctrl25.y, ctrl26.x, ctrl26.y, e7.x, e7.y);
	    	
	    	c14 = new CubicCurve2D.Double( e4.x, e4.y, s7.x, s7.y, e4.x, e4.y, s7.x, s7.y);
	    	c15 = new CubicCurve2D.Double( e5.x, e5.y, s6.x, s6.y, e5.x, e5.y, s6.x, s6.y);
	    	
	    	    	
	    	Graphics2D g2 = (Graphics2D)g;
	    	g2.draw(c1);
	    	g2.draw(c2);
	    	g2.draw(c3);	
	    	g2.draw(c4);
	    	g2.draw(c5);
	    	g2.draw(c6);
	    	g2.draw(c7);
	    	g2.draw(c8);
	    	g2.draw(c9);
	    	g2.draw(c10);
	    	g2.draw(c11);
	    	g2.draw(c12);
	    	g2.draw(c13);
	    	g2.draw(c14);
	    	g2.draw(c15);
	    }


	public static void main(String[] args) 
	{
		new Bezier();
	}

}
