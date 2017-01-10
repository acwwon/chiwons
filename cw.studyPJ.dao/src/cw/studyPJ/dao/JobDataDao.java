package cw.studyPJ.dao;

import cw.studyPJ.domain.JobData;

public interface JobDataDao {
	
	void create(JobData jobData);
	JobData retrieve(String jobDataId);
}
