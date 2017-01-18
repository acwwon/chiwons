package cw.studyPJ.dao;

import cw.studyPJ.domain.DetailCompany;

public interface CompanyDao {
	
	void create(DetailCompany jobData);
	DetailCompany retrieve(String jobDataId);
}
