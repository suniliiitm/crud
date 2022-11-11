

class Example{

	static void m1(){
		System.out.println("m1  executed from example");
	}
	void m2(){
		System.out.println("m2 executed from example");
	}
}
class Sample extends Example{
	static void m1(){
		System.out.println("m1 executed from sample");
	}
	void m2(){
		System.out.println("m2 executed from sample");
	}
}


class Test07{
		public static void main(String[] args){
			Example e1 = new Example();
			//e1.m1();
			e1.m2();
			Example e2 = new Sample();
			//e2.m1();
			e2.m2();
		 }
		}



