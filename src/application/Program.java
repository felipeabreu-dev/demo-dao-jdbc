package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.SellerDao;
import model.dao.daoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = daoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);

		System.out.println("==== TESTE 1: Seller find by id ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TESTE 2: Seller find by department ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 3: Seller find all ====");
		List<Seller> findAll = sellerDao.findAll();
		for(Seller obj : findAll) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 4: Seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! Seller id: " + newSeller.getId());
		
		System.out.println("\n==== TESTE 5: Seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n==== TESTE 6: Seller delete ====");
		System.out.print("Input the id to delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete!");
		
		sc.close();
	}

}
