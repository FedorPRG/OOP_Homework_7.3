import java.util.ArrayList;

public class Print {
  public void PrintListTask(ArrayList<Planner> listTask) {
    System.out.println("id Дата и время создания задачи  Время deadlina ФИО Автора задачи");
    for (Planner task : listTask) {
      System.out.println(task.GetFullName());
    }
  }
}
