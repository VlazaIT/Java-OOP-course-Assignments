package TaskSet4.CourseEnrollment;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Johnons", 28);
        Course course = new Course("SW-22", "Software Engineering", "Dr. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2022-09-01");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) ois.readObject();
            System.out.println("Deserialized Enrollment: " + deserializedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

