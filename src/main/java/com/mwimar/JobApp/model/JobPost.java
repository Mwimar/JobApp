package com.mwimar.JobApp.model;

import lombok.Data;

import java.util.List;

@Data
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
