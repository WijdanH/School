
package school2;


public class course {
   
    private int courseId;
    private String courseName;
    private int courseHoure;
    

    
    
    public course(int courseId, String courseName, int courseHoure) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseHoure = courseHoure;
    }

    

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }


    public int getCourseHoure() {
        return courseHoure;
    }

    public void setCourseHoure(int courseHoure) {
        this.courseHoure = courseHoure;
    }
   // polymorphisim
    public String printInfo(course c){
        return(c.toString());
        
    }
   public String toString(){
       return("the cource Id : "+ getCourseId()+"\n Course Name : "+getCourseName()
               +"\n the Course Hour : "+getCourseHoure() +"\n-------------------");
   }

   

        
        
    }



