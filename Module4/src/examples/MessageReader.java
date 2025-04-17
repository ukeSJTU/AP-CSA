import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MessageReader {
    public static void main(String[] args) throws IOException {
        File file = new File("./message.txt");
        Scanner scan = new Scanner(file);

        // Print the contents of the file
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
