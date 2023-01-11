package se.lexicon.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
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
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}


