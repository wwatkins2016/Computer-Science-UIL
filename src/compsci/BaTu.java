package compsci;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import javax.swing.*;
import static java.lang.System.*;


public class BaTu
{
	private static int[][] scanIn() throws Exception
	{
		Scanner in = new Scanner(new File("batu.dat"));
		int[][] arr = new int[9][9];
		for(int i = 0; i < 9; i++)
		{
			String[] line = in.nextLine().split("");
			for(int j = 0; j < 9; j++)
			{
				arr[i][j] = Integer.parseInt(line[j]);
				out.print(arr[i][j] + " ");
			}
			out.println();
		}
		in.close();
		return arr;
	}
	
	private static int[][] scanIn(String a) throws Exception
	{
		Scanner in = new Scanner(new File("batu.dat"));		
		Scanner inf = new Scanner(new File("batu.dat"));

		for(int i = 0; i < 9; i++)
		{
			in.nextLine();
			inf.nextLine();
		}
		int count = 0;
		while(inf.hasNextLine())
		{
			inf.nextLine();
			count++;
		}
		int[][] reqd = new int[count][2];
		for(int i = 0; i < count; i++)
		{
			reqd[i][0] = in.nextInt();
			reqd[i][1] = in.nextInt();
			out.println(reqd[i][0] + " " + reqd[i][1]);
		}
		
		in.close();
		inf.close();
		
		return reqd;
	}
	
	public static void main(String[] args) throws Exception
	{
		int[][] grid = scanIn();
		int[][] reqd = scanIn("A");
		
	}
}

class Sudoku
{
	private int[][] grid;
	
	public void Sudoku(int[][] a)
	{
		grid = a;
		Boxes.Boxes(grid);
	}
	
	public static class Cell
	{
		Optional<Byte> value = Optional.empty();
		boolean editable = false;
		
		public Cell(Optional<Byte> value)
		{
			this.value = value;
			if(!value.isPresent())
			{
				editable = true;
			}
		}
		
		public Optional<Byte> getMark()
		{
			return value;
		}
		
		public boolean setMark(Optional<Byte> mark)
		{
			if(!editable)
			{
				return false;
			}
			
			this.value = mark;
			return true;
		}
		
		public boolean isEditable()
		{
			return editable;
		}
	}
	
	public static class Constraint
	{
		Set<Cell> cells = new HashSet<>();
		public Constraint(){}
		public Constraint(Cell ...cells)
		{
			
		}
	}
	public static class Board
	{
		
	}
}