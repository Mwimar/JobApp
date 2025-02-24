package com.mwimar.JobApp.service;

import com.mwimar.JobApp.model.JobPost;
import com.mwimar.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo service;

    public JobPost addJob(JobPost jobPost){
        service.addJob(jobPost);

        return jobPost;
    };

    public List<JobPost> getAllJobs(){
        return service.getallJobs();
    };
}
