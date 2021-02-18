package Testes;

import org.testng.annotations.Test;

public class Java_Programes {

	
	 String Name;
	int Age;
	String City;
	boolean Pass;
	
	public static double salary=10000;
	public static String name ="Girish";
}

class SessionOne extends SessionTwo {
	@Test(enabled=false)
	public void data_types() {
		
		byte var=126;
		
		System.out.println(var);
		var++;
		System.out.println(var);
		var++;
		System.out.println(var);
		var++;
		System.out.println(var);
		var++;
		System.out.println(var);
	}
	
		
	//@Test()
	
	// declare one method 
	public void StudentDetails() {
		
		int age=98;
		System.out.println("My age is "+ +age);
		
			}
	@Test()
	public void LocalVariable() {
		SessionOne obj= new SessionOne();
		
		
		obj.StudentDetails();
		
	}
	
	@Test()
	public void StudentData() {
		
		SessionTwo stu= new SessionTwo();
		stu.Student1();
		System.out.println("==========================");
		stu.Student2();
	}
	@Test()
	public void acces_data() {
		//SessionTwo.static_var();
		;
		
		System.out.println("max number"+SessionTwo.max_numbers());
	}
	}

class SessionTwo{
	
	
	public void Student1() {
	Java_Programes StudentOne= new Java_Programes();
	System.out.println(StudentOne.Name="Girish");
	System.out.println(StudentOne.Age=42);
	System.out.println(StudentOne.City="banglore");
	System.out.println(StudentOne.Pass=true);
	
	}
	
	public void Student2() {
		Java_Programes StudentOne= new Java_Programes();
		
		
		System.out.println(StudentOne.Name="mahesh");
		System.out.println(StudentOne.Age=33);
		System.out.println(StudentOne.City="Hyderaba");
		System.out.println(StudentOne.Pass=false);
		
		}
	
	public static void static_var() {
		
		int a=10;
		System.out.println(Java_Programes.name+"'s average salary:"+Java_Programes.salary);
		
		
		System.out.println(a+5);
		System.out.println(a+=5);
		System.out.println(a-=5);
	}
	
	public static int max_numbers() {
		
		int[] num= {1,2,5,0,4,6};
		int max =num[0];
		
		for (int i=1; i<num.length;i++) {
			
			
				
				if(num[i]>max) {
					
					max=num[i];
					//return max;
					
					//num[j]=num[i];
										
				
			}
				//System.out.println("max number"+max);
		}
		return max;
		
		
	}
	
}