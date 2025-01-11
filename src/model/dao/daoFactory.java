package model.dao;

import db.DB;
import model.dao.implement.SellerDaoJDBC;

public class daoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
