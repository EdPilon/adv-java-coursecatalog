package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourses {
    double credits;

    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        super(courseNumber, courseName, prerequisites);
        this.credits = credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    public double getCredits() {
        return credits;
    }

}
