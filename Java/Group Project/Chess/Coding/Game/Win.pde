// Tessa Vu

PImage win;
PFont title;
PFont description;
int screenX, screenY, stage;

void setup() {
  size(1920, 1080);
  screenX = round(width);
  screenY = round(height);
  size(screenX, screenY);
  win = loadImage("Versus.png");
  image(win, 0, 0, screenX, screenY);
  title = createFont("Anurati-Regular", 80, true);
  description = createFont("Anurati-Regular", 30, true);
}

void draw() {
  textAlign(CENTER);
  textFont(title);
  text("VICTORY", width/2, 400);
  textFont(description);
  text("YOU ARE A WINNER", width/2, 450);
}
