package application;

import java.util.List;

import model.dao.SellerDao;
import model.dao.daoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = daoFactory.createSellerDao();

		System.out.println("==== TESTE 1: Seller find by id ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TESTE 2: Seller find by department ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
