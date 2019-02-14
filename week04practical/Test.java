package week04practical;


class Test{
	public static void main(String...args){
		String n1 = "eJava";
		String n2 = "eJava";
		String n3 = new String("eJava");
		String n4 = new String("eJava");
		
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
		System.out.println(n1 == n3);
		System.out.println(n1.equals(n3));
		
		CharSequence name = "Carlos";
		
		//StringBuilder name1 =  new StringBuilder("Carlos");
		
		StringBuilder name1 =  new StringBuilder(name);
		
		
	}
}