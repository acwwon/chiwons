package cw.studyPJ.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cw.studyPJ.domain.JobData;
import cw.studyPJ.service.JobDataService;

@Controller
@RequestMapping("/jobdata")
public class JobDataController {
	
	@Autowired
	JobDataService jobDataService; 
	
	@RequestMapping("/main.do")
	public ModelAndView mainViewer(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main/main.jsp");
		
		JobData jobData = jobDataService.retrieveByJobDataId("nextree");
		
		mav.addObject("jobData", jobData);
		
		return mav;
	
	}
}
