package com.singapore.bpm.taskautomation.primary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.singapore.bpm.taskautomation.DTO.User;

//Adding comments direct on server
public class TaskAssignment {
     // new local changes to push to remote
	
    private static final Logger logger = LogManager.getLogger(TaskAssignment.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new TaskAssignment().TaskAssignmentProcess();
	}
	
	
	public void TaskAssignmentProcess(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = (User)context.getBean("userBeanID");
		
		System.out.println("--usrname--" + user.getUsername());
		System.out.println("--password--" + user.getPassword());

		logger.trace("--trace1--");
		logger.debug("--debug1--");
		logger.info("--info1--");
		logger.warn("--warn1--");
		logger.error("--error1--");
		logger.fatal("--fatal1--");
    
	}

}
