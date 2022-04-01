import java.util.ArrayList;

public class Grades
{
    protected ArrayList<String[]> grades= new ArrayList<>();
    protected String grade = "-";
    public String getGrades()
    {
        String output="";
        for (int i = 0; i < grades.size(); i++)
        {
            if (i==grades.size()-1)
            {
                output+=grades.get(i)[0];
                output+=" ";
                output+=grades.get(i)[1];
            }
            else
            {
                output+=grades.get(i)[0];
                output+=" ";
                output+=grades.get(i)[1];
                output+="\r\n";
            }
        }
        return output;
    }
    public void addSubject(String name)
    {
        String[] inner = new String[2];
        inner[0]=name;
        inner[1]=grade;
        grades.add(inner);
    }
    public void dropSubject(String name)
    {
        for (int i = 0; i < grades.size(); i++)
        {
            if(grades.get(i)[0]==name)
            {
                grades.remove(i);
            }
        }
    }
}
