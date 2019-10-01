package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller // Controller에 Component 사용
public class TestActionController {
	@RequestMapping("index.do")
	public ModelAndView handleRequest() { // method 이름은 상관없음. (Annotation 사용 시)
		System.out.println("Annotation-TestActionController 수행");

//		return new ModelAndView("list");
		ModelAndView view = new ModelAndView(); // forwarding
		view.setViewName("list");
		view.addObject("msg", "스프링 : Annotation"); // request.setAttribute("msg", "스프링");
		
		return view;
	}
}