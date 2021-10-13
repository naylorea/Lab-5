import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student1.print();

    Student student2 = new Student();
    student2.setName("Evan Naylor");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems & Finance");

    student2.print();

    ArrayList <Double> gpa = new ArrayList<Double>();

    gpa.add(student1.gpa);
    gpa.add(student2.gpa);

    double sum = 0;
    for(double i:gpa){
      sum += i;
    }
    double average = sum / gpa.size();
    System.out.println("The average GPA is " + average);





  }
}