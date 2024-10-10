package com.learning.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            list.add(sc.nextInt());
        
        int q = sc.nextInt();
        sc.nextLine();
        String query;
        
        for(int j = 0; j < q; j++)
        {
            query = sc.next();
            
            if(query.equals("Insert"))
            {
                list.add(sc.nextInt(), sc.nextInt());
            }
            else
            {
                list.remove(sc.nextInt());
            }
        }
        
        sc.close();
        
        for(Integer num: list)
        {
        	System.out.print(num + " ");
        }
    }

}
