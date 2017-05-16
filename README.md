# Programming I Portfolio 2016 - 2017
## Tessa Vu (vutessa.tv@gmail.com)
Skyline High School
Project programmed with Bryn Esperson and Nastassja Motro.

https://tessavu.github.io/Programming-I-Portfolio/
## Game

We have decided to create a Chess Game using the Java Language. But we made is so that this would be running on the Processing app as it is good to use when dealing with graphics. This program is just supposed to replicate the design of a chess game like one you would find on an app on your phone or on the computer. It's not as fancy with as many special effects as some other games but it still has many cool features.

## Basic Rules

Chess is a two player game. One person controls one set of peices (black pieces) and the other player controls the opposite set of pieces (white pieces). Players cannot switch set of pieces midgame. The goal of the game is to get the other player's King into checkmate.

### Check, Checkmate, and Stalemate

* Check - When the King of a player can be taken by a piece of the opponent, one says that the King is in check. It is not allowed to make a move, such that ones King is in check after the move.

* Checkmate - When a player is in check, and he cannot make a move such that after the move, the King is not in check, then he is mated. The player that is mated loses the game, and the player that mates him wins the game.

* Stalemate - When a player cannot make any legal move, but he is not in check, then the player is said to be stalemated. In a case of a stalemate, the game is a draw.

## Starter
The game starts off with a main menu screen. We decided to create a theme based game. The theme is Marvel vs. DC with Marvel being the white designated set of pieces and DC being the black designated set of pieces. As soon as the game is opened, the starter menu will pop open.

**Code for Starter Menu:**

```javascript
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
  textAlight(CENTER);
  textFont(title);
  text("CHESS: DC v. MARVEL", width/2, 400);
  textFont(description);
  text("PRESS ANY KEY TO START THE GAME", width/2, 450);
  }
``` 

### This is what the start menu would look like:

![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/versus.png "Logo Title Text 1")

## Game

In Chess, the white set (in this case the Marvel pieces) is always first to move. Movement is required every round. A player may not opt to skip his or her turn ever.

**Code For Main Chess Game Entry Point:**

```javascript
public class Chess {
  public static void main(String[] args) {
s    private Board board = new Board();
    private Player marvel;
    private Player dc;
    public Chess() {
      super();
    }
    
    public void setColorMarvel(Player player) {
      this.marvel = player;
    }
    public void setColorDc(Player player) {
      this.dc = player;
    }
    public Board getBoard() {
      return board;
    }
    public void setBoard(Board board) {
      this.board = board;
    }
    public Player getMarvel() {
      return marvel;
    }
    public void setMarvel(Player marvel) {
      this.marvel = marvel;
    }
    public Player getDc() {
      return dc;    
    }
    public void SetDc(Player dc) {
      this.dc = dc;
    }
    
    public boolean initializeBoardGivenPlayer() {
      if(this.dc == null || this.marvel == null) {
        return false;
      }
      this.board = new Board();
      for(int i=0; i<dc.getPieces().size(); i++) {
        board.getSpot(dc.getPieces().get(i).getX(), dc.getPieces().get(i).getY()).occupySpot(dc.getPieces().get(i));
      }
      return true;
    }
  }
}
```

## Playing Screen

#### When the actual playing screen loads it would look something like this:
  The first is an example of the mockup using the actual pictures of the characters.
  
![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/figuresmockup.png "Logo Title Text 1")

  But the game will actually utilize the logos of each of the characters as seen below.
  
![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/logosmockup.png "Logo Title Text 1")

### Board

A chessboard is a type of checkerboard. It consists of 64 squares (eight rows and eight columns). The squares are arranged in two alternating colors (light and dark).

**Code for Board:**

```javascript
public class Board {
  private Spot[][] spots = new Spot[8][8];
  public Board() {
    super();
    for(int i=0; i<spots.length; i++) {
      for(int j=0; j<spots.length; j++) {
        this.spots[i][j] = new Spots(i, j);
      }
    }
  }
  public Spot getSpot(int x, int y) {
    return spots[x][y];
  }
}
```

