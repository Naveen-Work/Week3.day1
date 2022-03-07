package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop Size is 14' Inch");
	}
	
	public static void main(String[] args) {
		
		//Calling Computer class using Desktop class object
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
        //Calling Computer class using Computer class object
		Computer obj1=new Computer();
		obj1.computerModel();
		//obj1.desktopSize(); //this method cannot be called using Computer class object.
		
		//Calling Computer class using Desktop class object
		Computer obj2=new Desktop();
		obj2.computerModel();	
		//obj1.desktopSize(); //this method cannot be called using Computer class object.

	}

}
