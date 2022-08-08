import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingFile {

    public static void main(String[] args) throws FileNotFoundException {

        File fileRead = new File("test1");
        File fileWrite = new File("test2");

        Scanner scanner = new Scanner(fileRead);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[5];
        int count = 0;

        for(String number: numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        PrintWriter pw = new PrintWriter(fileWrite);
        pw.println(line);

        pw.close();

    }

}
