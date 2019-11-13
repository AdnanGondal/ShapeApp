package shapes;

import java.awt.*;


public class Drawing extends Canvas {

  /*  Point p = new Point(200, 200);
    Color c = new Color();
    Point p1 = new Point(100, 100);
    Circle circle = new Circle(p,c,50);
    shapes.Rectangle rect = new Rectangle(p,c,100,100); */
    private Frame f;
    ShapeDB shapeDB = new ShapeDB();

    public Drawing() {
        //setupFrame();
       // setupCanvas();
        //setupList();
    }

  /*  private void setupList() {
        for (int i=0;i<10;i++) {
            shapes.add((Shape) new Circle(p, c, 10));
            p.translate(10, 0);
            shapes.add((Shape) new Circle(p1, c, 20));
            p.translate(10, 0);
            shapes.add((Shape) new Rectangle(p, c, 10, 10));
            p.translate(-10,10);
            shapes.add(new Square(p,c,10));
        }

    }


    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {    // Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
*/
    public void paint(Graphics g){
        shapeDB.drawShapes(g);
    }

     public void addCircle(Point pos, Color col, int rad) {
        shapeDB.addCircle(pos,col,rad);
     }

    public void addSquare(Point pos, Color col, int side){
        shapeDB.addSquare(pos,col,side);
    }
    public void addRectangle(Point pos, Color col, int w,int h){
        shapeDB.addRect(pos,col,w,h);

    }

    }

