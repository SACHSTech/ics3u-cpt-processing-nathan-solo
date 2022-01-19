import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  //Note: 4 number in fill or stroke is opacity 
  public float textX = 250;
  public float textY = 350;
  
  PImage Background;
  PImage Nine;
  PImage A;
  PImage E;
  PImage H;
  PImage N;
  PImage O;
  PImage S;
  PImage T;
  PImage U;
  PImage I;

  public char[] toyBox1 = {'S', 'T', 'H', 'A', 'N', 'U'};
  public char[] toyBox2 = {'H', 'E', 'I', 'N', 'T', 'A'};
  public char[] toyBox3 = {'U', 'I', 'E', 'N', 'S', 'O'};
  public char[] toyBox4 = {'E', 'H', 'T', 'S', 'N', 'I'};
  //public ArrayList<PImage> toyBox = new ArrayList<PImage>();

  public float toyBox1Front = 0;
  public float toyBox2Front = 0;
  public float toyBox3Front = 0;
  public float toyBox4Front = 0;
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

    
    Background = loadImage("Abandoned.Asylum.jpg");
    Nine = loadImage("Nine.jpg");
    A = loadImage("A.jpg");
    E = loadImage("E.jpg");
    H = loadImage("H.jpg");
    I = loadImage("I.jpg");
    N = loadImage("N.jpg");
    O = loadImage("O.jpg");
    S = loadImage("S.jpg");
    T = loadImage("T.jpg");
    U = loadImage("U.jpg");

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
        
        //image(S, 300, 450);
        image(H, 550, 450);
        image(U, 800, 450);
        image(E, 1050, 450);

        

        if (mouseX >= 300 && mouseX <= 410 && mouseY >= 450 && mouseY <= 560){
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(300, 450, 110, 110);
          toyBox1();
        } else if (mouseX >= 550 && mouseX <= 660 && mouseY >= 450 && mouseY <= 560){
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(550, 450, 110, 110);
          //toyBox2();
        }
      

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
  
  public void toyBox1() {

    char holder;
    
    printToy1();
    

    if (keyPressed) {
      if (keyCode == UP) {
        //did not add 4 and 5 up
        /*if (toyBox1Front == 0){
          
          toyBox1Front = 1; 
          toyBox1[0] = toyBox1[1];

          for (int i = 5; i > 0; i--){

            toyBox1[i] = toyBox1[i-1];
            printToy1();
          }
        } else if (toyBox1Front == 1){
          
          toyBox1Front = 2;
          toyBox1[0] = toyBox1[1];

          for (int i = 5; i > 0; i--){

            toyBox1[i] = toyBox1[i-1];
            printToy1();
          }
        } else if (toyBox1Front == 2){
          
          toyBox1Front = 3;
          toyBox1[0] = toyBox1[1];

          for (int i = 5; i > 0; i--){

            toyBox1[i] = toyBox1[i-1];
            printToy1();
          }
        } else if (toyBox1Front == 3){
          
          toyBox1Front = 0;
          toyBox1[0] = toyBox1[1];

          for (int i = 5; i > 0; i--){

            toyBox1[i] = toyBox1[i-1];
            printToy1();
          }

        }*/
        
        holder = toyBox1[0];

        toyBox1[0] = toyBox1[1];
        toyBox1[1] = toyBox1[2];
        toyBox1[2] = toyBox1[3];
        toyBox1[3] = holder;

      }

    }


  }

  public void printToy1() {
    float x = 300;
    float y = 450;

    if (toyBox1[0] == 'S'){
      image(S, x, y);
    }
    if (toyBox1[0] == 'T'){
      image(T, x, y);
    }
    if (toyBox1[0] == 'H'){
      image(H, x, y);
    }
    if (toyBox1[0] == 'A'){
      image(A, x, y);
    }
    if (toyBox1[0] == 'N'){
      image(N, x, y);
    }
    if (toyBox1[0] == 'U'){
      image(U, x, y);
    }

  }


}