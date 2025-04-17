# DNA Sequencing Project - Starter Template

## Objective

-   Study for the AP Computer Science A Exam (Java)
-   Develop a program to identify proteins in DNA strands

## Project Brief

-   **Goal:** Write a Java program (`DNA.java`) to determine if a DNA strand contains a protein.
-   **DNA Composition:** Composed of nucleotides `A` (Adenine), `C` (Cytosine), `G` (Guanine), `T` (Thymine).
-   **Protein Criteria:**
    -   Starts with "start codon": `ATG`
    -   Ends with "stop codon": `TGA`
    -   Sequence length between start and stop codons must be divisible by 3 (each codon is 3 nucleotides).

## Examples

-   `ATGCGATACTGA`: Is a protein (starts with `ATG`, ends with `TGA`, length divisible by 3).
-   `ATGCGATAGA`: Not a protein (length not divisible by 3).

## Instructions

-   Follow the TODO comments in `DNA.java` to implement the program step-by-step.
-   Test your program with the provided DNA strands:
    -   `dna1` ("ATGCGATACGCTTGA"): Should identify a protein.
    -   `dna2` ("ATGCGATACGTGA"): Should not identify a protein.
    -   `dna3` ("ATTAATATGTACTGA"): Should identify a protein.
-   Use String methods such as `length()`, `indexOf()`, and `substring()` to check for protein criteria and extract the protein sequence if present.

## Key String Methods

-   `length()`: Returns the length of the string.
-   `indexOf()`: Finds the index of a substring.
-   `substring()`: Extracts a part of the string.
-   Other methods like `concat()`, `equals()`, `charAt()`, `toUpperCase()`, `toLowerCase()` may be useful but not all are required.
