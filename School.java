package D;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	public static void main(String[] args) 
	{
		try{
	Student s=new Student();
	//System.out.println("stuid"+" "+"stuname"+" "+"totmarks"+" "+"percent");
	
	s.getList();
	ArrayList std=s.getList();
	for(int i=0;i<3;i++){
	System.out.println(std.get(i));	
	}}
	catch(Exception e)
	{
	}
	}
	}
