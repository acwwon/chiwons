package cw.studyPJ.service;

import cw.studyPJ.domain.JobData;

public interface JobDataService {
	
	JobData retrieveByJobDataId(String jobDataId);
}
