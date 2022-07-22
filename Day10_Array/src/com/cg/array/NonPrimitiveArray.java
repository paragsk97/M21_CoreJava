package com.cg.array;
// Non-primitive Array 
class Employee
{
	public int EmpId;
	public String EmpName;
	//constructor to initialize the value
	Employee(int id, String Name)
	{
		EmpId = id;
		EmpName = Name;
	}
}
public class NonPrimitiveArray {

	public static void main(String[] args) {
		//declare an array of class type
		Employee arr[] = new Employee[3];
		arr[0] = new Employee(101,"Parag");
		arr[1] = new Employee(102,"Mahendra");
		arr[2] = new Employee(103,"Vaibhav");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at "+i+ "th "+ " index is "+arr[i].EmpId + "  "+arr[i].EmpName);
		}
	}

}
