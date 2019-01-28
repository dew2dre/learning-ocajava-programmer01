package week03practical.objectlifecycle;

class University {
	Exam exam = null;
	public void assignExam(Exam e){
	 exam = e;
	}
}

class Exam {
	String name;
	public void setName(String newName){
		name = newName;
	}
}

class ObjectLife1 {
	public static void main(String args[]){
		Exam myExam = new Exam(); //line 1
		myExam.setName("OCA Java Programmer 1");
		University uni = new University();
		uni.assignExam(myExam);
		myExam = null;
		//line 2
		System.out.println(uni.exam.name);
	}
}
	