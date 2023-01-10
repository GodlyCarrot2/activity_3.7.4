import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
/**********************************************************************
 * Sample solution for Activity 3.6.4
 **********************************************************************/
/**
 * Generate random permutations of integers
 */
public class RandomPermutation
{
  HorseBarn horseBarn = new HorseBarn();
  ArrayList<Horse> horses = horseBarn.getSpaces();

   public static int[] next(int length)
   {
      int[] r = new int[length];
      int[] p = new int[length];
      
      for (int i = 0; i < length; i++)
        p[i] = i + 1;
        
      for (int n = length; n > 0; n--)
      {
        int pos = (int) (Math.random() * n);
        r[n-1] = p[pos];
        p[pos] = p[n-1];
      }
      
      // debug: System.out.println(java.util.Arrays.toString(r));
      return r;
   }
  
   public static ArrayList<Horse> next(ArrayList<Horse> horseList) {
    
    int num = 0;

    while (num < horseList.size()) {

      int rand = (int) (Math.random()*horseList.size())

      Horse name = horseList.get(rand);
      num=num+1;
    }

    return horseList;
   }

   public static void horseRand(ArrayList<Horse> horseList) {

   }
}
