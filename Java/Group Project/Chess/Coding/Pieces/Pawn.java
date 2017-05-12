// still working on it

public class Pawn extends Piece {
  
  public boolean hasMoved; // theirs
  
  public boolean ep_able; // "piece allowed to be taken via en passante?" // theirs
  
  public Pawn(String color) { //
    this.color = color;      // theirs
    this.hasMoved = false;   //
  }
  
  public Pawn(boolean available, int x, int y) {
    super(available, x, y);
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(fromX == toX) {
      // not taking a piece
      // if(color.equals("white")) {}
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
    } else if(Math.abs(toY - fromY == 2) {
      // advnacing two spaces at beginning
      if(hasMoved) { // hasMoved is a boolean made before
        return false;
      }
      
      //En passante
      if(toX + 1 < 8) {
        if(board[toY][toX + 1] != null) {
          if(board[toY][toX + 1].getClass().isInstance(new Pawn("white"))){
            ep_able = true;
          }
        }
      } else if(toX - 1 > 0) {
        if(board[toY][toX - 1] != null) {
          if(board[toY][toX - 1].getClass().isInstance(new Pawn("white"))){
            ep_able = true;
          }
        }
      }
    }
  } else {
    // taking a piece
    if(Math.abs(toX - fromX) != 1 || Math.abs(toY - fromY) != 1) {
      return false;
    }
    
    if(board[toY][toX] == null) {
      /*if(toY - 1 > 0) {
        if(toX - 1 > 0) {
        if(board[toY][toX - 1} !- null) {
        if() {
        
        }
        }
        }
        }*/
      return false;
    }
  }
              
  return true;
}
