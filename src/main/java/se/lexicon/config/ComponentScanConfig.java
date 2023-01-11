package se.lexicon.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data_access.StudentDao;

@Configuration
@ComponentScan(basePackages = "se.lexicon")

public class ComponentScanConfig {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    StudentDao studentDao = context.getBean(StudentDao.class);
}
