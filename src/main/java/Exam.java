public class Exam extends Grades
{
    public void registGradeToSubject(String subject, int grade)
    {
        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i)[0] == subject)
            {
                grades.get(i)[1] = String.valueOf(grade);
            }
        }
    }
}
