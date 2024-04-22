package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourses {
    double credits;

    public IntroJavaCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        super(courseNumber, courseName, prerequisites);
        this.credits = credits;
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0 to 5.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    public double getCredits() {
        return credits;
    }
}
