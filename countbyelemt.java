package countbyelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class countbyelemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();
		 for (int i = 0; i < n; i++) 
		 {
			 if (elementCountMap.containsKey(arr[i]))
	         {
				 elementCountMap.put((Integer) arr[i], elementCountMap.get(arr[i])+1);
	         }
			 else
	         {
				 elementCountMap.put((Integer) arr[i], 1);				 
	         }
	     }
		 ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());
		 Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() 
         {
             public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
             {
                 return o2.getValue().compareTo(o1.getValue());
             }
         }
);
		    //System.out.println("Input Array : "+Arrays.toString(arr));
         
	       // System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
	         
	       // System.out.print("[ ");
	         
	        for (Entry<Integer, Integer> entry : listOfEntry) 
	        {
	            int frequency = entry.getValue();
	             
	            while (frequency >= 1)
	            {
	                System.out.print(entry.getKey()+" ");
	                 
	                frequency--;
	            }
	        }
	         
	        //System.out.print("]");
	    }
}
