import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  public float textX = 250;
  public float textY = 350;
  PImage img;

  public void settings() {
    size(1500, 1000);
  }


  public void setup() {
    background(210, 255, 173);
    img = loadImage("Abandoned.Asylum.jpg");

  }

  public void draw() {
	  

    image(img, 0, 0);
    textbox();

  }

  public void textbox() {
    stroke(0);
    fill(0);

    rect(200, 300, 600, 300);

    stroke(255);
    fill(255, 0, 0);
    //ellipse()
  }
  
  // define other methods down here.
}