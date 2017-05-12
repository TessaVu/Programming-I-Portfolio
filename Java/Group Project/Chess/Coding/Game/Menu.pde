// Tessa Vu

PImage startmenu;
PFont title;
PFont description;
int screenX, screenY, stage;

void setup() {
  size(1920, 1080);
  screenX = round(width);
  screenY = round(height);
  size(screenX, screenY);
  startmenu = loadImage("Versus.png");
  image(startmenu, 0, 0, screenX, screenY);
  title = createFont("Anurati-Regular", 80, true);
  description = createFont("Anurati-Regular", 30, true);
}

void draw() {
  textAlign(CENTER);
  textFont(title);
  text("CHESS: DC v. MARVEL", width/2, 400);
  textFont(description);
  text("PRESS ANY KEY TO START THE GAME", width/2, 450);
}
