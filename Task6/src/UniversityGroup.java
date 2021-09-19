import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private List<String> studentList = new ArrayList<String>();

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        this.endYear = startYear + 5;
    }

    public void addStudent(String student) {
        studentList.add(student);
    }

    public boolean removeStudent(String student) {
       return studentList.remove(student);
    }

    public void getGroupDescription() {
        System.out.println(getGroupName() + " " + getStartYear() + " " + getEndYear() + " " + getStudentList());
    }

    public static void main(String[] args) {
        UniversityGroup group1 = new UniversityGroup("First group", 2021);
        UniversityGroup group2 = new UniversityGroup("Second group", 2020,
                new ArrayList<String>( Arrays.asList("A J")));
        group1.addStudent("K J");
        group1.addStudent("K A");
        group1.addStudent("K D");
        group1.addStudent("K L");
        group1.addStudent("K X");

        group2.addStudent("Q C");
        group2.addStudent("Q A");
        group2.addStudent("Q F");
        group2.addStudent("Q E");
        group2.addStudent("Q Y");

        group1.removeStudent("K D");
        group2.removeStudent("Q F");

        group1.getGroupDescription();
        group2.getGroupDescription();
    }
}


