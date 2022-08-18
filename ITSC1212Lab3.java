import java.awt.Color;

public class ITSC1212Lab3{
    public static void main(String[] args){
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        //tom starts at the center of the world, facing up and pen down
        tom.setPenWidth(50);
        tom.hexagon(100);
        tom.penUp();
        tom.setPenWidth(50);
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.BLUE);
        tom.hexagon();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.GREEN);
        tom.hexagon(100);
        tom.penUp();
        tom.setPenWidth(50);
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.BLUE);
        tom.hexagon();
        tom.turn(90);

        /*
        tom.hexagon(100);
        tom.penUp();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.CYAN);
        tom.hexagon();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.MAGENTA);
        tom.hexagon(100);
        tom.penUp();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.GRAY);
        tom.hexagon();
        tom.turn(90);
        */
        
        /* Part C
        tom.hexagon();
        tom.penUp();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.CYAN);
        tom.hexagon();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.MAGENTA);
        tom.hexagon();
        tom.penUp();
        tom.turn(90);
        tom.penDown();
        tom.setColor(Color.GRAY);
        tom.hexagon();
        tom.turn(90);
        */

        /* Part B
        tom.forward();
        //Moves tom forward 100 pixels
        tom.turn(270);
        tom.penUp();
        //Turns tom so it faces left, then moves the pen up
        tom.forward(50);
        //Moves tom forward 50 pixels
        tom.turn(180);
        tom.penDown();
        tom.forward();
        //Turns tom around so he faces right, puts the pen down, and draws a line 100 pixels long
        tom.penUp();
        tom.forward(15);
        tom.penDown();
        tom.forward(50);
        tom.turn(90);
        tom.forward();
        tom.turn(90);
        tom.forward(50);
        tom.turn(90);
        tom.forward();
        tom.penUp();
        tom.turn(90);
        tom.forward(65);
        tom.turn(90);
        tom.penDown();
        tom.forward();
        tom.penUp();
        tom.turn(180);
        tom.forward();
        tom.turn(90);
        tom.penDown();
        tom.turn(45);
        tom.forward(50);
        tom.turn(270);
        tom.forward(50);
        tom.turn(135);
        tom.forward();
        tom.turn(180);*/
    }
}