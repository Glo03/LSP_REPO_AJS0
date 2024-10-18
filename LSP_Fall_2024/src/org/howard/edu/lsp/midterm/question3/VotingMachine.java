package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

/**
 * Represents a simple voting machine that tracks votes for candidates.
 */
public class VotingMachine {
    private HashMap<String, Integer> candidates = new HashMap<>();

    /**
     * Adds a candidate to the voting machine.
     * 
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    /**
     * Casts a vote for the given candidate.
     * 
     * @param name the name of the candidate to cast a vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}