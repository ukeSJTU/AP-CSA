# DNA Sequencing Project - Solution

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

## Solution Overview

-   The provided `DNA.java` implements the complete logic to check for proteins in DNA strands.
-   It tests with three DNA strands:
    -   `dna1` ("ATGCGATACGCTTGA"): Identifies a protein.
    -   `dna2` ("ATGCGATACGTGA"): Does not identify a protein.
    -   `dna3` ("ATTAATATGTACTGA"): Identifies a protein.
-   The program uses String methods such as `length()`, `indexOf()`, and `substring()` to:
    -   Determine the length of the DNA strand.
    -   Find the start (`ATG`) and stop (`TGA`) codons.
    -   Check if the sequence length between codons is divisible by 3.
    -   Extract and display the protein sequence if all conditions are met.

## Key String Methods Used

-   `length()`: Returns the length of the string.
-   `indexOf()`: Finds the index of a substring.
-   `substring()`: Extracts a part of the string.
