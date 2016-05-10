package compsci;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;


public class pr92
{
	private static void printOut(char[][] a, int i)
	{
		for(int t = 0; i < a[i].length; i++)
		{
			out.print(a[i][t] + " ");
		}
		out.println();
		if(i < a.length)
		{
			printOut(a, i+1);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("pr92.dat"));
		
		int count = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < count; i++)
		{
			String line = in.nextLine();
			
			String[] lines = line.split(" ");
			char[][] a = new char[lines.length][10];
			for(int k = 0; k < lines.length; k++)
			{
				for(int j = 0; j < lines[k].length(); j++)
				{
					a[k][j] = lines[k].charAt(j);
					out.println(a[k][j]);
				}
			}
			printOut(a, 0);
		}
		
		in.close();
	}

}
