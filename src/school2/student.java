
package school2;

public class student  extends course {
  private int studentID;
  private String name;
 
  
  
  public student( int courseId, String courseName, int courseHoure,int id ,String name ){ 
        super( courseId ,courseName,courseHoure);
  this.studentID= id;
  this.name=name;
  
  //this.academicaverage=average;
}
  
 
  
public void setstudentID(int id )
{
  studentID=id;
}
 public int getstudentID()
 {
   return studentID;
 }
 public void setstudentFirstName(String FirstName )
 {
   name=FirstName;
 }
  public String getstudentFirstName()
  {
    return name;
  }
  
  @Override
   public String printInfo(course c){
        return(c.toString());
   }
  @Override
  public String toString()
  {
    return( "studentID  "+getstudentID()+
    "\n student Name  "+getstudentFirstName()+"\n ----------------------------");
}

}

