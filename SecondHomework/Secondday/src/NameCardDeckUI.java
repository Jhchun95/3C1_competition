
public class NameCardDeckUI {
	public NameCardDeck namecardDeck;
	
	public NameCardDeckUI() {
		namecardDeck = new NameCardDeck();
	}
	public void recordNameCard() {
		namecardDeck.recordNamecard( new NameCard( "Hong", "010-1234-5678", "Hong@korea.com" ) );
		namecardDeck.recordNamecard( new NameCard( "Kim", "010-5678-1234", "Kim@korea.com" ) );
		namecardDeck.recordNamecard( new NameCard( "Lee", "010-4567-9876", "Lee@korea.com" ) );
		namecardDeck.recordNamecard( new NameCard( "Hong", "010-2468-1357", "Hong@gmail.com" ) );
	}
	public void searchNameCard() {
		for( NameCard namecard : namecardDeck.searchNamecard( "Hong") ) {
			namecard.printNamecard();
		}
	}
	public void deleteNameCard() {
		namecardDeck.deleteNamecard( "Hong", "010-2468-1357" );
	}
	public void printNameCardDeck() {
		namecardDeck.printNamecardDeck();
	}
}
