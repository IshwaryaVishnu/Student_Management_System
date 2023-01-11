package se.lexicon.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentManagementConsoleImpl implements StudentManagement{

 // Constructor injection:
  /*  private final UserInputService scannerService;
    private final StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
        this.scannerService = scannerService;
        this.studentDao = studentDao;
    }*/

    //Field injection:
    @Autowired
    private UserInputService scannerService;
    @Autowired
    private StudentDao studentDao;

    private List<Student> students = new ArrayList<>();

       public Student create() {
        return (Student) students;
    }

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public Student remove(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                Student removedStudent = students.get(i);
                students.remove(i);
                return removedStudent;
            }
        }
        return null;
    }


    public List<Student> findAll() {
        return new ArrayList<>();
    }

    public Student edit(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return student;
            }
        }
        return null;
    }
    }

