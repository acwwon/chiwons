package cw.studyPJ.dao;

import cw.studyPJ.domain.JobData;

public class JobDataDaoLogic implements JobDataDao{

	@Override
	public void create(JobData jobData) {
		
		System.out.println("jobName : " + jobData.getName());
	}

	@Override
	public JobData retrieve(String jobDataId) {
		
		System.out.println("jobDataId : " + jobDataId);
		
		return null;
	}

}
