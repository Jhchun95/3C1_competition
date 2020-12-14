class NameCard {
	// Field
	// class field(static field, compile�� ����)
	public static int count;
	
	// instance field(instance ������ ����)
	private String name;
	private String tel;
	private String email;
	
	// class field �ʱ�ȭ
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
	public NameCard() {	// default ������
		name = null;
		tel = null;
		email = null;
	}
	
	// �Ϲ� ������
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
	
	// �Ϲ� Method
	public void printNamecard() {
		System.out.printf( "%-10s %-11s %-30s\n", name, tel, email );
	}
}