### Spot

Pieces other than pawns capture in the same way they move. A capturing peice replaces the opponent's piece on its square, except for an _en passant_ capture. Captured pieces are immediately removed from the game. A square may hold ony one piece at any given time. 

**Code for Spot:**

```javascript
apublic class Spot {
  int x, y;
  Piece piece;
  
  public Spot(int x, int y) {
    super();
    this.x = x;
    this.y = y;
    piece = null;
  }
  
  public void occupySpot(Piece piece) {
    //if there's already a piece there, delete it (taking away the piece)
    if(this.piece != null) {
      this.piece.setAvailable(false);
    }
    //place piece there
    this.piece = piece;
  }
  public boolean isOccupied() {
    if(piece != null) {
      return true;
    }
    return false;
  }
  
  public Piece releasedSpot() {
    Piece releasedPiece = this.piece;
    this.piece = null;
    return releasedPiece;
  }
}
```

## Players

Chess involves two players. Players take turns alternating moving one piece at a time (except in the case of the castle maneuver).

**Code for Player:**

```javascript
public class Player {
  public final int PAWNS = 8;
  public final int BISHOPS = 2;
  public final int ROOKS = 2;
  public final int KNIGHTS = 2;
  public boolean marvel;
  
  private List<Piece> pieces = new ArrayList<>();
  
  public Player(boolean marvel) {
    super();
    this.marvel = marvel;
  }
  
  public List<Piece> getPieces() {
    return pieces;
  }
  
  public void initializePieces() {
    if(this.marvel == true) {
      for(int i=0; i<PAWNS; i++) { // draw pawns
        pieces.add(new Pawn(true, i, 2));
      } 
      pieces.add(new Rook(true, 0, 0));
      pieces.add(new Rook(true, 7, 0));
      pieces.add(new Bishop(true, 2, 0));
      pieces.add(new Bishop(true, 5, 0));
      pieces.add(new Knight(true, 1, 0));
      pieces.add(new Knight(true, 6, 0));
      pieces.add(new Queen(true, 3, 0));
      pieces.add(new King(true, 4, 0));
    } else {
      for(int i=0; i<PAWNS; i++) { // draw pawns
        pieces.add(new Pawn(true, i, 6));
      }
      pieces.add(new Rook(true, 0, 7));
      pieces.add(new Rook(true, 7, 7));
      pieces.add(new Bishop(true, 2, 7));
      pieces.add(new Bishop(true, 5, 7));
      pieces.add(new Knight(true, 1, 7));
      pieces.add(new Knight(true, 6, 7));
      pieces.add(new Queen(true, 3, 7));
      pieces.add(new King(true, 4, 7));
    }
  }
}
```

## Piece

All the separate chess piece classes in this game use inheritance from the class Piece below. There are a total of sixteen pieces per player: one King, one Queen, two Bishops, two Knights, two Rooks, and eight Pawns. Each player controls their own set and may not play or use the other player's set.

**Code for Main Piece Class:**

```javascript
public abstract class Piece {
  private boolean available;
  private int x;
  private int y;
  
  public Piece(boolean available, int x, int y) {
    super();
    this.available = available;
    this.x = x;
    this.y = y;
  }
  
  public abstract boolean isAvailable() {
    return available;
  }
  public void setAvailable(boolean available) {
    this.available = available;
  }
  public abstract int getX() {
    return x;
  }
  public void setX(int x) {
    this.x = x;
  }
  public abstract int getY() {
    return y;
  }
  pubic void setY(int y) {
    this.y = y;
  }
  
  public abstract boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(toX == fromX && toY == fromY) {
      return false; //move nothing
    }
    if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7) {
      return false;
    }
    return true;
  }
}
```

### The Characters on the DC side are:

* Martian Manhunter - as the king.

* Wonder Woman - as the queen.

* SuperGirl - as the bishop.

* Batman - as the knight.

* Superman - as the rook.

* Flash - as the pawn.

### The Characters on the Marvel side are:

* Captain America - as the king.

* Captain Marvel - as the queen.

