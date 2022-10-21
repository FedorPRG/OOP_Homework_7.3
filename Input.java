import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Input {
  Scanner input = new Scanner(System.in);

  public void InputTask(ArrayList<Planner> listTask) {
    Calendar calendarNow = new GregorianCalendar();
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt();
    for (int i = 0; i < amount; i++) {
      Date dataInput = calendarNow.getTime();
      System.out.printf("Введите количество количество дней для решения задачи:");
      int days = input.nextInt();
      calendarNow.roll(Calendar.DATE, days);
      Date deadLine = calendarNow.getTime();
      System.out.printf("Введите ФИО (без пробелов) автора задачи:");
      input.nextLine();
      String nameAuthor = input.nextLine();
      Integer id = listTask.get(listTask.size() - 1).getId();
      id = id + 1;
      listTask.add(new Task(id, dataInput, deadLine, nameAuthor));
    }
  }
}
