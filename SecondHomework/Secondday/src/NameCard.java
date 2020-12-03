class NameCard {
	// Field
	// class field(static field, compile矫 积己)
	public static int count;
	
	// instance field(instance 积己矫 积己)
	private String name;
	private String tel;
	private String email;
	
	// class field 檬扁拳
	static {
		count = 0;
	}
	
	// class method
	public static void addCount() {
		++count;
	}
	public static void subtractCount() {
		--count;
	}
	public static void printCount() {
		System.out.println( "NameCard instance count : " + count );
	} 
	
	// Constructor
	public NameCard() {	// default 积己磊
		name = null;
		tel = null;
		email = null;
	}
	
	// 老馆 积己磊
	public NameCard( String name ) {
		this( name, new String(""), new String("") );
	}
	public NameCard( String name, String tel ) {
		this( name, tel, new String("") );
	}	
	public NameCard( String name, String tel, String email ) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		NameCard.addCount();
	}
	
	// get Method
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	// 老馆 Method
	public void printNamecard() {
		System.out.printf( "%-10s %-11s %-30s\n", name, tel, email );
	}
}
