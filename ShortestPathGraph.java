//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas 

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
 private TreeMap<String, String> map;
 private boolean yayOrNay;
 private int shortest;
 private String one;
 private String two;

 public ShortestPathGraph(String line)
 {
   map = new TreeMap<String, String>();
  String[] list = line.split(" ");
  for(String piece : list)
  {
   String first = piece.substring(0,1);
   one = piece.substring(0,1);
   String second = piece.substring(1,2);
   two=piece.substring(1,2);
   
   if(map.get(first)==null)
    map.put(first, "");
   if(map.get(second)==null)
    map.put(second, "");
   
   map.put(first, map.get(first)+second);
   map.put(second, map.get(second)+first);
  }
 }

 public boolean contains(String letter)
 {
  if(map.get(letter)==null)
       return false;
    return true;
 }

 public void check(String first, String second, String placesUsed, int steps)
 {
   String conList = map.get(first); //list of all connections to first
   for(int i=0; i<conList.length(); i++)
    if(placesUsed.indexOf(conList.substring(i, i+1))<0)
     check(conList.substring(i, i+1), second, placesUsed+first, shortest + 1);
 }

 public String toString()
 {
  return "The shortest path from " + one + " to " + two + " is " + shortest + " steps";
 }
}