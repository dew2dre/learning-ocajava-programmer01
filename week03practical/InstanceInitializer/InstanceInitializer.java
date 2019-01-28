package week03practical.instanceinitializer;

class Ball{				//line 1
	int radius = 10;	//line 2
	//System.out.println("radius = 10");
	Ball(){				//line 3
		System.out.println("radius = 20");
		radius = 20;	//line 4
	}					//line 5
	{					//line 6
		System.out.println("radius = 30");
		radius = 30;	//line 7
	}					//line 8
}						//line 9

class TestBall {
	public static void main(String args[]){
		Ball b = new Ball();
		System.out.println(b.radius);
	}
}