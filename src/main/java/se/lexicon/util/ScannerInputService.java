package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
    // Constructor injection
  /*  private final Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner){
        this.scanner = scanner;
    }*/

    //Field Injection
    @Autowired
    private Scanner scanner;
        public String getString() {
        return null;
    }

    public int getInt() {
        return 0;
    }
}
