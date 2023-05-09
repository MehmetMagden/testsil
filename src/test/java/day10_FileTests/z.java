package day10_FileTests;

import java.nio.file.Files;
import java.nio.file.Paths;

public class z {

    public static void main(String[] args) {

        String filePath = System.getProperty("user.home")+"\"C:\\Users\\Maden\\Desktop\\Yeni Microsoft Word Belgesi.docx\"";


        Files.exists(Paths.get(filePath))    ;
    }
}
