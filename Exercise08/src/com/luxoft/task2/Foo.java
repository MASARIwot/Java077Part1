package com.luxoft.task2;

public class Foo
{
	private int i;
	public Foo(int i){
		this.i = i;
		System.out.println("Number of operation" + this.i);
	}
	
	@Override
	protected void finalize() throws Throwable 
        {
		System.out.println("Finalize is called");
		System.out.println("OLOLO DEAD" + this.i);
		super.finalize();
	}
}
