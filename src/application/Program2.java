package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: findById DEPARTMENT ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n === TESTE 2: findAll DEPARTMENT");
		List<Department> listDep = depDao.findAll();
		listDep.forEach(System.out::println);
		
		System.out.println("\n === TESTE 3: Insert DEPARTMENT");
		Department newDep = new Department(null,"Money");
		depDao.insert(newDep);
		System.out.println("Done! New department created!");
		
		System.out.println("\n === TESTE 4: Update DEPARTMENT");
		newDep = depDao.findById(6);
		newDep.setName("Dinheirão");
		depDao.update(newDep);
		System.out.println("Done! Department updated!");
		
		System.out.println("\n === TESTE 5: Update DEPARTMENT");
		System.out.print("Delete a department: ");		
		depDao.deleteById(sc.nextInt());
		System.out.println("Delete completed!");
		
		

	}

}
