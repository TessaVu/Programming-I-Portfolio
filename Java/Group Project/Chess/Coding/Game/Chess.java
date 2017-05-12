//Nastassja Motro

public class Chess {
  private Board board = new Board();
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
  
  publid void setBaord(Board board) {
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
  
  public void setDc(Player dc) {
    this.dc = dc;
  }
  
  public boolean initializeBoardGivenPlayer() {
    if(this.dc == null || this.marvel == null)
      return false;
    this.board = new Board();
    for(int i=0; i<dc.getPieces().size(); i++) {
      board.getSpot(dc.getPieces().get(i).getX(), dc.getPieces().get(i).getY()).occupySpot(dc.getPieces().get(i));
    }
    return true;
  }
  
}
