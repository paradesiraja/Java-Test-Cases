interface Example{
	void m3();
}

class A{
	Example m1(){
		class B implements Example{
			public void m3(){
				System.out.println("B m3");
			}
		}
		B b=new B();
		m2(b);
		return b;
	}
	void m2(Example e){
		e.m3();
	}
}