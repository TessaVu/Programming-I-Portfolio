# Chess Game

This program is just supposed to replicate the design of a chess game like one you would find on an app on your phone or on the computer. It's not as fancy with as many special effects as some other games but it's good and chill and basic.

# Rules

Two player game. One person controls the black set of pieces and the other player controls the white set of pieces. The goal of the game is to get the other player's King into checkmate.

# Pieces

* Rook - the rook moves in a straight line, whether it's horizontal movement or vertical. It cannot move diagonally.

* Bishop - the bishop moves diagonally and only on the color it starts off on. It may not jump over pieces.

* Queen - the queen has combined moves of the rook and bishop so i.e. it can move horizontally, diagonally, and vertically

* Knight - The knight makes a move that consists of first one step in a horizontal or vertical direction, and then one step diagonally in an outward direction.

* Pawn - The pawn moves differently regarding whether it moves to an empty square or whether it takes a piece of the opponent. When a pawn does not take, it moves one square straight forward. When this pawn has not moved at all, i.e., the pawn is still at the second row (from the owning players view), the pawn may make a double step straight forward. When taking, the pawn goes one square diagonally forward.

* King - The king moves one square in any direction, horizontally, vertically, or diagonally. The king can do a special move called castling but it may only be done with the use of the rook. The king is the most important piece of the game, and moves must be made in such a way that the king is never in check. If in check the king must move and not any other piece.

# Moves

* Castling - Under certain, special rules, a king and rook can move simultaneously in a castling move. The following conditions must be met:
*        The king that makes the castling move has not yet moved in the game.
*        The rook that makes the castling move has not yet moved in the game.
*        The king is not in check.
*        The king does not move over a square that is attacked by an enemy piece during the castling move, i.e., when castling, there may not be an enemy piece that can move (in case of pawns: by diagonal movement) to a square that is moved over by the king.
*        The king does not move to a square that is attacked by an enemy piece during the castling move, i.e., you may not castle and end the move with the king in check.
*        All squares between the rook and king before the castling move are empty.
*        The King and rook must occupy the same rank (or row).
*        When castling, the king moves two squares towards the rook, and the rook moves over the king to the next square

# Check, checkmate, and stalemate

* check - When the king of a player can be taken by a piece of the opponent, one says that the king is in check. It is not allowed to make a move, such that ones king is in check after the move.

* checkmate - When a player is in check, and he cannot make a move such that after the move, the king is not in check, then he is mated. The player that is mated lost the game, and the player that mated him won the game.

* stalemate - When a player cannot make any legal move, but he is not in check, then the player is said to be stalemated. In a case of a stalemate, the game is a draw.

# Other rules

* resign and draw proposals - A player can resign the game, which means that he has lost and his opponent has won. After making a move, a player can propose a draw: his opponent can accept the proposal

* repitition of moves - If the same position with the same player to move is repeated three times in the game, the player to move can claim a draw.

* 50 moves rule - If there are have been 50 consecutive moves of white and of black without: 
*        any piece taken
*        any pawn move
*        then a player can claim a draw.

* Touching pieces - When a player touches one of his own pieces, he must, if possible, make a legal move with this piece. When a player touches a piece of the opponent, he must, if possible, take this piece.


