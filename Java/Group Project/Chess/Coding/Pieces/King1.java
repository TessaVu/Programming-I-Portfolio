//Nastassja Motro
//Reviewed and/or edited by Bryn Esperson and Tessa Vu (Castling)

public class King extends Piece {
  // Castling edit start.
  public boolean moved;
  public boolean castle;
  // Castling edit end.
  public King(boolean available, int x, int y) {
    super(available, x, y);
    // Castling edit start.
    this.moved = false;
    this.castle = false;
    // Castling edit end.
  }

  @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if (super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if (Math.sqrt(Math.pow(Math.abs((toX - fromX)), 2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
      return false;
    }
    // Castling edit start.
    if (Math.abs(toX - fromX) > 1 || Math.abs(toY - fromY) > 1) {
      if (moved) {
        return false;
      }
      // Castling edit end.
      return false;
    }
  }
}

// Castling edit start.
if (fromY - toY == 2 && fromX == toX) {
  if (board[fromX][fromY + 1] != null || board[toX][toY + 2] != null) {
    castle = false;
    return false;
  }
} else if (fromY - toY == 3 && fromX == toX) {
  if (board[toX][fromY - 1] != null || board[toX][fromY - 2] != null || board[toX][fromY - 3] != null) {
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
// Castling edit end.
