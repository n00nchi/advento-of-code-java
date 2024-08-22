import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
   System.out.println("Advent of Code 2015 - Day 1"); 
   try {
     
   BufferedReader reader = new BufferedReader(new FileReader("/Users/alfredooviedo/Projects/advent/advento-of-code-java/2015/Day1/src/main/java/input.txt"));
   String line;
   int floor = 0;
   while ((line = reader.readLine()) != null) {
    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);
      if (c == '(') {
        floor++;
      } else if (c == ')') {
        floor--;
      }
    }
   }
   System.out.println("Final floor: " + floor);
   reader.close();
   } catch (IOException e) {
     e.printStackTrace();
   }
  }
}
