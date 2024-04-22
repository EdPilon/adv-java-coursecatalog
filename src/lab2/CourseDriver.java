package lab2;

public class CourseDriver {

    public static void main(String[] args) {
        ProgrammingCourseInterface advancedJava = new AdvancedJavaCourse("Advanced Java", "AJ101");
        advancedJava.setCredits(3.0);
        advancedJava.setPrerequisites("Basic Java");

        ProgrammingCourseInterface introProgramming = new IntroToProgrammingCourse("Intro to Programming", "IP100");
        introProgramming.setCredits(2.0);

        ProgrammingCourseInterface introJava = new IntroJavaCourse("Intro Java", "IJ101");
        introJava.setCredits(2.5);
        introJava.setPrerequisites("Intro to Programming");

        System.out.println("Testing Advanced Java Course: " + advancedJava.getCourseName() + " " + advancedJava.getCredits());
        System.out.println("Testing Intro to Programming Course: " + introProgramming.getCourseName() + " " + introProgramming.getCredits());
        System.out.println("Testing Intro Java Course: " + introJava.getCourseName() + " " + introJava.getCredits());
    }
}
