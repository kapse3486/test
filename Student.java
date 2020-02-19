package std;

public class Student
{
 String name;
 int rno,m1,m2,m3;
 char grade;
 int total;
 public Student(String s,int no,int a,int b,int c)
 {
  name=s;
  rno=no;
  m1=a;
  m2=b;
  m3=c;
 }
 public int getTotal()
 {
  total=m1+m2+m3;
  return total;
 }
 public void display(double avg,char grade)
 {
  System.out.println("--------------------------------------");
  System.out.println("Student details:");
  System.out.println("Name of the student: "+name);
  System.out.println("Roll num of the student: "+rno);
  System.out.println("Marks in three subjects: "+m1+"\t"+m2+"\t"+m3);
  System.out.println("Total marks : "+total);
  System.out.println("Average marks: "+avg);
  System.out.println("Grade: "+grade);
 }
}
