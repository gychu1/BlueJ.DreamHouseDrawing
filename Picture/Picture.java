
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Triangle tree;
    private Square stump;
    private Circle flower;
    private Square garage;
    private Square door;
    private Square grass;
    private Square sky;
    
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeColor("blue");
        grass.changeSize(800);
        grass.moveVertical(-200);
        grass.moveHorizontal(-100);
        grass.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(800);
        grass.moveVertical(200);
        grass.moveHorizontal(-100);
        grass.makeVisible();
        
        wall = new Square();
        wall.changeSize(118);
        wall.moveVertical(200);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeSize(216);
        wall.moveVertical(102);
        wall.moveHorizontal(118);
        wall.makeVisible();

        garage = new Square();
        garage.changeSize(90);
        garage.changeColor("black");
        garage.moveHorizontal(14);
        garage.moveVertical(228);
        garage.makeVisible();
        
        door = new Square();
        door.changeSize(50);
        door.changeColor("black");
        door.moveHorizontal(200);
        door.moveVertical(268);
        door.makeVisible();
        
        door = new Square();
        door.changeSize(50);
        door.changeColor("black");
        door.moveHorizontal(200);
        door.moveVertical(220);
        door.makeVisible();
        
        window = new Square();
        window.changeSize(50);
        window.changeColor("black");
        window.moveHorizontal(155);
        window.moveVertical(135);
        window.makeVisible();
        
        window = new Square();
        window.changeSize(50);
        window.changeColor("black");
        window.moveHorizontal(250);
        window.moveVertical(135);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(50, 160);
        roof.moveHorizontal(70);
        roof.moveVertical(190);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(100, 260);
        roof.moveHorizontal(237);
        roof.moveVertical(45);
        roof.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(5);
        stump.moveVertical(300);
        stump.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(5);
        stump.moveVertical(310);
        stump.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(40, 30);
        tree.moveHorizontal(20);
        tree.moveVertical(300);
        tree.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(100);
        stump.moveVertical(300);
        stump.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(100);
        stump.moveVertical(310);
        stump.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(40, 30);
        tree.moveHorizontal(112);
        tree.moveVertical(300);
        tree.makeVisible();
    
        
        flower = new Circle();
        flower.changeColor("magenta");
        flower.changeSize(15);
        flower.moveHorizontal(55);
        flower.moveVertical(290);
        flower.makeVisible();
        
        stump = new Square();
        stump.changeColor("yellow");
        stump.changeSize(5);
        stump.moveHorizontal(21);
        stump.moveVertical(315);
        stump.makeVisible();
        
        flower = new Circle();
        flower.changeColor("magenta");
        flower.changeSize(15);
        flower.moveHorizontal(118);
        flower.moveVertical(290);
        flower.makeVisible();
        
        stump = new Square();
        stump.changeColor("yellow");
        stump.changeSize(5);
        stump.moveHorizontal(84);
        stump.moveVertical(315);
        stump.makeVisible();
        
        // second set of flower and tree
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(155);
        stump.moveVertical(300);
        stump.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(155);
        stump.moveVertical(310);
        stump.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(40, 30);
        tree.moveHorizontal(170);
        tree.moveVertical(300);
        tree.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(280);
        stump.moveVertical(300);
        stump.makeVisible();
        
        stump = new Square();
        stump.changeColor("black");
        stump.changeSize(10);
        stump.moveHorizontal(280);
        stump.moveVertical(310);
        stump.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(40, 30);
        tree.moveHorizontal(292);
        tree.moveVertical(300);
        tree.makeVisible();
    
        
        flower = new Circle();
        flower.changeColor("magenta");
        flower.changeSize(15);
        flower.moveHorizontal(205);
        flower.moveVertical(290);
        flower.makeVisible();
        
        stump = new Square();
        stump.changeColor("yellow");
        stump.changeSize(5);
        stump.moveHorizontal(171);
        stump.moveVertical(315);
        stump.makeVisible();
        
        flower = new Circle();
        flower.changeColor("magenta");
        flower.changeSize(15);
        flower.moveHorizontal(298);
        flower.moveVertical(290);
        flower.makeVisible();
        
        stump = new Square();
        stump.changeColor("yellow");
        stump.changeSize(5);
        stump.moveHorizontal(264);
        stump.moveVertical(315);
        stump.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(480);
        sun.moveVertical(-10);
        sun.changeSize(80);
        sun.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("magenta");
        tree.changeSize(100, 30);
        tree.moveHorizontal(400);
        tree.moveVertical(300);
        tree.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("magenta");
        tree.changeSize(100, 30);
        tree.moveHorizontal(460);
        tree.moveVertical(300);
        tree.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("red");
        tree.changeSize(100, 40);
        tree.moveHorizontal(430);
        tree.moveVertical(300);
        tree.makeVisible();
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
