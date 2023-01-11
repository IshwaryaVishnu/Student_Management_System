package se.lexicon.data_access;
import org.springframework.stereotype.Component;
import se.lexicon.model.Student;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentDaoListImpl  implements StudentDao{

    private List<Student> students = new ArrayList<>();


    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public Student save(Student student) {
        students.add(student);
        return student;
    }


    public List<Student> findAll() {

        return new ArrayList<>();
    }

    public void delete(int id) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == id) {
                    students.remove(i);
                    break;
                }
            }
        }


    }

