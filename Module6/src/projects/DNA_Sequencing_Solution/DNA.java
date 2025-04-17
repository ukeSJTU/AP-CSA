package projects.DNA_Sequencing_Solution;

// DNA Sequencing Project: Determine if a DNA strand contains a protein based on specific criteria.
public class DNA {
    public static void main(String[] args) {
        // -. .-. .-. .-. .
        // \ \ / \ \ /
        // / \ \ / \ \
        // ~ `-~ `-` `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // Set the DNA strand to test
        String dna = dna1;

        // Find the length of the DNA strand
        int length = dna.length();
        System.out.println("Length: " + length);

        // Find the index of the start codon 'ATG'
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        // Find the index of the stop codon 'TGA'
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        // Check if both start and stop codons are present and if the length between
        // them is divisible by 3
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}
