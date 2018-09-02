int fxpos = 100;
int fypos = 100; 
int hopdist = 15; 
Car car = new Car(150, 150, 50, 5); 
Car carr = new Car(200, 340, 50, 5); 
Car carrr = new Car(50, 10, 50, -5);
Car carrrr = new Car (300, 250, 50, -5); 
void setup() {
  size(400, 400);
}

void draw () {
  background(170, 238, 255); 
  fill(170, 255, 170);
  ellipse(fxpos, fypos, 25, 25);  
  offScreen(); 
  car.display(); 
  car.move();
  if (intersects(car) || intersects(carr) || intersects(carrr) || intersects(carrrr) ) {
    fxpos = 100;
    fypos = 100;
  }
  carr.display(); 

  carr.move();
  carrr.display(); 
  carrr.move(); 

  carrrr.display();
  carrrr.move();
} 

void offScreen() {

  if (fxpos > 400 || fxpos < 0) {
    fxpos = 100;
  } 
  if (fypos > 400 || fypos < 0) {
    fypos = 100;
  }
}

void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {

      fypos = fypos - hopdist; 
      //Frog Y position goes up
    } else if (keyCode == DOWN)
    {
      fxpos = fxpos;
      fypos = fypos +hopdist;
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      fypos = fypos;
      fxpos = fxpos +hopdist;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      fypos = fypos;
      fxpos = fxpos - hopdist; 
      //Frog X position goes left
    }
  }
}
void display() 
{

  fill(221, 136, 170);
  rect(200, 200, 100, 50);
}

boolean intersects(Car car) {
  if ((fypos > car.getY() && fypos < car.getY()+50) && (fxpos > car.getX() && fxpos < car.getX()+car.getSize()))
  {
    return true;
  } else 
  {
    return false;
  }
}