package com.peazh.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/* @Controller == Controller
 * @Service    == Service
 * @Repository == DAO
 */

@Repository
public class BoardDAO {
	
	//DB랑 연결~
	@Autowired
	private BoardDAO boardDAO;
	// Controller -> Service -> DAO -> sqlSession -> DB
	
}
