// Q: 4
// AUTHOR: ARGHA DIGAR
// TITLE: Java School Management System
// DESCRIPTION: This Java program demonstrates a simple school management system that allows you to add and remove students and teachers, as well as create classes in a school.
class School {
     Student[] students;
     Teacher[] teachers;
     Classroom[] classrooms;
     int studentCount;
     int teacherCount;
     int classroomCount;

     School(int maxStudents, int maxTeachers, int maxClassrooms) {
        students = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
        classrooms = new Classroom[maxClassrooms];
        studentCount = 0;
        teacherCount = 0;
        classroomCount = 0;
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Maximum student limit reached.");
        }
    }

    // Remove a student from the school
    public void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Add a teacher to the school
    public void addTeacher(Teacher teacher) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount] = teacher;
            teacherCount++;
        } else {
            System.out.println("Maximum teacher limit reached.");
        }
    }

    // Remove a teacher from the school
    public void removeTeacher(Teacher teacher) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i] == teacher) {
                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[teacherCount - 1] = null;
                teacherCount--;
                return;
            }
        }
        System.out.println("Teacher not found.");
    }

    // Create a new class and add it to the school
    public void createClass(String className) {
        if (classroomCount < classrooms.length) {
            classrooms[classroomCount] = new Classroom(className);
            classroomCount++;
        } else {
            System.out.println("Maximum classroom limit reached.");
        }
    }

  // Display information about the school
    public void displaySchoolInfo() {
    System.out.println(":::::::::::::::School Information:::::::::::::::");
    System.out.println("Number of Students: " + studentCount);
    System.out.println("Students:");

    for (int i = 0; i < studentCount; i++) {
        System.out.println("  " + (i + 1) + ". " + students[i].getName());
    }

    System.out.println("Number of Teachers: " + teacherCount);
    System.out.println("Teachers:");

    for (int i = 0; i < teacherCount; i++) {
        System.out.println("  " + (i + 1) + ". " + teachers[i].getName());
    }

    System.out.println("Number of Classes: " + classroomCount);
    System.out.println("Classes:");

    for (int i = 0; i < classroomCount; i++) {
        System.out.println("  " + (i + 1) + ". " + classrooms[i].getClassName());
    }
}

    // Inner class to represent a Student
    public class Student {
        String name;

        public Student(String nam) {
            name = nam;
        }

        public String getName() {
            return name;
        }
    }

    // Inner class to represent a Teacher
    public class Teacher {
        private String name;

        public Teacher(String nam) {
            name = nam;
        }

        public String getName() {
            return name;
        }
    }

    // Inner class to represent a Classroom
    public class Classroom {
        private String className;

        public Classroom(String classNam) {
           className = classNam;
        }

        public String getClassName() {
            return className;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School(100, 20, 10);

        // Adding students and teachers
        school.addStudent(school.new Student("Argha"));
        school.addStudent(school.new Student("Soukat"));
        school.addStudent(school.new Student("Sudipa"));
        school.addStudent(school.new Student("Sanjana"));
        school.addStudent(school.new Student("Kuntal"));

        school.addTeacher(school.new Teacher("Mr. Avijit"));
        school.addTeacher(school.new Teacher("Ms. rumpa"));
         school.addTeacher(school.new Teacher("Mr. Preetam"));

        // Creating classes
        school.createClass("java");
        school.createClass("DSA");

        // Display school information
        school.displaySchoolInfo();
    }
}
