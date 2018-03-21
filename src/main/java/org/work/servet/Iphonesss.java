package org.work.servet;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.work.Dao.Empdao;
import org.work.Dao.IphoneDao;
import org.work.pojo.Iphone;
@Service

public class Iphonesss {
	@Resource
	
	private IphoneDao id;
	public List<Iphone> SearchAll() {
		List<Iphone> ss=     id.SearchAll();
     
		return ss;
	}

}
