package model.dao;

import model.dao.implement.SellerDaoJDBC;

public class daoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
