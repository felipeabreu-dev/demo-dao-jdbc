package application;

import model.dao.DepartmentDao;
import model.dao.daoFactory;
import model.entities.Department;

public class DepartmentDaoTest {

	public static void main(String[] args) {
		DepartmentDao departmentDao = daoFactory.createDepartamentDao();
		
		/*System.out.println("\n==== TESTE 1: Department insert ====");
		Department department = new Department(null, "Smartphones");
		departmentDao.insert(department);
		System.out.println("Inserted! Department id: " + department.getId());*/
		
		System.out.println("\n==== TESTE 2: Department find by id ====");
		 Department dep = departmentDao.findById(1);
		 System.out.println(dep);
	}

}
