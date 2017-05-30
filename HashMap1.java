import java.util.*;
public class HashMap1 {
	public static void main(String args[]){
		HashMap<Integer, String> employee= new HashMap<Integer, String>();
		Details d1= new Details(100, "Amit");
		Details d2= new Details(101, "Vijay");	//Creating new Object for every new Empname
		Details d3= new Details(102, "Rahul");
		employee.put(d1.EmpCode,d1.EmpName);  	//putting empcode as key and empname as value
		employee.put(d2.EmpCode,d2.EmpName);  
		employee.put(d3.EmpCode,d3.EmpName);
		System.out.println("Employee names are:");
		for(Map.Entry m:employee.entrySet()){  
			System.out.println(m.getValue());  		//displaying names of the employee
		}  
	}
}
class Details{	
	int EmpCode;
	String EmpName;
	char Opt='y';
	public Details(int EmpCode,String EmpName){	//parameterized constructor for setting empcode and emp name 
		this.EmpCode=EmpCode;		
		this.EmpName=EmpName;
		
	}
}