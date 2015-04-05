import java.awt.*;
import javax.swing.*;
import java.util.*;
/*
 * Made by: Jasper Haag
 *      Draw an arbitrary number of rectangle objects to a graph
 *        
 * This class will draw rectangles to the screen, bigger in the back and smaller in front.
 * Enter as many as you want into the draw method when you call it.
 * Use this class in your client program as follows:
 *      1. Create a new DrawRect: DrawRect whatever = new DrawRect();
 *      2. Call the draw() method, passing in as many rectangles as you want, with at least 1
 *          ex. draw(r1, r2, r3), draw(r1), draw(r1, r2, r1.union(r2)), draw(r1.intersection(r2)), draw(r1,r2,r3,r4,r5...rN)
 * *NOTE: You should only call the draw() method when once, as any time you call it, it will clear the graph you had before.
 * *NOTE: This draws rectangles assuming that you store your x and y coordinates for the top left corner of your rectangle.
 * *NOTE: You MUST have get methods for the x and y coordinates of corner of your rectangle and you must have
 *        get methods for the width and height of your rectangle.
 *        In the form of:
 *              getX();
 *              getY();
 *              getWidth();
 *              getHeight();
 * 
 * If you have any questions, talk to Jasper about it.
 */
public class DrawRect{
    protected final int WIDTH = 807; //really 800 x 800, but the added bit is to account for the border
    protected final int HEIGHT = 829;
    public DrawRect(){
        //nothing needed for construction
    }
    public void draw(Rectangle ... rects){//Rectangle ... rects accepts an arbitrary number of rectangles and turns them into an array
        sort(rects);//to put largest in back and preserve the smaller rectangles
        JFrame gui = new JFrame("Rectangle Visualization");    //create the JFrame and prepare it for drawing
        gui.pack();                                            //
        gui.setSize(WIDTH, HEIGHT);                            //
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //
        gui.setLocationRelativeTo(null);                       //to here
        Pane p = new Pane(rects);                              //actual drawing screen
        gui.setResizable(false);
        gui.add(p);        
        gui.setVisible(true);
    }
    private void sort(Rectangle r[]){//in descending order
        Rectangle t = null;
        for(int j = 0; j < r.length - 1; j++){
            for(int i = r.length - 1; i > j; i--){
                if(area(r[i]) > area(r[i - 1])){
                    t = r[i];
                    r[i] = r[i - 1];
                    r[i - 1] = t;
                }
            }
        }
    }
    private int area(Rectangle r){
        return r.getWidth() * r.getHeight();
    }
    private class Pane extends JPanel{//actual screen/image
        private Rectangle rect[];
        public Pane(Rectangle r[]){
            this.rect = r;
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);                                                            //Here:
            this.setBackground(Color.WHITE);                                                    //create grid pattern as background
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.setColor(Color.BLACK);
            g2.drawLine(400, 0, 400, 800);
            g2.drawLine(0, 400, 800, 400);
            for(int i = 0; i <= 20; i++){
                int u = i * 40;
                g2.drawLine(u, 390, u, 410);
                g2.drawLine(390, u, 410, u);
                g2.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2.drawLine(u, 0, u, 829);
                g2.drawLine(0, u, 807, u);
                g2.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            }                                                                                   //to here.
            rect(g2);
        }
        public void rect(Graphics2D g2){//draw rectangles to the grid
            Random rand = new Random();
            for(Rectangle r : rect){
                try{
                    int x = (r.getX() + 10) * 40;               //Scale x y coordinates and width and height
                    int y = (Math.abs(r.getY() - 10)) * 40;     //
                    int width = r.getWidth() * 40;              //
                    int height = r.getHeight() * 40;            //to fit the pixels per square on the grid
                    g2.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                    g2.fillRect(x + 1, y + 1, width - 1, height - 1);
                    g2.setColor(Color.BLACK);
                    g2.drawRect(x, y, width, height);
                }catch(Exception e){
                    System.out.println("Talk to Jasper.");
                }
            }
        }
    }
}
