class A 
{
	int x=10;
	static class B
	{
		static final int x=50;
		void m1(){
			System.out.println(x);
			System.out.println(this.x);
			A a=new A();

			System.out.println(a.x);
		}
		void m2(){
			int x=60;
			System.out.println(x);
			System.out.println(this.x);
            A a=new A();
			System.out.println(a.x);
		}
	}
	void m3(){
		System.out.println(x);

         B b=new B();
		System.out.println(b.x);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.m3();

		A.B b=new A.B();
		b.m1();
		b.m2();

		System.out.println("Hello World!");
	}
}
