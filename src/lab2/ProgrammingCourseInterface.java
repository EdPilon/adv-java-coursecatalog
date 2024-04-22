package lab2;

public interface ProgrammingCourseInterface {
    String getCourseName();
    void setCourseName(String courseName);
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();
    void setCredits(double credits);
    String getPrerequisites(); // Optional method for some classes
    void setPrerequisites(String prerequisites); // Optional method for some classes
}
