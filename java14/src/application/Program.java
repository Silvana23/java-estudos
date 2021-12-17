package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o caminho do arquivo: ");
		String Files = sc.nextLine();

		try (BufferedReader br =  new BufferedReader(new FileReader(Files)) ){
		
		System.out.println("digite  o valor base : ");
		Double val =  sc.nextDouble();
		
		
		List<Employee> list = new ArrayList<>();
		
    String line = br.readLine();
		
		while (line != null) {
			String[] fields = line.split(",");
			list.add(new Employee(fields[0] , fields[1], Double.parseDouble(fields[2])));
			line = br.readLine();
			
			
			List<String> emails =  list.stream()
					.filter(x -> x.getSalary() > val)
					.map(x -> x.getEmail())
			 .sorted()
			 .collect(Collectors.toList());
			
			System.out.println("Email de pessoas com salario maior que o base  " + String.format("%.2f", val) + ":");
			emails.forEach(System.out::println);
			
			sc.nextLine();
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			 
			System.out.println("Soma do salario de pessoas que comecam com a letra  'M': " + String.format("%.2f", sum));
			
			
			sc.nextLine();
		}

	} catch(IOException e) {
		System.out.print("Error :" + e.getMessage());
	}
		sc.close();
	}
}
