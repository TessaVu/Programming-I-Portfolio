public class beer {
	public static void main(String args[]) {
		int beerNum = 99;
		String word = ÒbottlesÓ;
		while(beerNum > 0) {
			if beerNum == 1; {
			word = ÒbottleÓ;
			}
		}
		System.out.println(beerNum + Ò Ó + word + Ò of beer on the wall, Ò + beerNum + Ò Ó + word + Ò of beer.Ó)
		beerNum = beerNum - 1;
		if beerNum > 0 {
			System.out.println(ÒTake one down, pass it around Ò + beerNum + Ò Ó + word + Ò of beer on the wall.Ó)
		}
		if(beerNum == 0) {
			System.out.println(ÒNo more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.Ó)
		}
	}
}