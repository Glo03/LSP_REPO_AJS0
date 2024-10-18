package org.howard.edu.lsp.midterm.question3;

/**
 * A class representing a candidate with a name and a vote count.
 */
public class Candidate {
    private String name;
    private int votes;

    /**
     * Constructs a new candidate with the given name and initializes votes to 0.
     * 
     * @param name the name of the candidate
     */
    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    /**
     * Gets the name of the candidate.
     * 
     * @return the name of the candidate
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the vote count for the candidate.
     * 
     * @return the number of votes the candidate has received
     */
    public int getVotes() {
        return votes;
    }

    /**
     * Increments the vote count by 1.
     */
    public void addVote() {
        votes++;
    }
}
