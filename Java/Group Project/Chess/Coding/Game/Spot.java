
public class Spot {
  int x;
  int y;
  Piece piece;
  
  public Spot(int x, int y) {
    super();
    this.x = x;
    this.y = y;
    piece = null;
  }
  
  public void occupySpot(Piece piece) {
    // if there's already a piece there, delete it (taking away the piece)
    if(this.piece != null)
      this.piece.setAvailable(false);
    // place piece there
    this.piece = piece;
  }
  
  public boolean isOccupied() {
    if(piece != null)
      return true;
    return false;
  }
  
  public Piece releaseSpot() {
    Piece releasedPiece = this.piece;
    this.piece = null;
    return releasedPiece;
  }

}
