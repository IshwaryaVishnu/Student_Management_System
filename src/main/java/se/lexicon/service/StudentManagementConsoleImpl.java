package se.lexicon.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
import se.lexicon.service.exception.DataNotFoundException;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    //Field injection:
    @Autowired
    private UserInputService scannerService;
    @Autowired
    private StudentDao studentDao;

    private List<Student> students = new ArrayList<>();

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }


    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student remove(int id)  {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                Student removedStudent = students.get(i);
                students.remove(i);
                return removedStudent;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Student edit(Student student) throws DataNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return student;
            }
        }
        throw new DataNotFoundException("Student with id " + student.getId() + " not found.");
    }
}

