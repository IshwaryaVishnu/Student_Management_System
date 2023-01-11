package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

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

    public Student create() {
        return null;
    }

    public Student save(Student student) {
        return null;
    }

    public Student find(int id) {
        return null;
    }

    public Student remove(int id) {
        return null;
    }

    public List<Student> findAll() {
        return null;
    }

    public Student edit(Student student) {
        return null;
    }
}
