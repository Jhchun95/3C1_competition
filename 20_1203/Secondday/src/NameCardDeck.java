import java.util.ArrayList;

public class NameCardDeck {
	public final int MAX = 100;
	
	private ArrayList<NameCard> namecardDeck;
	
	public NameCardDeck() {
		namecardDeck = new ArrayList<NameCard>();
	}
	
	public boolean recordNamecard( NameCard namecard ) {
		boolean result = false;
		if ( NameCard.count < MAX ) {
			namecardDeck.add( namecard );
			result = true;
		}
		
		return result;
	}
	public void deleteNamecard( String name, String tel ) {
		NameCard namecard;
		
		for ( int i = 0; i < namecardDeck.size(); ++i ) {
			namecard = namecardDeck.get( i );
			if ( namecard.getName().equals( name ) &&
				 namecard.getTel().equals( tel ) ) {
				namecardDeck.remove( i );
				NameCard.subtractCount();
				break;
			}
		}
	}
	
	public ArrayList<NameCard> searchNamecard( String name ) {
		ArrayList<NameCard> result = new ArrayList<NameCard>();
		
		for ( NameCard namecard : namecardDeck ) {
			if ( namecard.getName().equals( name ) ) {
					result.add( namecard );
				}
		}
		
		return result;
	}
	public void printNamecardDeck() {
		for ( NameCard namecard : namecardDeck ) {
			namecard.printNamecard();
		}
		NameCard.printCount();
	}
}
