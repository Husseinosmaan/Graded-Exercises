package GRADED;

import java.util.Arrays;

public class Course {

    // Attributes
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[10];
        this.numberOfStudents = 0;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Add student
    public void addStudent(String student) {

        // Check if array is full
        if (numberOfStudents == students.length) {

            String[] newStudents =
                    new String[students.length * 2];

            // Copy old students
            System.arraycopy(
                    students,
                    0,
                    newStudents,
                    0,
                    students.length
            );

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Shift students to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Remove last duplicate
                students[numberOfStudents - 1] = null;

                numberOfStudents--;

                return;
            }
        }
    }

    // Return students
    public String[] getStudents() {
        return Arrays.copyOf(students, numberOfStudents);
    }

    // Return number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}