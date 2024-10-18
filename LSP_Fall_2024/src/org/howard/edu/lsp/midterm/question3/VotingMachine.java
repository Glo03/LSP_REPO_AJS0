package org.howard.edu.lsp.midterm.question3;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple voting machine using an ArrayList to manage candidates.
 * This class allows adding candidates, casting votes, and printing vote counts.
 */
public class VotingMachine {
    private List<Candidate> candidates;

    /**
     * Constructs a new VotingMachine instance with an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new ArrayList<>();
    }

    /**
     * Adds a new candidate to the voting machine. If the candidate already exists, no changes are made.
     * 
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                return;  // Candidate already exists, do nothing
            }
        }
        candidates.add(new Candidate(name));  // Add new candidate
    }

    /**
     * Casts a vote for the given candidate. If the candidate does not exist, no votes are cast.
     * 
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.addVote();  // Increment the candidate's vote count
                return;
            }
        }
    }

    /**
     * Returns a string representation of the candidates and their vote counts.
     * 
     * @return a string displaying each candidate and the number of votes they received
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Candidate candidate : candidates) {
            result.append(candidate.getName()).append(": ").append(candidate.getVotes()).append(" votes\n");
        }
        return result.toString();
    }
}