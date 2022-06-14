
package school2;


public class Employee extends course{
 
  private int DateOfBirth;
  private String EmployeeName;
  private double Salary;
  
  public Employee(int courseId, String courseName, int courseHoure, int Birth ,String Employeename ,double salary ){ 
      super(courseId ,courseName,courseHoure);
  
  this.DateOfBirth= Birth;
  this.EmployeeName=Employeename;
  this.Salary=salary;
}
public void setDateOfBirth(int Birth )
{
  DateOfBirth=Birth;
}
 public int getDateOfBirth()
 {
   return DateOfBirth;
 }
 public void setEmployeeName(String Employeename )
 {
   EmployeeName=Employeename;
 }
  public String getEmployeeName()
  {
    return EmployeeName;
  }
  public void setSalary(double salary )
  {
    Salary=salary;
  }
   public double getSalary()
   {
     return Salary;
   }
   
  @Override
   public String printInfo(course c){
       return(c.toString());
   }
  public String toString()
  {
    return("EmployeeName : "
            +getEmployeeName()+"\n Salary : "+getSalary()+"\n DateOfBirth : "+getDateOfBirth()+"\n -------------------");
}

}

