package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: findById DEPARTMENT ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n === TESTE 2: findAll DEPARTMENT");
		List<Department> listDep = depDao.findAll();
		listDep.forEach(System.out::println);
		
		System.out.println("\n === TESTE 2: findAll DEPARTMENT");
		Department newDep = new Department(null,"Money");
		depDao.insert(newDep);
		System.out.println("Done! New department created!");
		
		

	}

}
