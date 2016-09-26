interface I1
{
	void f1();
}

interface I2
{
   void f2();
}
class C1 implements I1,I2{
	
	public void f1()
	{
		System.out.println("f1() is over ridden");
	}
	public void f2()
	{
		System.out.println("f2() is over ridden");
	}
	void f3()
	{
		System.out.println("f3() is a special method..");
	}
}
class DemoApp{
	public static void main(String[] args) {
		
		C1 o1= new C1();
		o1.f1();
		o1.f2();
		o1.f3();
		System.out.println("=======");
		I1 i1= new C1();
		i1.f1();
		System.out.println("=======");
		I2 i2= new C1();
		i2.f2();
		
	}
}