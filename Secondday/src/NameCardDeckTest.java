
public class NameCardDeckTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameCardDeckUI namecardDeckUI = new NameCardDeckUI();	
		
		System.out.println( "append NameCard------------------------------" );	
		namecardDeckUI.recordNameCard();
		namecardDeckUI.printNameCardDeck();
		
		System.out.println( "search NameCard------------------------------" );
		namecardDeckUI.searchNameCard();
		namecardDeckUI.printNameCardDeck();
		
		System.out.println( "delete NameCard------------------------------" );
		namecardDeckUI.deleteNameCard();
		namecardDeckUI.printNameCardDeck();
	}
}
