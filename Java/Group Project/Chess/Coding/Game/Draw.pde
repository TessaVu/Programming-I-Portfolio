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
  text("DRAW", width/2, 310);
  text("STALEMATE REACHED", width/2, 400);
  textFont(description);
  text("AT LEAST YOU DID NOT LOSE", width/2, 450);
}
