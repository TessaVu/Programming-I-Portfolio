public class Pawn extends Piece {
  public boolean hasMoved;
  public boolean ep_able;
  public boolean switcharoo; //for when a pawn gets to the other side
  public Pawn(boolean available, int x, int y) {
  }

  @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if (fromX==toX) {
      if (board[fromY+1][fromX]!= null) {
        return false;
      }
    } else {
      if (board[fromY - 1] [fromX] != null) {
        return false;
      }
    }
    if (Math.abs(toY-fromY)>2) {
      return false;
    } else if (Math.abs(toY - fromY == 2)) {
      if (hasMoved) {
        return false;
      }
      if(toX + 1<8){
      if(board[toY][toX+1] !=null){
      if(board[toY][toX+1].getClass().isInstance(new Pawn ("marvel"))){
      ep_able = true;
    }
   }
  }
 }
}else{
  
  if(Math.abs(toX -fromX) !=1 || Math.abs(toY-fromY) !=1){
  return false;
  }
if(board[toY][toX]==null){
return false;
}
 }
return true;

}

/* 
probably going to need a screen of pieces you can choose from for the ol switcharoo,
or just a pop-up of the pieces.- does it count as a turn (do you have to wait)

when you get to point a from point b, pop up on which side of the screen for which player
or does it appear on the same side of the screen for each. do we put the taken pieces on
the side of the person who took them or on the side of the person who lost them?

if we're making the board smaller to compensate for the sidelines, then what are our
exact coordinates for each square and piece. What are our transitions of the movements
for each piece going to look like? Does the piece slide or does it just appear where you 
click?




*/