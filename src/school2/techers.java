
package school2;

public class techers extends course {
   

  private String TeacherName;
  private int TeacherID;
  private String Section;
  
  public techers ( int courseId, String courseName, int courseHoure,String TeacherName,int TeacherID ,String Section ){ 
      super( courseId ,courseName,courseHoure);
  this.TeacherName=TeacherName;
  this.TeacherID=TeacherID;
  this.Section=Section;
  
}
public void setTeacherName(String TeacherName  )
{
 TeacherName=TeacherName ;
}
 public String getTeacherName ()
 {
   return TeacherName;
 }
 public void TeacherID(int TeacherID )
 {
   TeacherID=TeacherID;
 }
  public int getTeacherID()
  {
    return TeacherID;
  }
  public void Section(String Section )
  {
    Section=Section;
  }
   public String getSection()
   {
     return Section;
   }
   
  @Override
    public String printInfo(course c){
        return(c.toString());
    } 
   
  @Override
  public String toString()
  {
return(" Teacher Name : "+getTeacherName()+"\n Teacher ID :"+getTeacherID()+" \n Section : "+getSection()+"\n -----------------");
}

}

