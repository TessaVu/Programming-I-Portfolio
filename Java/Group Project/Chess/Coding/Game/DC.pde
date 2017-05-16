// Tessa Vu

PImage gameover;
PFont title;
PFont description;
int screenX, screenY, stage;

void setup() {
  size(1920, 1080);
  screenX = round(width);
  screenY = round(height);
  size(screenX, screenY);
  gameover = loadImage("Versus.png");
  image(gameover, 0, 0, screenX, screenY);
  title = createFont("Anurati-Regular", 80, true);
  description = createFont("Anurati-Regular", 30, true);
}

void draw() {
  textAlign(CENTER);
  textFont(title);
  text("DC WINS", width/2, 310);
  text("GAME OVER", width/2, 400);
  textFont(description);
  text("YOU ARE NOW A LOSER", width/2, 450);
}
