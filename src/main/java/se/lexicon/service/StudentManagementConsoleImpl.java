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


    @Override
    public Student create() {
        //step valid
        Student student = new Student(scannerService.getString());
        studentDao.save(student);
        return null;
    }

    @Override
    public Student save(Student student) {
        if (student == null) throw new IllegalArgumentException("student was null");
        return studentDao.save(student);
    }


    @Override
    public Student find(int id) throws DataNotFoundException {
        if (id == 0) throw new IllegalArgumentException("id was null");
        return studentDao.find(id);
    }


    @Override
    public Student remove(int id) {
        if (id == 0) throw new IllegalArgumentException("Student Id was null");
        Student studentFind = studentDao.find(id);
        studentDao.delete(studentFind.getId());
        return studentFind;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentDao.findAll());
    }

    @Override
    public Student edit(Student student) throws DataNotFoundException{
        if (student == null) throw new IllegalArgumentException(" Student data was null");
       Student studentFind =  studentDao.find(student.getId());
          if (studentFind == null) throw  new  DataNotFoundException("Student Data was not found");
            studentDao.save(student);
            return studentFind;

    }
}

