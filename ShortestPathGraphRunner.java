//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
public class ShortestPathGraphRunner
{
 public static void main( String[] args ) throws IOException
 {
   Scanner file = new Scanner(new File("graph2.dat"));
  int howManyTimes = file.nextInt();
  file.nextLine();
  for(int x=0; x<howManyTimes; x++)
  {
   String input = file.nextLine();
   ShortestPathGraph test = new ShortestPathGraph(input);
         input=file.nextLine();
   String start = input.substring(0,1);
   String stop = input.substring(1,2);
   System.out.println(test);
  }
 }
}