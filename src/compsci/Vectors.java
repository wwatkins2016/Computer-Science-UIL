package compsci;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;

public class Vectors
{

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("vectors.dat"));
		
		int count = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < count; i++)
		{
			String line = in.nextLine();
			String[] initial = line.substring(1).split("[) ,(]+");
			
			int[] init = new int[initial.length];
			for(int k = 0; k < initial.length; k++)
			{
				init[k] = Integer.parseInt(initial[k]);
			}
			int totalx = 0, totaly = 0;
			for(int k = 0, j = 1; k < init.length; k+=2, j +=2)
			{
				totalx += init[k];
				totaly += init[j];
			}
			out.println("(" + totalx + "," + totaly + ")");
		}
		
		in.close();
	}

}
