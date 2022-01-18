import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  //Note: 4 number in fill or stroke is opacity 
  public float textX = 250;
  public float textY = 350;
  
  PImage Background;

  /*
  scene -1 = background with open safe (background -1)
  scene 0 = background with no painting (background 0)
  scene 1 = original background (background 1)
  scene 2 = toys
  scene 3 = page
  scene 4 = page 2  
  scene 4 = window
  scene 5 = door
  scene 6 = bed
  scene 7 = text
  */

  public float scene = 1;
  public float background = 1;
  
  // to make sure the player does not guess the code. 
  public float step;

  public void settings() {
    size(1500, 1000);
  }


  public void setup() {
    background(210, 255, 173);
    Background = loadImage("Abandoned.Asylum.jpg");

  }

  public void draw() {
	  
    if (scene == 1 && background == 1) {
      image(Background, 0, 0);

      if (mousePressed){

        if (mouseX >= 206 && mouseX <= 366 && mouseY >= 690 && mouseY <= 840){
          scene = 2;
        
        }
      }

    } else if (scene == 2) {
        image(Background, 0, 0);
        
        stroke(0);
        fill(0, 0, 0, 210);
        rect(0, 0, 1500, 1000);
      }











}

  public void textbox() {
    stroke(255);
    fill(88, 85, 90);

    rect(200, 300, 1100, 400);

    stroke(255);
    fill(255, 0, 0);

    ellipse(1250, 350, 50, 50);
    
    line(1240, 340, 1260, 360);
    line(1260, 340, 1240, 360);

    if (mousePressed){
      if (mouseX > 1200 && mouseX < 1300 && mouseY > 300 && mouseY < 400){

      }
    }
  }
  
  // define other methods down here.
}