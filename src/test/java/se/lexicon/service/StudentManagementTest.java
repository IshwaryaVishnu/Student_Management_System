package se.lexicon.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.model.Student;
import se.lexicon.service.exception.DataNotFoundException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ComponentScanConfig.class)
public class StudentManagementTest {
    @Autowired
    StudentManagement testObject;
    Student createdStudent;


    @BeforeEach
    public void setup(){
        Student studentData = new Student("ishu");
        createdStudent = testObject.save(studentData);
    }

    @Test
    public void find()throws DataNotFoundException {
        Student expectedStudent = new Student(1, "ishu");
        Student actualStudent = testObject.find(createdStudent.getId());

        Assertions.assertEquals(expectedStudent, actualStudent);
    }
}
