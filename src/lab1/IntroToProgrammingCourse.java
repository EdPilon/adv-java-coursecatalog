package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourses {
    double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseNumber, courseName);
        this.credits = credits;
    }


    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    public double getCredits() {
        return credits;
    }
}
