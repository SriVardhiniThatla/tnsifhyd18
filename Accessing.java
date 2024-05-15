package com.sri.vardhini;

public class Accessing {
int a=10;
static int b=20;
void display() {
	System.out.println("It is a instance method");
}
static String staticDisplay() {
	return "It is a static method";
}
public static void main(String[]args) {
	Accessing a1=new Accessing();
	System.out.println(a1.a);
	a1.display();
	System.out.println(Accessing.b);
	System.out.println(Accessing.staticDisplay());
	
}
}
