import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Read {

  public void ReadTask(String text, ArrayList<Planner> listTask) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {
      String[] data = scan.nextLine().split(",");
      int id = Integer.parseInt(data[0]);
      SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
      Date dataInput = date.parse(data[1] + " " + data[2]);
      SimpleDateFormat datedeadLine = new SimpleDateFormat("dd.MM.yyyy");
      Date deadLine = datedeadLine.parse(data[3]);
      String nameAuthor = data[4];
      listTask.add(new Task(id, dataInput,deadLine, nameAuthor));
    }
    scan.close();
    r.close();
  }
}
