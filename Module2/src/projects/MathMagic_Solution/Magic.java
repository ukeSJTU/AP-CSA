public class Magic {
    public static void main(String[] args) {
        int myNumber = 15; // Can be any number between -46,341 and 46,340
        // myNumber is the original number

        // Step 1 - Square the number
        int stepOne = myNumber * myNumber;

        // Step 2 - Add the original number
        int stepTwo = stepOne + myNumber;

        // Step 3 - Divide by the original number
        int stepThree = stepTwo / myNumber;

        // Step 4 - Add 17
        int stepFour = stepThree + 17;

        // Step 5 - Subtract the original number
        int stepFive = stepFour - myNumber;

        // Step 6 - Divide by 6
        int stepSix = stepFive / 6;

        // Print the result
        System.out.println(stepSix);

        // Challenge: Using only two variables
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println("Challenge result: " + magicNumber);
    }
}
