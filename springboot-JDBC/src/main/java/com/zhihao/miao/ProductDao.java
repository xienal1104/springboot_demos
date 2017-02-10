package com.zhihao.miao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addproduct(String name){
		String sql = "insert into product (pname)values('"+name+"')";
		jdbcTemplate.execute(sql);
	}
	
	@Transactional(noRollbackFor=NullPointerException.class)
	public void addProductBatch(String ...names) throws Exception{
		add(names);
	}
	
	@Transactional
	public void add(String ...names) throws Exception{
		for(String name:names){
			String sql ="insert into product (pname)values('"+name+"')";
			jdbcTemplate.execute(sql);
			if("miaozhihao".equals(name)){
				throw new NullPointerException();
			}
		}
	}
}
