import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

int sizeFactor, triangleSize, limitInt, redMeter, greenMeter, blueMeter, opacity;
public void setup()
{
	opacity = 25;
	// noLoop();
	// background(240);
	frameRate(8);
	sizeFactor = 600;
	// triangleSize = 400;
	// limitInt = 80;
	redMeter = 1;
	greenMeter = 1;
	blueMeter = 1;
	size(sizeFactor,sizeFactor);
	background(30);
	sierpinski(300,300,300);
	
}
public void draw()
{
	// background(150);


}

public void sierpinski(int x, int y, int len) 
{
	int redColor = redMeter + (int)(Math.random()*256);
	int greenColor = greenMeter + (int)(Math.random()*256);
	int blueColor = blueMeter + (int)(Math.random()*256);
	fill(redColor, greenColor, blueColor, opacity);
	stroke(redColor, greenColor, blueColor);
	// fill(0, 0);
	// ellipse(x, y, len*2, len*2);
	if (len > 40)
	{
		
		System.out.println("IFIFIFIFIF!");
		ellipse(x + (len/2), y, len/2, len/2);
		sierpinski(x + (len/2), y, len/2);
		ellipse(x + (len/2), y+ (len/2), len/2, len/2);
		sierpinski(x + (len/2), y+ (len/2), len/2);
		ellipse(x, y+ (len/2), len/2, len/2);
		sierpinski(x, y+ (len/2), len/2);
		ellipse(x - (len/2), y + (len/2), len/2, len/2);
		sierpinski(x - (len/2), y + (len/2), len/2);
		ellipse(x - (len/2), y, len/2, len/2);
		sierpinski(x - (len/2), y, len/2);
		ellipse(x - (len/2), y- (len/2), len/2, len/2);
		sierpinski(x - (len/2), y- (len/2), len/2);
		ellipse(x , y - (len/2), len/2, len/2);
		sierpinski(x , y - (len/2), len/2);
		ellipse(x + (len/2), y - (len/2), len/2, len/2);
		sierpinski(x + (len/2), y - (len/2), len/2);
		// sierpinski(x+ 25, y +25, len - 5);
		// opacity ++;
		

	}else
	{
		System.out.println("I'm doing stuff!");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("len: "+len);
		ellipse(x, y, len, len);
	}

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
