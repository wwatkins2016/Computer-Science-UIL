package compsci;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;

public class Excellent
{

	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(new File("excellent.dat"));
		
		int p = in.nextInt();
		int q = in.nextInt();
		in.nextLine();
		
		PriorityQueue<String> Spread1 = new PriorityQueue<String>();
		PriorityQueue<String> Spread2 = new PriorityQueue<String>();
		PriorityQueue<String> Spread1t = new PriorityQueue<String>();
		
		for(int i = 0; i < p; i++)
		{
			Spread1.add(in.nextLine());
			Spread1t.add(Spread1.peek());
		}
		for(int i = 0; i < q; i++)
		{
			Spread2.add(in.nextLine());
		}
		
		
		ArrayList<String> Popped1 = new ArrayList<String>();
		ArrayList<String> Popped2 = new ArrayList<String>();

		for(int i = 0; i < Spread1.size();)
		{
			if(Spread2.contains(Spread1.peek()))
			{
				Spread1.poll();
			//	out.println(Spread2.poll());
			}
			else
			{
				Popped1.add(Spread1.poll());
			}
		}
	//	out.println(Spread1t.toString());
		for(int i = 0; i < Spread2.size();)
		{
			if(Spread1t.contains(Spread2.peek()))
			{
		//		Spread1t.poll();
				out.println(Spread2.poll());
			}
			else
			{
				Popped2.add(Spread2.poll());
			//	out.println("ASDF");
			}
		}
		out.println("NAMES IN SPREADSHEET 1 THAT ARE NOT IN SPREADSHEET 2");
		for(int i = 0; i < Popped1.size(); i++)
		{
			out.println(Popped1.get(i));
		}
		
		out.println("NAMES IN SPREADSHEET 2 THAT ARE NOT IN SPREADSHEET 1");
		for(int i = 0; i < Popped2.size(); i++)
		{
			out.println(Popped2.get(i));
		}
	}

}
