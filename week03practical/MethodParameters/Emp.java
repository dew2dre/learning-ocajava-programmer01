package week03practical.methodparameters;

class Emp {
	public static void print(boolean status) {
		System.out.println(status);
		//return;// "true";
	}
	/*public static boolean getStatus(){
		return "true";
	}*/
	public boolean getStatus1(){
		return true;
		//System.out.println("true");
	}
	public boolean getStatus2(){
		if(10+5 > 15){
			return true;
		}
		else {
			System.out.println("true");
			return false;
		}
	}
	
	public static void main(String args[]){
		//Emp.print(10);
		//System.out.println(Emp.getStatus());
		//Emp.print(10);
		//System.out.println(Emp.print(true));
	}
}