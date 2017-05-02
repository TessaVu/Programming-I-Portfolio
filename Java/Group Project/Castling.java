public class King extends Piece {
  public String color;
	public boolean moved;
	public boolean castle;
  public King(boolean available, int x, int y) {
    super(availabe, x, y);
    this.moved = false;
    this.castle = false;
  }
  
  @Override
  public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
    if(super.isValid(board, fromX, fromY, toX, toY) == false) {
      return false;
    }
    if(Math.sqrt(Math.pow(Math.abs((toX - fromX)),2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)){
      return false;
    }
    return false;
  }
  
}
	


	@Override
	public boolean validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol) {
		
		if(Math.abs(newRow - currentRow) > 1 || Math.abs(newCol - currentCol) > 1){
			
			if(hasMoved){
				return false;
			}
			
			//Do castling logic here
			if(newCol - currentCol == 2 && currentRow == newRow){
				//Castle kingside
				if(board[newRow][currentCol + 1] != null || board[newRow][currentCol + 2] != null){
					castled = false;
					return false;
				}
				
			}else if(currentCol - newCol == 3 && currentRow == newRow){
				if(board[newRow][currentCol - 1] != null || board[newRow][currentCol - 2] != null || board[newRow][currentCol - 3] != null){
					castled = false;
					return false;
				}
				
			}else{
				castled = false;
				return false;
			}
			
			castled = true;
			
		}
		
		//hasMoved = true;
		return true;
	}
	
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return color.charAt(0) + "K";	
	}
	
}
