package week03practical.passingobjectsandprimitives;

class Book {
	void assignTitle(StringBuilder title){
		StringBuilder another = title;
		another = new StringBuilder("OCA");
	}
	void modifyTitle(StringBuilder title){
		title.append(" OCA");
	}
}

class TestBook {
	public static void main(String args[]){
		StringBuilder desc1 = new StringBuilder("Java");
		StringBuilder desc2 = new StringBuilder("Oracle");		
		
		Book b = new Book();
		b.assignTitle(desc1);
		b.modifyTitle(desc2);
		
		System.out.println(desc1);
		System.out.println(desc2);

	}
}