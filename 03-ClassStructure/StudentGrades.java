import java.util.Arrays;
public class StudentGrades {

    String studentName;
    double[] grades;
    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public double LowestGrade(){
        double result = 5;
        for(int i = 0;i < grades.length;i++){
            if(grades[i]<result){
                result = grades[i];
            }
        }return result;
    }
    public double HighestGrade(){
        double result = 0;
        for(int i = 0;i < grades.length;i++){
            if(grades[i]>result){
                result = grades[i];
            }
        }return result;
    }
    public int NumberOfGrades(){
        return grades.length;
    }
    double GradeAverage(){
        double count = 0;
        for(double i : grades){
            count+=i;
        }
        return count/grades.length;
    }
        void DisplayRecord(){
            System.out.println(studentName);
            System.out.println(Arrays.toString(grades));
            System.out.println(NumberOfGrades());
            System.out.println(LowestGrade());
            System.out.println(HighestGrade());
            System.out.println(GradeAverage());
        }
        public static void main(String[] args){
            StudentGrades student1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
            StudentGrades student2 = new StudentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5});
            student1.DisplayRecord();
            student2.DisplayRecord();
        }
}
