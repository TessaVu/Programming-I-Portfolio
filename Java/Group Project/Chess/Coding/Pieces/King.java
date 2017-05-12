//Nastassja Motro 04/11/17
//Reviewed and/or edited by Bryn Esperson

public class King extends Piece {
  public King(boolean available, int x, int y) {
    super(available, x, y);
  }

  @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if (super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if (Math.sqrt(Math.pow(Math.abs((toX - fromX)), 2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
      return false;
    }
    return false;
  }
}
