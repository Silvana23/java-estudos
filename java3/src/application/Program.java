package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("qual o numero de funcionarios?");
		int n = sc.nextInt();
		
		for (int i =1; i<=n; i++ ) {
			System.out.print("funcionario #" + i + "data:");
			System.out.println("funcionario externo (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("horas trabalhadas");
			int hours =sc.nextInt();
			System.out.println("valor por hora ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.println("renumeracao adicional: ");
				double additionalCharge = sc.nextDouble();
		   list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			
		   
			}else {
				list.add(new Employee (name, hours, valuePerHour));
		}
	}
		System.out.println();
		System.out.println("PAYMENTS : ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));

		}
		
     sc.close();
}
}
