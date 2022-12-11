package com.singapore.bpm.taskautomation.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.singapore.bpm.taskautomation.DTO.User;

//Adding comments direct on server
public class TaskAssignment {
     // new local changes to push to remote
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new TaskAssignment().TaskAssignmentProcess();
	}
	
	
	public void TaskAssignmentProcess(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = (User)context.getBean("userBeanID");
		
		
		System.out.println("--usrname--"+user.getUsername());
		System.out.println("--password--"+user.getPassword());
	}

}
