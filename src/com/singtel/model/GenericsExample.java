package com.singtel.model;

public class GenericsExample {

	public static void main(String[] args) {

		Test<String> st=new Test<String>("Gaurav");
		System.out.println(st.getObject());
		
		Test<Integer> inetegere=new Test<Integer>(20);
		System.out.println(inetegere.getObject());

		 
	}

}

class Test<T> {
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {

		return this.obj;
	}
}
