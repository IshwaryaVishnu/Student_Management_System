package se.lexicon.data_access;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.sequencer.StudentIdSequencer;
import se.lexicon.model.Student;
import se.lexicon.service.exception.DataNotFoundException;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentDaoListImpl  implements StudentDao {

    private List<Student> storage = new ArrayList<>();

    @Override
    public Student save(Student student) {
        //step1 validate student
        if(student == null) throw new IllegalArgumentException( " Student was null");

        if(student.getId() == 0) {
                int studentID = StudentIdSequencer.nextId();
                student.setId(studentID);
                storage.add(student);

            }else {
            storage.add(student);

        }

        return student;
    }

    @Override
    public Student find(int id) {
        if (id == 0) throw  new IllegalArgumentException( "Id was Null");
       Student studentFind = null;
        for (Student student : storage) {
            if (student.getId() == id) {
                studentFind = student;
            }
        }
        return studentFind;
    }



    @Override
    public List<Student> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public void delete(int id) {
       if(id == 0) throw  new IllegalArgumentException("id was null");
       Student studentFind = find(id);
      // if (studentFind == null) throw new DataNotFoundException(" Student Data not found");
       storage.remove(studentFind);
    }
}



