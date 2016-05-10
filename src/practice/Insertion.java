package practice;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;

public class Insertion
{
	private static void insertionSort(int[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int temp = a[i];
			int j;
			for(j = i - 1; j >= 0 && temp < a[j]; j--)
			{
				a[i] = a[j];
			}
			a[i] = temp;
			for(int h = 0; h < a.length; h++)
			{
				switch(a[h])
				{
					case 2: out.print(2 + " ");
					break;
					case 3: out.print(3 + " ");
					break;
					case 4: out.print(4 + " ");
					break;
					case 5: out.print(5 + " ");
					break;
					case 6: out.print(6 + " ");
					break;
					case 7: out.print(7 + " ");
					break;
					case 8: out.print(8 + " ");
					break;
					case 9: out.print(9 + " ");
					break;
					case 10:out.print("T ");
					break;
					case 11:out.print("J ");
					break;
					case 12:out.print("Q ");
					break;
					case 13:out.print("K ");
					break;
					case 14:out.print("A ");
					break;
				}
			}
			out.println();
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(new File("insertion.dat"));
		int count = in.nextInt();
		in.nextLine();
		for(int i = 0; i < count; i++)
		{
			String[] line = in.nextLine().split(" ");
			int[] arr = new int[line.length];
			
			for(int k = 0; k < line.length; k++)
			{
				switch(line[k])
				{
					case "1":
					case "2":
					case "3":
					case "4":
					case "5":
					case "6":
					case "7":
					case "8":
					case "9": arr[k] = (Integer.parseInt(line[k]));
					break;
					case "T": arr[k] = (10);
					break;
					case "A": arr[k] = (14);
					break;
					case "J": arr[k] = (11);
					break;
					case "Q": arr[k] = (12);
					break;
					case "K": arr[k] = (13);
					break;
				}
			}
			insertionSort(arr);
			out.println();
		}
	}
}