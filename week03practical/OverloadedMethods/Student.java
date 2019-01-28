package week03practical.overloadedmethods;

class Student {
	public final boolean register(String course, String specialization){
		return true;
	}
	//1. count of it's method parameters
		public final boolean register(String course){
		return true;
	}

	//2. name of it's method parameters
	/*	public final boolean register(String program, String stream){
		return true;
	}*/
	//3. types of it's method parameters
	public final boolean register(float unitCost, boolean isCurrentStudent){
		
		return true;
	}
	//4. return type
	/*	public final boolean register(String course, String specialization){
		return 'true';
	}*/
	//5. access modifiers
			private  boolean register(String course,boolean isCurrentStudent){
		return true;
	}
	//6. non-access modifiers
	final  boolean register(boolean isCurrentStudent,String course){
		return true;
	}
}