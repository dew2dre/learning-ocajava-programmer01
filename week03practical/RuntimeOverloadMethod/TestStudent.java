package week03practical.runtimeoverloadmethod;

class Student{
	public final boolean register(String course, Object specialization){
		return true;
	}
	public final boolean register(Object course, String specialization){
	return true;
	}
	
}
class TestStudent {
	public static void main(String args[]){
		Student s = new Student();
		s.register("Red","Greenn");
	}
}
