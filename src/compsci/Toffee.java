package progs;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;

public class Toffee
{
	static void countsUp(int[][] a)
	{
		int x = a.length - 1;
		int y = x - 1;
		
		int high = 0;
		int[][] b = a;
		
		for(int i = y; i >= 0; i--)
		{
			for(int k = x; k >= 0; k++)
			{
				if(k == x)
				{
					a[i][k] += a[i+1][k];
				}
				else
				{
					a[i][k] += a[i+1][k+1] + a[i+1][k];
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException
	{

		
		Scanner in = new Scanner(new File("toffee.dat"));
		int cases = in.nextInt();
		for(int i = 0; i < cases; i++)
		{
			int lines = in.nextInt();
			in.nextLine();
			int[][] field = new int[lines][lines];
			for(int k = 0; k < lines; k++)
			{
				for(int l = 0; l < lines; l++)
				{
					field[k][l] = in.nextInt();
				}
			}
			out.println(field[0][1]);
		//	out.println(countsUp(field));
		}
	}
}
