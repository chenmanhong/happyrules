package org.work.conternal;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.work.pojo.Computer;
import org.work.pojo.Iphone;
import org.work.servet.Computersss;
import org.work.servet.Iphonesss;

@Controller
public class Empcontroller {
	  @Resource
	 private Computersss web;
	  @Resource
	 private Iphonesss phone;
	  
	@RequestMapping("zezeze")
	public String  Lucky(ModelMap map,Computer computer){
		 
		  String sql = "select * from computer where 1=1 ";
		  
		   if (computer!=null&&computer.getIphone()!=null&&computer.getIphone().getId()!=null) {
			sql+=" and iphone_id ="+computer.getIphone().getId();
		}
		   if(computer!=null&&computer.getCname()!=null&&!computer.getCname().equals("")){
			   sql+=" and cname like '%"+computer.getCname()+"%'";
		   }
		List<Computer> list = web.SearchAll(sql);
	     List<Iphone>  ls =	 phone.SearchAll();
		
		
		 map.put("iphone", ls);
		 map.put("computer", list);
		return "emp";
		
		
		
	}
	@RequestMapping("del")
	public String lucky1(Integer cid){
		 web.del(cid);
		
		return "redirect:zezeze";
		
	}
	@RequestMapping("updates")
	public String lucky1(Integer cid, ModelMap map){
	
		 List<Iphone>  ls =	 phone.SearchAll();
		List<Computer> list =  web.SearchByid(cid);
		 map.put("asd", list);
		  map.put("happy", ls);
		return "update";
		
		
	}
	@RequestMapping("Add")
	public String lucky2(Computer computer){
		System.out.println(computer);
		web.add(computer);
		
		return "redirect:zezeze";
		
		
	}	
	@RequestMapping("updatesss")
	public String lucky3(Computer computer){
	
		 
		web.Update(computer);
		
		return "redirect:zezeze";
		
		
	}
	

}
