import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle {
	Random random1;
	Random random2;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 3;
	
	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random1 = new Random();
		int randomXDirection = random1.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection * initialSpeed);
		
		random2 = new Random();
		int randomYDirection = random2.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection * initialSpeed);	
		
	}
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
		
	}
	public void move() {
		x += xVelocity;
		y += yVelocity;
	
	}
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillOval(x,y,height,width);
	}
}
