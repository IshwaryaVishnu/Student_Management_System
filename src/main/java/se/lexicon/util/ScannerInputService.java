package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
    @Autowired
    private Scanner scanner;

    public String getString() {
        return null;
    }

    public int getInt() {
        return 0;
    }
}
