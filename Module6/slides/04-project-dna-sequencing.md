---
marp: true
---

# Project: DNA Sequencing

## Objective

-   Study for the AP Computer Science A Exam (Java)
-   Develop a program to identify proteins in DNA strands

---

## Project Brief

-   **Goal:** Write a Java program (`DNA.java`) to determine if a DNA strand contains a protein.
-   **DNA Composition:** Composed of nucleotides `A` (Adenine), `C` (Cytosine), `G` (Guanine), `T` (Thymine).
-   **Protein Criteria:**
    -   Starts with "start codon": `ATG`
    -   Ends with "stop codon": `TGA`
    -   Sequence length between start and stop codons must be divisible by 3 (each codon is 3 nucleotides).

-v-

## Examples

-   `ATGCGATACTGA`: Is a protein (starts with `ATG`, ends with `TGA`, length divisible by 3).
-   `ATGCGATAGA`: Not a protein (length not divisible by 3).

---

## Key String Methods

-   `length()`: Returns the length of the string.
-   `indexOf()`: Finds the index of a substring.
-   `substring()`: Extracts a part of the string.
-   Other methods like `concat()`, `equals()`, `charAt()`, `toUpperCase()`, `toLowerCase()` may be useful but not all are required.

---

## Project Tasks

-   **Setup:** Create a basic structure for `DNA.java`.
-   **Commenting:** Add a descriptive comment about the program's purpose.
-   **Testing:** Use provided DNA strands (`dna1`, `dna2`, `dna3`) to test the program.
-   **Logic Development:** Implement checks for start/stop codons and length divisibility.
-   **Protein Extraction:** Use `substring()` to extract the protein sequence if conditions are met.

-v-

## Test Cases

-   `dna1` ("ATGCGATACGCTTGA"): Should identify a protein.
-   `dna2` ("ATGCGATACGTGA"): Should not identify a protein.
-   `dna3` ("ATTAATATGTACTGA"): Should identify a protein.

---

## Code Structure

**Starter Template Available:** `../src/projects/DNA_Sequencing_Starter/DNA.java`

**Solution Available:** `../src/projects/DNA_Sequencing_Solution/DNA.java`

-   Follow the tasks to build the logic step-by-step.
-   Use comments to guide implementation of each condition check.

---
