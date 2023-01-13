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
        int studentID = StudentIdSequencer.nextId();
        student.setId(studentID);
        storage.add(student);

        return student;
    }

    @Override
    public Student find(int id) {
        if (id == 0) throw  new IllegalArgumentException( "Id was Null");
        for (Student student : storage) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }



    @Override
    public List<Student> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public void delete(int id)throws  DataNotFoundException {
       if(id == 0) throw  new IllegalArgumentException("id was null");
       Student studentFind = find(id);
       if (studentFind == null) throw new DataNotFoundException(" Student Data not found");
       storage.remove(studentFind);
    }
}



