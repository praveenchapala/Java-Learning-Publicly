package package1;

public class program1 {
	public int a;
	protected int b;
	int c; // default
	private int d;
	void method1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

//package is nothing but grouping related clases inside the project

//public can be accessible anywhere inside class anywhere inside or outside package and finally anywhere inside the whole project

// protected can be accessible inside the same package and child class of another package

//default is also known as package-private acess modifier means it is accessible only inside the package and inside the same class 

//private can be accessible only inside the same class not outside any package or any class

//during inheritance all the members of parent class cannoot be inherited to child class if they are private members of the parent class


package package1;

public class program2 extends program1{
  void method2() {
	  System.out.println(a);//yes
	  System.out.println(b);//yes
	  System.out.println(c);//yes
	  System.out.println(d);//no
  }
}


package package1;
public class program3 {
	
	void method3() {
		program1 pgm1 = new program1();
		System.out.println(pgm1.a);//yes
		System.out.println(pgm1.b);//yes
		System.out.println(pgm1.c);//yes
		System.out.println(pgm1.d);//no
	}

}


package package2;
import package1.program1;
public class program4 extends program1{
void method4() {
	System.out.println(a);//yes
	System.out.println(b);//yes
    System.out.println(c);//no
    System.out.println(d);//no
}
}


package package2;
import package1.program1;
public class program5 {
	void methods5() {
		program1 p1 = new program1();
		System.out.println(p1.a);//yes
		System.out.println(p1.b);//no
		System.out.println(p1.c);//no
		System.out.println(p1.d);//no
	}

}

