package com.tnsif.lambdaexpression;

//to demo lambda expressions for multi-t

public class TestDemo {
public static void main(String[] args) {
	
	Runnable basic=()->{ String threadname=Thread.currentThread().getName();
	System.out.println("Threadname"+threadname);};
	
	// instantiation 2 thread

	Thread t1=new Thread(basic);
	Thread t2=new Thread(basic);
	
	t1.start();
	t2.start();
}
	
}
