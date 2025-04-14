package com.designpattern.singleton;

public class SingletonExample {
	public static SingletonExample instance=null;
	private SingletonExample() {
		
	}
	public static synchronized SingletonExample getInstance() {
		if (instance==null) {
			instance=new SingletonExample();
		}
		return instance;
		
	}
	void msg() {
		System.out.println("Hello Pranay! This is Singleton Program....");
	}
	public static void main(String[] args) {
		SingletonExample obj=SingletonExample.getInstance();
		obj.msg();
	}

}
