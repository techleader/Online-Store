package com.nayak.app;

public class Test {
	

}

class Parent{
	Parent get(){
		return null;
	}
}

class A extends Parent
{
	Parent get(){
		return new Parent();
	}
}

class B extends Parent{	
	
		//return new A();
	
}
