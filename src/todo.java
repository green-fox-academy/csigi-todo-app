import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
//        Empty list Task
        System.out.println("No todos for today! :)");

//        List Task
//        Path inputFile = Paths.get("List_task.txt");
//        int count = 1;
//        try {
//          for (String line : Files.readAllLines(inputFile)) {
//            System.out.println(count + " - " + line);
//            count++;
//          }
//        }catch (IOException ex) {
//          System.out.println(ex);
//        }

      }
      else if (args[0].equals("-a")) {
        System.out.println("Unable to add: no task provided");
      }
    }else if (args.length == 2) {
      if (args[0].equals("-a")) {
        if (args[1].equals("Feed the monkey")) {
          Path inputFile = Paths.get("List_task.txt");
          List<String> List = new ArrayList<>();

          try {
            for (String line : Files.readAllLines(inputFile)) {
              if (!line.equals("Feed the Monkey")) {
                List.add(line);
              }
            }
          } catch (IOException ex) {
            System.out.println(ex);
          }

          try {
            List.add("Feed the Monkey");
            Files.write(inputFile, List);
          } catch (IOException ex) {
            System.out.println(ex);
          }

        }
      }
    }

  }
}
