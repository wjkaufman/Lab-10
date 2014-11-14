
/**
 * Lab 10 Work
 */

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayTest
{
    public static void main(String[] args)
    {
        ArrayList<String> rowNames = new ArrayList<String>();
        rowNames.add("Nick");
        rowNames.add("Connor");
        rowNames.add("Jackson");
        rowNames.add("Will");
        rowNames.add("Joe");
        
        rowNames.remove("Will");
        rowNames.add("Will");
        
        System.out.println(rowNames);
        
        
//         ArrayList<ArrayList<Integer>> myArray = new ArrayList<ArrayList<Integer>>();
//         for (int i = 0; i < 10; i++)
//         {
//             ArrayList<Integer> tempArray = new ArrayList<Integer>();
//             for (int j = 0; j < i; j++)
//             {
//                 tempArray.add(j);
//             }
//             
//             myArray.add(tempArray);
//         }
//         
//         System.out.println(myArray);
    }
}
