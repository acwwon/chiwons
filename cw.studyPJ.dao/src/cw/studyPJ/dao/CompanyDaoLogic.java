package cw.studyPJ.dao;

import org.springframework.stereotype.Repository;

import cw.studyPJ.domain.DetailCompany;

@Repository
public class CompanyDaoLogic implements CompanyDao{

	@Override
	public void create(DetailCompany jobData) {
		
		System.out.println("jobName : " + jobData.getName());
	}

	@Override
	public DetailCompany retrieve(String jobDataId) {
		
		System.out.println("JobDAO : access");
		
		DetailCompany jd = new DetailCompany();
		jd.setName("nextree");
		jd.setLocation("가산");
		jd.setDescription("가면 안됨");
		jd.setPay(2200);
		jd.setRoute("KOSTA");
		jd.setSize("small");
		
		return jd;
	}

}
