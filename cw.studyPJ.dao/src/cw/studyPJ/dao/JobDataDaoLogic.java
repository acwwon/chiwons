package cw.studyPJ.dao;

import org.springframework.stereotype.Repository;

import cw.studyPJ.domain.JobData;

@Repository
public class JobDataDaoLogic implements JobDataDao{

	@Override
	public void create(JobData jobData) {
		
		System.out.println("jobName : " + jobData.getName());
	}

	@Override
	public JobData retrieve(String jobDataId) {
		
		System.out.println("JobDAO : access");
		
		JobData jd = new JobData();
		jd.setName("nextree");
		jd.setLocation("가산");
		jd.setDiscription("가면 안됨");
		jd.setPay(2200);
		jd.setRoute("KOSTA");
		jd.setSize("small");
		
		return jd;
	}

}
