package org.work.Dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.work.pojo.Iphone;
@Repository

public class IphoneDao {
	@Resource
	private SessionFactory sf;
	
	public List<Iphone> SearchAll() {
		Session session = sf.openSession();
		String hql="from Iphone ";
		  Query cq = session.createQuery(hql);
		List list = cq.list();
		return list;
	}

}
