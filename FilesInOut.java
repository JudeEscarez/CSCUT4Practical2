import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
            //Creates file to be inputed and outputed
            File inputFile = new File("C:\\Users\\escar\\Downloads\\CSCUT4Practical2-main\\CSCUT4Practical2-main\\inputm.txt");
            File outputFile = new File("C:\\Users\\escar\\Downloads\\CSCUT4Practical2-main\\CSCUT4Practical2-main\\outputm.txt");
            //added a try catch statement to handle if the filepath or file cannot be found
         try {
             Scanner scanner = new Scanner(inputFile);//scanner for reading the file or filepath
             PrintWriter writer = new PrintWriter(outputFile); //this is the file or filepath that will contain the output of the program 
             //Continuously check the data in input file with the use of a while loop
              while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] words = line.split(" ");
                    StringBuilder formattedName = new StringBuilder();
                    String formattedDate = "";

            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    } // main

} // FilesInOut
