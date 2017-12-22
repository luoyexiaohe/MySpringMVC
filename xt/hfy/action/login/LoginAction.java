package hfy.action.login;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import hfy.action.init.InitSpring;
import hfy.action.init.TestListener;


@Controller
@RequestMapping(value="/login/")
public class LoginAction {

	public LoginAction(){
		System.out.println("login init!");
	}
	@Autowired
	InitSpring spring;
	/**
	 *   返回登陆页面
	 * @author John
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * 2017年10月8日 下午10:00:25
	 */
	@RequestMapping(value="login.do")
	public String login(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		model.addAttribute("msg", "Hello World !");
		spring.test();
		return "/login/Login";
	}
}
