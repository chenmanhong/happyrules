package org.work.Dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.work.pojo.Computer;
import org.work.pojo.Iphone;

@Repository

public class Empdao {
	
	@Resource
	private SessionFactory sf;

	public List<Computer> SearchAll(String sql) {
	Session session = sf.openSession();		
	 SQLQuery app = session.createSQLQuery(sql).addEntity(Computer.class);
	 List<Computer> list = app.list();
	
	 return list;
	}

	public void del(Integer id) {
		Session session = sf.openSession();
		String sql = "delete from computer where cid ="+id;
		SQLQuery sss = session.createSQLQuery(sql);
		sss.executeUpdate();
	}
	public void Add(Computer computer) {
		Session session = sf.openSession();
		 session.save(computer);
		
	}

	public List<Computer> SearchByid(Integer cid) {
		Session se = sf.openSession();
		String sql = "select * from computer where cid ="+cid;
		SQLQuery sss = se.createSQLQuery(sql).addEntity(Computer.class);
		 List<Computer> list = sss.list();
		return list;
	}

	public void Update(Computer computer) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		 session.saveOrUpdate(computer);
		 System.out.println("");
		 tx.commit();
		
		
	}

	
	
	
}
