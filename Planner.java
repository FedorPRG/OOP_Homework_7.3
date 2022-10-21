import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Planner implements Comparable<Planner> {
    protected Integer id;
    protected Date dataInput;
    protected Date deadLine;
    protected String nameAuthor;

    public Planner(int id, Date dataInput, Date deadLine, String nameAuthor) {
        this.id = id;
        this.dataInput = dataInput;
        this.deadLine = deadLine;
        this.nameAuthor = nameAuthor;
    }

    public String GetFullName() {       

        DateFormat dataIn = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
        DateFormat dataDead = new SimpleDateFormat("dd.MM.yyy");
            
        return id + "  " + dataIn.format(dataInput.getTime()).toString()
         + "           " + dataDead.format(deadLine.getTime()).toString() + "     " + nameAuthor;
    }    
    public Integer getId() {
        return id;
    }
    @Override
    public int compareTo(Planner o) {
        if (this.deadLine.getTime() > o.deadLine.getTime())
            return 1;
        else if (this.deadLine.getTime() < o.deadLine.getTime())
            return -1;
        else
            return 0;
    }
}
