package com.sri.vardhini;

public class Ipl {
String batsman="virat kohli";
static String bowlername="Shami";
void display() {
	System.out.println("great cricketer");
}
static String display1() {
	return "good cricketer"; 
}
public static void main(String[]args) {
	Ipl i1=new Ipl();
	System.out.println(i1.batsman);
	i1.display();
	System.out.println(Ipl.bowlername);
	System.out.println(Ipl.display1());
}
}
