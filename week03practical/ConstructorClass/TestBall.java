package week03practical.constructorclass;

class Ball {
	int radius = 10;
	
	//public,public - results: print radius:20
	//public, private - results: print radius:20 works cause it can access the private method from within the class
	//private, public - only the public constructor is accessible, and therefore it gives a compile error of parameter args
	//private, private - compile error cause even it can't access the private constructors.
	//public, protected - compile successful & prints 20
	//protected, public - compile successful & prints 20 cause accessibility is within package
	//protected, protected -  compile successful & prints 20 cause accessibility is within package
	//default,default - compile successful & prints 20 cause accessibility is within package
	
	//public Ball
	 Ball(){
		this(20);
	}
	 Ball(int size){
		radius = size;
	}
}

class TestBall{
	public static void main(String args[]){
		Ball s = new Ball();
		System.out.println(s.radius);
	}

}