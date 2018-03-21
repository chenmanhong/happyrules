package org.work.servet;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.work.Dao.Empdao;
import org.work.pojo.Computer;
import org.work.pojo.Iphone;

@Service

public class Computersss {

	@Resource
	private Empdao ed;
	
	public List<Computer> SearchAll(String sql) {
		
		List<Computer> list = ed.SearchAll(sql);
		return list;
		
		
	}

	public void del(Integer id) {

               ed.del(id);
		
	}

	public void add(Computer computer) {

        ed.Add(computer);
		
	}

	public List<Computer> SearchByid(Integer cid) {
		 List<Computer> list= ed.SearchByid(cid);
		return list;
	}

	public void Update(Computer computer) {
		  ed.Update(computer);
		System.out.println("ÕâÊÇÐÞ¸Ä");
	}

}
