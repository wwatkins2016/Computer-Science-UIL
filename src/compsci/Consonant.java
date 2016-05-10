package progs;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;

public class Consonant
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("consonant.dat"));
		int count = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < count; i++)
		{
			int longest = 0;
			String line = in.nextLine().toLowerCase();
			int num = line.length();
			char[] chars = new char[num];
			
			for(int k = 0; k < num; k++)
			{
				if(Character.isAlphabetic(line.charAt(k)))
				{
					if(line.charAt(k) != 'a' & line.charAt(k) != 'e' & line.charAt(k) != 'i' & line.charAt(k) != 'o' & line.charAt(k) != 'u')
					chars[k] = line.charAt(k);
				}
			}
			
			ArrayList<String> ascending = new ArrayList<String>();
			ArrayList<String> descending = new ArrayList<String>();
			
			String temp = "";
			int g = 0;
			int high = 0;
			
			for(int k = 0; k < num; k++)
			{	
				boolean flag = true;
				for(int j = g; j < num && flag; j++, g++)
				{
					if(k==0)
					{
						ascending.add("" + chars[k]);
					}
					String te = ascending.get(k);
					if((int)chars[j] >= te.charAt(te.length() - 1) && k > 0)
					{
						ascending.set(k, ascending.get(k) + chars[j] + "");
					}
					else
					{
						flag = false;
						if(ascending.get(k).length() > high)
						{
							high = ascending.get(k).length();
						}
					}
				}
				out.println(high);
			}
		}
	}
}
