import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public float textX = 250;
  public float textY = 350;

  public void settings() {
    size(1000, 1000);
  }


  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
	  
    textbox();

  }

  public void textbox() {
    stroke(0);
    fill(0);

    rect(200, 300, 600, 300);
  }
  
  // define other methods down here.
}