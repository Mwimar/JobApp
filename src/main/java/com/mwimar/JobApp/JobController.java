package com.mwimar.JobApp;

import com.mwimar.JobApp.model.JobPost;
import com.mwimar.JobApp.repo.JobRepo;
import com.mwimar.JobApp.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobPosts")  // Ensure this matches the frontend request
@CrossOrigin(origins = "http://localhost:3000")  // Enable CORS
public class JobController {

    private final JobService service;
    private final JobRepo jobRepo;

    public JobController(JobService service, JobRepo jobRepo) {
        this.service = service;
        this.jobRepo = jobRepo;
    }

    // Get all job posts
    @GetMapping
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    // Get job by ID
    @GetMapping("/{id}")
    public JobPost getJobById(@PathVariable int id) {
        return jobRepo.getallJobs().stream()
                .filter(job -> job.getPostId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }

    @PutMapping("/{id}")
    public JobPost updateJob(@PathVariable int id, @RequestBody JobPost updatedJob) {
        JobPost job = jobRepo.getallJobs().stream()
                .filter(j -> j.getPostId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Job not found"));

        job.setPostProfile(updatedJob.getPostProfile());
        job.setPostDesc(updatedJob.getPostDesc());
        job.setReqExperience(updatedJob.getReqExperience());
        job.setPostTechStack(updatedJob.getPostTechStack());

        return job;
    }


    // Add a job post
    @PostMapping
    public JobPost addJob(@RequestBody JobPost jobPost) {
        return service.addJob(jobPost);
    }
}
