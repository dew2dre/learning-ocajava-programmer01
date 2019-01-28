package week03practical.returnedtype;

class Emp {
	public String getName(){
		return "Brian";
	}
	public void printName(){
		System.out.println("Brian");
	}
	
	int calculate(int a, int b){
		System.out.println((int)'c');
		return (int)'c';
	}
}

class TestEmp {
	public static void main(String args[]){
		Emp emp = new Emp();
		//System.out.println(emp.getName());
		String name = emp.printName();
		int testCal = emp.calculate(1,20)
		System.out.println(testCal);
		
	}
}