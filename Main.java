// DNA fragment validation
// trying to get rid of all instances of the four valid pairs of nucleic acids (CG, GC, AT, TA) from string input and see if remaining string is empty
//CG-AT-GC is valid
//CG-RT-GA is invalid
//limitation: main method can't have more than 4 lines


import java.util.Scanner;
public class Main {	
   public static void main(String[] arg) {
      Scanner stdin = new Scanner(System.in);
      String dna = stdin.nextLine();  
      System.out.println(test(dna));
      stdin.close();
   }

   public static String removeCg(String stuff) {
      if (stuff.contains("CG-")) {
         if (stuff.indexOf("CG-"+3)!=-1) {
          stuff = stuff.substring(0,stuff.indexOf("CG-"))+
            stuff.substring(stuff.indexOf("CG-")+3);
        } else {
          stuff = stuff.substring(0,stuff.indexOf("CG-"));
        }
      }
      removeCg(stuff);
      return stuff;
   }
    
   public static String test(String a) {
      if (a.endsWith("-")) {
        return "invalid";
      } else {
        a = a + "-";
      }
      a = removeCg(a);
      if (a=="") {
        return "valid";
      } else {
        return "invalid";
      }
    }
}

  