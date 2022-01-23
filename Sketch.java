import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  //Note: 4 number in fill or stroke is opacity 
  public float textX = 250;
  public float textY = 350;
  
  PImage Bed;
  PImage Flashlight;
  PImage Outside;
 
  PImage A;
  PImage E;
  PImage H;
  PImage N;
  PImage O;
  PImage S;
  PImage T;
  PImage U;
  PImage I;
  
  PImage Painting;
  PImage BackgroundOpenSafe;
  PImage BackgroundWithoutPicture;

  PImage Zero;
  PImage One;
  PImage Two;
  PImage Three;
  PImage Four;
  PImage Five;
  PImage Six;
  PImage Seven;
  PImage Eight;
  PImage Nine;

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
  scene 1 = original background (background 1)
  scene 2 = toys
  scene 3 = page
  scene 4 = page 2 (in the safe with how to input the numbers)  
  scene 5 = window
  scene 6 = door
  scene 7 = bed
  scene 8 = text
  */

  public float scene = 1;
  public float background = 1;
  
  // to make sure the player does not guess the code. 
  public float step;

  public boolean Activityopen;

  //variables for flashlight effect
  //public float[] DarkX = new float[1500];
  //public float[] DarkY = new float[1000];
  //public float angle = radians(0);

  public void settings() {
    size(1500, 1000);
  }


  public void setup() {

    Painting = loadImage("Painting.png");
    BackgroundOpenSafe = loadImage("BackgroundOpenSafe.jpg");
    BackgroundWithoutPicture = loadImage("BackgroundWithoutPicture.jpg");

    A = loadImage("A.jpg");
    E = loadImage("E.jpg");
    H = loadImage("H.jpg");
    I = loadImage("I.jpg");
    N = loadImage("N.jpg");
    O = loadImage("O.jpg");
    S = loadImage("S.jpg");
    T = loadImage("T.jpg");
    U = loadImage("U.jpg");

    Bed = loadImage("Bed.jpg");
    Flashlight = loadImage("Flashlight.png");
    Outside = loadImage("Outside.jpg");

    Zero = loadImage("0.jpg");
    One = loadImage("1.jpg");
    Two = loadImage("2.jpg");
    Three = loadImage("3.jpg");
    Four = loadImage("4.jpg");
    Five = loadImage("5.jpg");
    Six = loadImage("6.jpg");
    Seven = loadImage("7.jpg");
    Eight = loadImage("8.jpg");
    Nine = loadImage("9.jpg");

  }

  public void draw() {
	  
    if (scene == 1) {
      Background();

      if (mousePressed){

        if (mouseX >= 206 && mouseX <= 366 && mouseY >= 690 && mouseY <= 840){
          scene = 2;
        }
        if (mouseX >= 180 && mouseX <= 354 && mouseY >= 890 && mouseY <= 970){
          scene = 3;
        }
        if (mouseX >= 100 && mouseX <= 328 && mouseY >= 135 && mouseY <= 596){
          scene = 5;
        } 
        if (mouseX >= 577 && mouseX <= 672 && mouseY >= 270 && mouseY <= 560){
          scene = 5;
        } 
        if (mouseX >= 920 && mouseX <= 1067 && mouseY >= 318 && mouseY <= 746){
          scene = 6;
        } 
        if (mouseX >= 1231 && mouseY >= 609){
          scene = 7;
        }

      }

    } else if (scene == 2) {
        Activityopen = true;
        Background();
         
        DarkBackground();
        
        //print box
        printToy1();
        printToy2();
        printToy3();
        printToy4();

        exit();

        //highlight box and calls method to change the side of said box
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
      } else if (scene == 3) {
        Activityopen = true; 
        Background();
         
        DarkBackground();
        //not done
        exit();

      } else if (scene == 4) {
        Activityopen = true;

        exit();
        
      } else if(scene == 5) {
        Activityopen = true;
        
        image(Outside, 0, 0);

        DarkBackground();
        Flashlight();

        exit();
        
      } else if(scene == 6) {
        Activityopen = true;

        Door();

        DarkBackground();

        exit();

      } else if(scene == 7) {
        Activityopen = true;

        image(Bed, 0, 0);

        stroke(0);
        fill(0, 0, 0, 150);
        rect(0, 0, 1500, 1000);

        if (mouseX <= 144 || mouseX >= 379 || mouseY >= 583 || mouseY <= 348){
          stroke(0);
          fill(0);
          rect(144, 348, 235, 235);
        }

        Flashlight();

        
      
        //tried to make real flashlight effect
        /*for (int i = 0; i < DarkY.length; i++){
          DarkY[i] = i;
        }
        for (int i = 0; i < DarkX.length; i++){
          DarkX[i] = i;
        }

        for (int i = 0; i < DarkY.length; i++){
          for (int j = 0; j <DarkX.length; j++){

            //int inside = 0;
            //int notinside = 0;


            while (inside != -1){

              //flashlight effect in shape of circle
               if (i >= mouseY + sin(angle) * 100 && i <= mouseY + 100 && j >= mouseX + cos(angle) * 100 && j <= mouseX + cos(PI/2 - angle)){
                inside = -1;
              }

              angle = angle + radians(1);

              if (angle >= 2 * PI) {
                inside = -1;
                notinside = -1;
                
              } 

              if (i >= mouseY - 100 && i <= mouseY + 100 && j >= mouseX - 100 && j <= mouseX + 100){
                inside = -1;
                } else {
                  inside = -1;
                  notinside = -1;
                }

            }

            if (i >= mouseY - 100 && i <= mouseY + 100 && j >= mouseX - 100 && j <= mouseX + 100){
              
            } else {
              if (notinside == -1){
              stroke(0, 0, 0, 255);
              stroke(0, 0, 0, 255);
              point(DarkX[j], DarkY[i]);
              }
            }
          }
        }*/



        exit();
      }

}

  /*
  * Prints the correct background based on how far into the game
  */
  public void Background() {

    if (background == 1) {
      image(BackgroundWithoutPicture, 0, 0);
      image(Painting, 0, 0);
    }
    if (background == 2) {
      image(BackgroundWithoutPicture, 0, 0);
    }
    if (background == 3) {
      image(BackgroundOpenSafe, 0, 0);
    }
  }

  /*
  * Prints a dark background
  */
  public void DarkBackground() {

    stroke(0);
    fill(0, 0, 0, 210);
    rect(0, 0, 1500, 1000);
  }

  /*
  * Prints a textbox
  */
  public void textbox() {
    stroke(255);
    fill(88, 85, 90);

    rect(200, 300, 1100, 400);
  }

  /*
  * Prints an exit circle
  */
  public void exit() {
    stroke(255);
    fill(255, 0, 0);

    ellipse(1400, 100, 50, 50);
    
    line(1390, 90, 1410, 110);
    line(1410, 90, 1390, 110);

    if (mousePressed){
      if (mouseX >= 1350 && mouseX <= 1450 && mouseY >= 50 && mouseY <= 150){
        Activityopen = false;
        scene = 1;
      }
    }
  }

  /*
  * checks if keycodes have been pressed for toybox 1 then changes the sides of the box accordingly 
  */
  public void Flashlight() {
    float opacity = 40;
    float size = 100;

    for(int i = 0; i < 10; i++){
        
      stroke(255, 244, 29, opacity);
      fill(255, 244, 29, opacity);
      ellipse(mouseX, mouseY, size, size);
      opacity = opacity - 10;
      size = size + 20;
    }

    image(Flashlight, mouseX, mouseY);
  }

  /*
  * checks if keycodes have been pressed for toybox 1 then changes the sides of the box accordingly 
  */
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

  /*
  * checks if keycodes have been pressed for toybox 2 then changes the sides of the box accordingly 
  */
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

  /*
  * checks if keycodes have been pressed for toybox 3 then changes the sides of the box accordingly 
  */
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

  /*
  * checks if keycodes have been pressed for toybox 4 then changes the sides of the box accordingly 
  */
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

  /*
  * Prints the correct letter for toybox 1
  */
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

  /*
  * Prints the correct letter for toybox 2
  */
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

  /*
  * Prints the correct letter for toybox 3
  */
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

  /*
  * Prints the correct letter for toybox 4
  */
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

  public void Door() {

    image(One, 525, 300);
    image(Two, 675, 300);
    image(Three, 825, 300);
    image(Four, 525, 450);
    image(Five, 675, 450);
    image(Six, 825, 450);
    image(Seven, 525, 600);
    image(Eight, 675, 600);
    image(Nine, 825, 600);
    image(Zero, 675, 750);


  }


}