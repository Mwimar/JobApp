package com.mwimar.JobApp.repo;

import com.mwimar.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
        List <JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1,"Java Dev", "Must Know Java",3, Arrays.asList("java", "sql")),
                new JobPost(2,"Backend Dev", "Must Know Backend",3, Arrays.asList("Spring", "sql")),
                new JobPost(3,"SpringBoot", "Must Know SpringBoot",3, Arrays.asList("springboot", "java")),
                new JobPost(4,"Frontend", "Must Know Frontend",3, Arrays.asList("css", "javascript"))
        ));

    public List<JobPost> getallJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

}
