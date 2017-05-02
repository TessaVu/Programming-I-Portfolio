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
	if(Math.sqrt(Math.pow(Math.abs((toX - fromX)),2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
		return false;
	}
		if(moved) {
			return false;
		}
	return false;
}
//
if(fromY - toY == 2 && fromX == toX) {
	if(board[fromX][fromY + 1] != null || board[toX][toY + 2] != null) {
		castle = false;
		return false;
	}
		} else if(fromY - toY == 3 && fromX == toX){
			if(board[toX][fromY - 1] != null || board[toX][fromY - 2] != null || board[toX][fromY - 3] != null){
				castle = false;
				return false;
				}
				
			} else {
				castle = false;
				return false;
			}
			
			castle = true;
			
		}
		
		//moved = true;
		return true;
	}
	
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return color.charAt(0) + "K";	
	}
	
}
