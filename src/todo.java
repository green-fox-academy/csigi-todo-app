import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class todo {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("" +
          "Command Line Todo application\n" +
          "=============================\n" +
          "\n" +
          "Command line arguments:\n" +
          "    -l   Lists all the tasks\n" +
          "    -a   Adds a new task\n" +
          "    -r   Removes an task\n" +
          "    -c   Completes an task");
    } else if (args.length == 1) {
      if (args[0].equals("-1")) {
        Path inputFile = Paths.get("file.txt");
        int count = 1;
        try {
          for (String line : Files.readAllLines(inputFile)) {
            System.out.println(count + " - " + line);
            count++;
          }
        }catch (IOException ex) {
          System.out.println(ex);
        }

      }
    }

  }
}
