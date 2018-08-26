int xpos = 100;
boolean hasended = false; 
int ypos = 200; 
int birdYVelocity = 10; 
int gravity = 1;
int pipex = 500; 
int upperpy = 0; 
int pipeGap = 150; 
int pipeWidth = 60; 
int upperPipeHeight = (int) random(100,600); 
int lowerpy = upperpy + upperPipeHeight + pipeGap; 
int score = 0; 

void setup() {
 size(1000,800); 
}

void draw() {
  if (hasended == false) {
  ypos = ypos + birdYVelocity; 
  birdYVelocity = birdYVelocity + gravity; 
  background(133, 220, 252); 
  stroke(0,255,0); 
  fill(255,255,51);
  ellipse(xpos,ypos,60,60); 
  fill(51,253,51);
  rect(pipex, upperpy, pipeWidth, upperPipeHeight); 
  rect(pipex, lowerpy, pipeWidth, 800); 
  pipex-= 8; 
  teleportPipes(); 
  fill(255,0,0); 
  textSize(25); 
    text("Current score: " + score, 760,50); 
  if (intersectsPipes() == true) {
    background(0,0,0); 
    hasended = true; 
    text("You lose! Your final score was: " + score, 300,400 ); 
} }} 
 
 void mousePressed() {
   birdYVelocity =  - 10; 

 }
 void teleportPipes() {
   if (pipex < -100) {
     pipex = 1000; 
     
     upperPipeHeight =  (int) random(100,600);
      lowerpy = upperpy + upperPipeHeight + pipeGap; 
      score += 1; 
    
   }}
   
boolean intersectsPipes() { 
     if (ypos < upperPipeHeight && xpos > pipex && xpos < (pipex+pipeWidth)){
          return true; }
     else if (ypos>lowerpy && xpos > pipex && xpos < (pipex+pipeWidth)) {
          return true; }
     else { return false; }
}