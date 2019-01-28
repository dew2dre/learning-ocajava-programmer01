package week03practical.returnedtype;

class Emp {
	public String getName(){
		return "Brian";
	}
	public void printName(){
		System.out.println("Brian");
	}
	
	int calculate(int a, int b){
		return 'c';
	}
	
	public int getAge(){
		return 20;
	}
	
}

class TestEmp {
	public static void main(String args[]){
		Emp emp = new Emp();
		//System.out.println(emp.getName());
		//String name = emp.printName();
		int testCal = emp.calculate(1,20);
		System.out.println(testCal);
		
		double myAge = emp.getAge();
		System.out.println(myAge);
		
	}
}