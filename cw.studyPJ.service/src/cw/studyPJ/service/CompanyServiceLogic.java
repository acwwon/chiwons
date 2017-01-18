package cw.studyPJ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cw.studyPJ.dao.JobDataDao;
import cw.studyPJ.domain.JobData;

@Service
public class JobDateServiceLogic implements JobDataService{
	
	@Autowired
	private JobDataDao jobDataDao;
	
	@Override
	public JobData retrieveByJobDataId(String jobDataId) {

		System.out.println("Service : access");
		
		return jobDataDao.retrieve(jobDataId);
	}

}
