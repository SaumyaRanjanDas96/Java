package qspjava;

class SingleLevelInheritance{ 
void eat(){
	System.out.println("eating...");} 
} 
class Dog extends SingleLevelInheritance{ 
void bark(){
	System.out.println("barking...");
	} 
} 
class TestInheritance{ 
public static void main(String args[]){ 
Dog d=new Dog(); 
d.bark(); 
d.eat(); 
}}
