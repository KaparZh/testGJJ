package com.company;

public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();

        Candidate[] candidates = new Candidate[10];
        candidates[0] = new CandidateSelfLearner("Bob");
        candidates[1] = new CandidateGJJ("Mike");
        candidates[2] = new CandidateSelfLearner("Tom");
        candidates[3] = new CandidateGJJ("Jerry");
        candidates[4] = new CandidateSelfLearner("Mickey");
        candidates[5] = new CandidateGJJ("Ivan");
        candidates[6] = new CandidateSelfLearner("Viktor");
        candidates[7] = new CandidateGJJ("Vasyl");
        candidates[8] = new CandidateSelfLearner("Igor");
        candidates[9] = new CandidateGJJ("Ronald");

        for (Candidate candidate : candidates) {
            employer.hello();
            candidate.hello();
            candidate.describeExperience();
        }

    }
}