* Black Widow - as the bishop.

* Wolverine - as the knight.

* Iron Man - as the rook.

* Hawkeye - as the pawn.

## Here are the rules for the pieces:

* King - The king moves only one square in any direction: horizontally, vertically, or diagonally. The king can do a special move called castling but it may only be done with the use of the rook. The king is the most important piece of the game, and moves must be made in such a way that the king is never in check. If in check, the king must move and not any other piece.

* Queen - The queen has combined moves of the rook and bishop so i.e. it can move horizontally, diagonally, and vertically.

* Bishop - The bishop moves diagonally and only on the color it starts off on. It may not jump over pieces.

* Knight - The knight makes a move that consists of first one step in a horizontal or vertical direction, and then one step diagonally in an outward direction.

* Rook - The rook moves in a straight line, whether it's horizontal movement or vertical. It cannot move diagonally.

* Pawn - The pawn moves differently regarding whether it moves to an empty square or wheter it takes a piece of the opponent. When a pawn does not take, it moves one square forward. When the pawn has not moved at all, i.e., the pawn is still at the second row (from the owning player's view), the pawn may make a double step straight forward. When taking, a pawn goes one square diagonally forward.

### Special Moves:

#### Castling - Under certain, special rules, a King and Rook can move simultaniously in a castling move. The following conditions must be met:

- The king that makes the castling move has not yet moved in the game.
  
- The rook that makes the castling move has not yet moved in the game.

- The king is not in check.

- The king does not move over a square that is attacked by an enemy piece during the castling move, i.e., when castling, there may not be an enemy piece that can move (in case of pawns: by diagonal movement) to a square that is moved over by the king.

- The king does not move to a square that is attacked by an enemy piece during the castling move, i.e., you may not castle and end the move with the King in check.

- All squares between the rook and king before the castling move are empty.

- The king and rook must occupy the same rank (or row).

- When castling, the king moves two squares towards the rook, and the rook moves over the king to the next square.

#### _En passant_ - This is perhaps the most obscure and least used move in chess is called _en passant_.

- It can only occur when a player excersizes his option to move his pawn two squares on its initial movement and that move places his pawn next to the opponent's pawn.

- When this happens, the opposing player has the option to use his pawn to take the moved pawn "en passant" or "in passing" as if the pawn had only moved one square.

- This option, though, only stays open for one move.

**Code for King Piece with Castling Move:**

```javascript
public class King extends Piece {
  public booelan moved;
  public boolean castle;
  public King(boolean available, int x, int y) {
    super(available, x, y);
    this.moved = false;
    this.castle = false;
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if(Math.abs(toX - fromX) > 1 || Math.abs(toY - fromY) > 1) {      
      if (moved) {
        return false;
      }
      return false;
    }
  }
}

if(fromY - toY == 2 && fromX == toX) {
  if(board[fromX][fromY + 1] != null || board[toX][toY + 2] != null) {
    castle = false;
    return false;
  }
} else if (fromY - toY == 3 && fromX == toX) {
  if(board[toX][fromY - 1] != null || board[toX][fromY - 2] != null || board[toX][fromY - 3] != null) {
    castle = false;
    return false;
  }
} else {
  castle = false;
  return false;
}
castle = true;
//moved = true;
return true;
```

**Code for Queen Piece:**

```javascript
public class Queen extends Piece {
  public Queen(boolean available, int x, int y) {
    super(available, x, y);
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    // diagonal stuff
    if(toX - fromX == toY - fromY) {
      return true;
    }
    if(toX == fromX) {
      return true;
    }
    if(toY == fromY) {
      return true;
    }
    return false;
  }
}
```

**Code for Bishop Piece:**

```javascript
public class Bishop extends Piece {
  public Bishop(boolean available, int x, int y) {
    super(available, x, y);
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if(toX - fromX == toY - fromY) {
      return true;
    }
    return false;
  }
}
```

**Code for Knight Piece:** 

```javascript
public class Knight extends Piece {
  public Knight(boolean available, int x, int y) {
    super(available, x, y);
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if(toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2) {
      return false;
    }
    if(toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1) {
      return false;
    }
    return false;
  }
}
```

**Code for Rook Piece with Castling Move:**

```javascript
public class Rook extends Piece {
  public boolean moved;
  public boolean castle;
  public Rook(boolean available, int x, int y) {
    super(available, x, y);
    this.moved = false;
    this.castle = false;
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if(Math.sqrt(Math.pow(Math.abs((toX - fromX)),2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
      return false;
    }
    if(Math.abs(toX - fromX) > 1 || Math.abs(toY - fromY) > 1) {
      if(moved) {
        return false;
      }
      if(toX == fromX) {
        return true;
      }
      if(toY == fromY) {
        return true;      }
      return false;
    }
  }
}

if(fromY - toY == 2 & fromX == toX) {
  if(board[fromx][fromY + 1] != null || board[toX][toY + 2] != null) {
    castle = false;
    return false;
  }
} else if(from Y - toY == 3 && fromX == toX) {
  if(board[toX][fromY - 1] != null || board[toX][fromY - 2] != null || board[toX][fromY - 3] != null) {
    castle = false;
    return false;
  }
} else {
  castle = false;
  return false;
}
castle = true;// moved = true;
return true;
```

**Code for Pawn Piece with _En Passant_ Move:**

```javascript
public class Pawn extends Piece {
  public boolean hasMoved;
  public boolean ep_able;
  public boolean switch;
  public Pawn(boolean available, int x, int y) {
    super(available, x, y);
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(fromX == toX) {
      if(board[fromY + 1][fromX] != null) {
        return false;
      }
    } else {
      if(board[fromY - 1][fromX] != null) {
        return false;
      }
    }
    if(Math.abs(toY - fromY) > 2) {
      return false;
    } else if(Math.abs(toY - fromY == 2)) {
      if(hasMoved) {
        return false;
      }
      if(toX + 1 < 8) {
        if(board[toY][toX + 1] != null) {
          if(board[toY][toX + 1].getClass().isInstance(new Pawn ("marvel"))) {
            ep_able = true;
          }
        }
      }
    }
  } else {
    if(Math.abs(toX - fromX) != 1 || Math.abs(toY - fromY) != 1) {
      return false;
    }
    if(board[toY][toX] == null) {
      return false;
    }
  }
  return true;
}
```

## End Menu

Chess ends as soon as one player get the opponent's king in checkmate, or when the game ends in a draw. As soon as this happends, the screen will change from the chessboard graphics to an end game graphic.

**The Following is Code for if the Game will end with the Marvel Winning:**

```javascript
PImage gameover;
PFont title;
PFont description;
int screenX, screenY, stage;

void setup() {
  size(1920, 1080);
  screenX = round(width);
  screenY = round(height);
  size(sreenX, screenY);
  gamover = loadImage("Versus.png");
  image(gameover, 0, 0, screenX, screenY);
  title = createFont("Anurati-Regular", 80, true);
  description = createFont("Anurati-Regular", 30, true);
}

void draw() {
  textAlign(CENTER);
  textFont(title);
  text("MARVEL WINS", width/2, 310);
  text("GAME OVER", width/2, 400);
  textFont(description);
  text("YOU ARE NOW A LOSER", width/2, 450);
}
```
**This is how it would look*

![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/marvelwins.png "Logo Title Text 1")

**The Following is Code for if the Game will end with DC Winning:**

```javascript
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
  textAlight(CENTER);
  textFont(title);
  text("DC WINS", width/2, 310);
  text("GAME OVER", width/2, 400);
  textFont(description);
  text("YOU ARE NOW A LOSER", width/2, 450);
}
```

**This is how it would look like**

![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/dcwins.png "Logo Title Text 1")

**The Following is Code for if the Game will end in a Draw:**

```javascript
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
```

**This is how it would look like**

![alt text](https://nastassjamotro.github.io/Programming-1-Portfolio/draw.png "Logo Title Text 1")

## THE END :)

# Hope you enjoy our game! :)
