package org.howard.edu.lsp.midterm.question3;

/**
 * Driver class to test the VotingMachine and Candidate classes.
 */
public class VotingMachineDriver {

    /**
     * Main method to test adding candidates, casting votes, and displaying results.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a new voting machine
        VotingMachine vm = new VotingMachine();

        // Add candidates and cast votes
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");

        vm.addCandidate("Hogan");

        // Print out the results
        System.out.println(vm.toString());  // Output: Alsobrooks: 1 vote, Hogan: 0 votes
    }
}