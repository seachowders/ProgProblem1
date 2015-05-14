import java.io.*;
import java.util.*;

public class DataGen

{
   final static int range = 10000;
   public static void main(String [] args) throws Exception
   {
   Random rand = new Random();
   Scanner kb = new Scanner(System.in);
   int numEntries;
   System.out.println("\nHow many entries in the file?");
   numEntries = kb.nextInt();      
   //Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"), "utf-8"));
   PrintWriter writer = new PrintWriter("dataset.txt", "UTF-8");
   for(int i = 0; i < numEntries; i ++)
   {
      writer.println(rand.nextInt(range));
   }
   writer.close();
      
      
      
   
   
}



}