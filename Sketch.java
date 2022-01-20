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
        
        printToy1();
        printToy2();
        printToy3();
        printToy4();

        

        if (mouseX >= 300 && mouseX <= 410 && mouseY >= 450 && mouseY <= 560){
          toyBox1();
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(300, 450, 110, 110);
          
        } else if (mouseX >= 550 && mouseX <= 660 && mouseY >= 450 && mouseY <= 560){
          toyBox2();
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(550, 450, 110, 110);
          
        } else if (mouseX >= 800 && mouseX <= 910 && mouseY >= 450 && mouseY <= 560){
          toyBox3();
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(800, 450, 110, 110);
          
        } else if (mouseX >= 1050 && mouseX <= 1200 && mouseY >= 450 && mouseY <=560){
          toyBox4();
          stroke(255, 255, 255, 50);
          fill(255, 255, 255, 50);
          rect(1050, 450, 110, 110);
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
    
    if (keyPressed) {
      if (keyCode == UP) {
        
        holder = toyBox1[0];

        toyBox1[0] = toyBox1[1];
        toyBox1[1] = toyBox1[2];
        toyBox1[2] = toyBox1[3];
        toyBox1[3] = holder;

      } else if (keyCode == DOWN) {

        holder = toyBox1[0];

        toyBox1[0] = toyBox1[3];
        toyBox1[3] = toyBox1[2];
        toyBox1[2] = toyBox1[1];
        toyBox1[1] = holder;

      } else if (keyCode == LEFT) {

        holder = toyBox1[0];

        toyBox1[0] = toyBox1[4];
        toyBox1[4] = toyBox1[2];
        toyBox1[2] = toyBox1[5];
        toyBox1[5] = holder;

      } else if (keyCode == RIGHT) {

        holder = toyBox1[0];

        toyBox1[0] = toyBox1[5];
        toyBox1[5] = toyBox1[2];
        toyBox1[2] = toyBox1[4];
        toyBox1[4] = holder;
      }
    }
  }

  public void toyBox2() {

    char holder;
    
    if (keyPressed) {
      if (keyCode == UP) {
        
        holder = toyBox2[0];

        toyBox2[0] = toyBox2[1];
        toyBox2[1] = toyBox2[2];
        toyBox2[2] = toyBox2[3];
        toyBox2[3] = holder;

      } else if (keyCode == DOWN) {

        holder = toyBox2[0];

        toyBox2[0] = toyBox2[3];
        toyBox2[3] = toyBox2[2];
        toyBox2[2] = toyBox2[1];
        toyBox2[1] = holder;

      } else if (keyCode == LEFT) {

        holder = toyBox2[0];

        toyBox2[0] = toyBox2[4];
        toyBox2[4] = toyBox2[2];
        toyBox2[2] = toyBox2[5];
        toyBox2[5] = holder;

      } else if (keyCode == RIGHT) {

        holder = toyBox2[0];

        toyBox2[0] = toyBox2[5];
        toyBox2[5] = toyBox2[2];
        toyBox2[2] = toyBox2[4];
        toyBox2[4] = holder;
      }
    }
  }

  public void toyBox3() {

    char holder;
    
    if (keyPressed) {
      if (keyCode == UP) {
        
        holder = toyBox3[0];

        toyBox3[0] = toyBox3[1];
        toyBox3[1] = toyBox3[2];
        toyBox3[2] = toyBox3[3];
        toyBox3[3] = holder;

      } else if (keyCode == DOWN) {

        holder = toyBox3[0];

        toyBox3[0] = toyBox3[3];
        toyBox3[3] = toyBox3[2];
        toyBox3[2] = toyBox3[1];
        toyBox3[1] = holder;

      } else if (keyCode == LEFT) {

        holder = toyBox3[0];

        toyBox3[0] = toyBox3[4];
        toyBox3[4] = toyBox3[2];
        toyBox3[2] = toyBox3[5];
        toyBox3[5] = holder;

      } else if (keyCode == RIGHT) {

        holder = toyBox3[0];

        toyBox3[0] = toyBox3[5];
        toyBox3[5] = toyBox3[2];
        toyBox3[2] = toyBox3[4];
        toyBox3[4] = holder;
      }
    }
  }

  public void toyBox4() {

    char holder;
    
    if (keyPressed) {
      if (keyCode == UP) {
        
        holder = toyBox4[0];

        toyBox4[0] = toyBox4[1];
        toyBox4[1] = toyBox4[2];
        toyBox4[2] = toyBox4[3];
        toyBox4[3] = holder;

      } else if (keyCode == DOWN) {

        holder = toyBox4[0];

        toyBox4[0] = toyBox4[3];
        toyBox4[3] = toyBox4[2];
        toyBox4[2] = toyBox4[1];
        toyBox4[1] = holder;

      } else if (keyCode == LEFT) {

        holder = toyBox4[0];

        toyBox4[0] = toyBox4[4];
        toyBox4[4] = toyBox4[2];
        toyBox4[2] = toyBox4[5];
        toyBox4[5] = holder;

      } else if (keyCode == RIGHT) {

        holder = toyBox4[0];

        toyBox4[0] = toyBox4[5];
        toyBox4[5] = toyBox4[2];
        toyBox4[2] = toyBox4[4];
        toyBox4[4] = holder;
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

  public void printToy2() {
    float x = 550;
    float y = 450;

    if (toyBox2[0] == 'H'){
      image(H, x, y);
    }
    if (toyBox2[0] == 'E'){
      image(E, x, y);
    }
    if (toyBox2[0] == 'I'){
      image(I, x, y);
    }
    if (toyBox2[0] == 'N'){
      image(N, x, y);
    }
    if (toyBox2[0] == 'T'){
      image(T, x, y);
    }
    if (toyBox2[0] == 'A'){
      image(A, x, y);
    }

  }

  public void printToy3() {
    float x = 800;
    float y = 450;

    if (toyBox3[0] == 'U'){
      image(U, x, y);
    }
    if (toyBox3[0] == 'I'){
      image(I, x, y);
    }
    if (toyBox3[0] == 'E'){
      image(E, x, y);
    }
    if (toyBox3[0] == 'N'){
      image(N, x, y);
    }
    if (toyBox3[0] == 'S'){
      image(S, x, y);
    }
    if (toyBox3[0] == 'O'){
      image(O, x, y);
    }

  }

  public void printToy4() {
    float x = 1050;
    float y = 450;

    if (toyBox4[0] == 'E'){
      image(E, x, y);
    }
    if (toyBox4[0] == 'H'){
      image(H, x, y);
    }
    if (toyBox4[0] == 'T'){
      image(T, x, y);
    }
    if (toyBox4[0] == 'S'){
      image(S, x, y);
    }
    if (toyBox4[0] == 'N'){
      image(N, x, y);
    }
    if (toyBox4[0] == 'I'){
      image(I, x, y);
    }

  }


}