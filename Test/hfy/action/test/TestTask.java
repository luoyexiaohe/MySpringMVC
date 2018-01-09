package hfy.action.test;

import org.springframework.stereotype.Component;

@Component("TestTask")
public class TestTask {

	public TestTask() {
		// TODO Auto-generated constructor stub
		System.out.println("TestTask");
	}
	public void task1() {
		System.out.println("task1 si runing !");
	}
}
