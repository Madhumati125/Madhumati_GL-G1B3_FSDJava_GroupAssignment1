package DriverClass;

import Superdeparment.AdminDepartment;
import Superdeparment.TechinalDepartment;
import Superdeparment.hrdepartment;

public class DriverClass {
	public static void main(String[] args) {
		AdminDepartment obj1=new AdminDepartment();
		hrdepartment obj2=new hrdepartment();
		TechinalDepartment obj3=new TechinalDepartment();
		
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodayWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayisholiday());
		System.out.println(" ");
		System.out.println(obj2.departmentName());
		System.out.println(obj2.getTodayWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.Doactivity());
		System.out.println(obj2.isTodayisholiday());
		System.out.println(" ");
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodayWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.GetTakeStackInfo());
		System.out.println(obj3.isTodayisholiday());
		}
	
	
	

}