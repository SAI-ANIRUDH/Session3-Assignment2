package assignment3;// Package declaration is compulsory.
/*
 * This assignment will help to master the Super and this Keywords in Java.
 */

public class assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cylinder c=new cylinder(); // Creating an instance for the class Cylinder.
square p=new square(); // Creating an instance for the class Square.

c.circarea(); // Calling the method for obtaining cricle area.
c.rectarea(); // Calling the method for obtaining rectangle area.
c.Cylinder(); // Calling the method for obtaining the Cylinder area.
	}

}
class Geometry // Creating a class Geometry 
{
	int a =5; // Declaring and initializing the variable a.
	int b=7; // Declaring and initializing the variable b.
	void rectarea() // Declaring void method to find rectangle area. 
	{
		int k= a *b;
		System.out.println("Area of rectangle "+k);
	}
}
class circle extends Geometry // Creating class circle by inheriting properties of Geometry class 
{
	double pi =3.1414;
int a = 4;
	
void circarea() // Declaring the void method to find circle area 
{
	double j = pi * super.a * super.a; // Using Super keyword to use the value of a of the parent class.
	double k = pi * this.a * this.a; // Using this Keyword to use the value of a of the child class.
	System.out.println("Area of circle "+ k);
	System.out.println("Area of circle "+ j);
}
}
class cylinder extends circle // Creating class cylinder by inheriting properties of Circle class
{
int h=4;
void circarea() // Invoking method of the parent class Circle
{
double c=super.pi *  h * h;	
super.circarea(); // Calling the super method to find the area o circle in child class.

	System.out.println("Area of Circle "+c);
}

int d = 6;
	void Cylinder() // Method used to find the area of Cylinder.
	{
		double i = h * h * d;
		System.out.println("Area of Cylinder "+ i);
	}
}

class square extends Geometry // Creating class square by inheriting properties of Geometry class
{
	square(){
	super(); // Calling Super method to find the area of square.
	System.out.println("Area of Square is"+super.b*super.b);
}
}