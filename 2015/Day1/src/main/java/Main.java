import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
   System.out.println("Advent of Code 2015 - Day 1"); 
   try {
     
   BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
   String line;
   while ((line = reader.readLine()) != null) {

     
     System.out.println(line);
     
   }
   reader.close();
   } catch (IOException e) {
     e.printStackTrace();
   }
  }
}
