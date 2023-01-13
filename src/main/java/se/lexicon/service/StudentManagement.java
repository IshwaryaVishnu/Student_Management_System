package se.lexicon.service;

import se.lexicon.model.Student;
import se.lexicon.service.exception.DataNotFoundException;

import java.util.List;

public interface StudentManagement {
    Student create();
    Student save(Student student);
    Student find(int id) throws DataNotFoundException;
    Student remove(int id) ;
    List<Student> findAll();
    Student edit(Student student) throws DataNotFoundException;
}
