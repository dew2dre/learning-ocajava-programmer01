
package week03practical.scopeofvar;

class Ball{
	//double radius = 10.4;
	String color = "blue";
	//static double radius = 100.8;
	double radius = 7.5;
	
	void deflate() {
		--radius;
		//line 1
	}
	/*
	static void changeColor(){
		color = "green";
		//line 2
	}*/
/*	void move(double radius){
		double radius = 10.4;
	}
	
	void move(){
		double radius = 10.4;
	}*/
	public static void main(String...args){
		Ball b1 = new Ball();
		b1.deflate();
		System.out.println(b1.radius);
	}
}
