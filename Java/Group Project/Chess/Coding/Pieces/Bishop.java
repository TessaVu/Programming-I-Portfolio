//Nastassja Motro 04/11/17
//Review and/or edited by Bryn Esperson

public class Bishop extends Piece{

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
