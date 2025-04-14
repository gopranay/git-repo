package com.java8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection_Example {
	private void showMessage() {
		System.out.println("You are accessed Private methods");
	}

}
class Reflection_Access{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Reflection_Example ex=new Reflection_Example();
		Method method=Reflection_Example.class.getDeclaredMethod("showMessage");
		method.setAccessible(true);
		method.invoke(ex);
		
	}
}