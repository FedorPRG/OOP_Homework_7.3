import java.io.FileWriter;
import java.util.ArrayList;

public class Write {
  public static void WriteTask(String text, ArrayList<Planner> listTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Planner task : listTask) {
      w.write(task.GetFullName() + "\n");
    }
    w.flush();
    w.close();
  }
}
