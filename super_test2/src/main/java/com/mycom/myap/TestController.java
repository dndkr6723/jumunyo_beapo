package com.mycom.myap;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@Autowired
	TestDAO dao;
	
	@RequestMapping("select")
	public void select(HttpServletRequest rq, Model model) throws Exception {
		
		/*TestVO svo = dao.select(vo);*/
		int id =Integer.parseInt(rq.getParameter("id"));
		TestVO vo = new TestVO();
		vo.setId(id);

		
		TestVO svo = dao.select(vo);
		model.addAttribute("vo",svo);
		System.out.println("얍");

	}
	
	@RequestMapping("selectAll")
	public void select(Model model) throws Exception {
		
		List<TestVO> list = dao.selectAll();
				
		model.addAttribute("list",list);
		
	}
	
}
