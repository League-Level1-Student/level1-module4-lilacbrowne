
class Car {
  int cxpos; 
  int cypos;
  int size ;
  int speed; 

  Car(int cxpos, int cypos, int size, int speed) {
    this.cxpos = cxpos; 
    this.cypos = cypos;
    this.size = size;
    this.speed = speed;
  }
  void display() 
  {
    fill(221, 170, 255);
    rect(cxpos, cypos, size * 2, size);
  }
  void move() {
    cxpos = cxpos-speed; 

    if (cxpos < 0 - size * 2) {
      cxpos = 395;
    } else if (cxpos > 400) {
      cxpos = 5 - size * 2;
    }
  }
  int getY() {
    return cypos;
  }
  int getX() {
    return cxpos;
  }
  int getSize() {
    return size;
  }
}