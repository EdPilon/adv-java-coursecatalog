package lab1;
public class Driver{
    public static void main(String[] args) {
        ProgrammingCourses advanced = new AdvancedJavaCourse("advJava", "111", "math", 0.0);
        ProgrammingCourses inJava = new IntroJavaCourse("advJava", "111", "math", 0.0);
        ProgrammingCourses inProgram = new IntroToProgrammingCourse("advJava", "111", 0.0);
        advanced.setCredits(2.1);
        System.out.println(advanced.getCredits());
        advanced.setCourseName("Advanced Java");
        System.out.println(advanced.getCourseName());

        inJava.setCredits(4.5);
        System.out.println(inJava.getCredits());
        inJava.setCourseName("Intro to Java");
        System.out.println(inJava.getCourseName());

        inProgram.setCredits(1.0);
        System.out.println(inProgram.getCredits());
        inProgram.setCourseName("Intro to Programming");
        System.out.println(inProgram.getCourseName());
    }
}

