package com.mycom.myap;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public TestVO select(TestVO vo) {
		
		return (TestVO) my.selectOne("Test.select", vo);
	}
	
	public List<TestVO> selectAll(){
		return  my.selectList("Test.selectAll");
	}
	
}
