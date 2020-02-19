package std.grd;

public class Grade
{
 int total;
 double avg;
 char grade;
 public double average(int t)
 {
  total=t;
  avg=total/3.0;
  return avg;
 }
 public char getGrade()
 {
  if(avg>=70)
   grade='A';
  else if(avg>=50)
   grade='B';
  else if(avg>=35)
   grade='C';
  else
   grade='F';
  return grade;
 }
}	
