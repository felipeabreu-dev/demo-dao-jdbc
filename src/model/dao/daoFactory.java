package model.dao;

import db.DB;
import model.dao.implement.DepartmentDaoJDBC;
import model.dao.implement.SellerDaoJDBC;

public class daoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartamentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
