import static java.lang.System.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

class TileBoard
{
	private static int[][] arr = new int[4][4];
	private static int limit;
	private static String zero;
	private static int heriustic;
	public TileBoard(int[][] n, int l, String zero)
	{
		int[][] arr = n;
		limit = l;
		this.zero = zero;
	}
	public static void moveRight()
	{
		
	}
	public static void computeHeriustacy()
	{
		int count = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int k = 0; k < 4; k++)
			{
				int m = 4 * 0 + k + 1;
				if(arr[i][k] != m)
				{
					int h = 0;
					int p = 0;
					for(; h < 4;)
					{
						for(; p < 4;)
						{
							if(arr[h][p] == m)
							{
								count+=Math.abs((h-i) + (p-k));
							}
							p++;
						}
						h++;
					}
				}
			}
		}
	}
}
public class Tile
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(new File("tile.dat"));
		int count = in.nextInt();
		String zero = "";
	//	in.nextLine();
		int[][] arr = new int[4][4];
		for(int i = 0; i < count; i++)
		{
			for(int o = 0; o < 4; o++)
			{
				for(int j = 0; j < 4; j++)
				{
					String b = in.next();
					if(b.contains("*"))
					{
						arr[o][j] = 0;
						zero = o + " " + j;
					}
					else
					{
						arr[o][j] = Integer.parseInt(b);
					}
					out.println(arr[o][j]);
				}
			}
			int limit = in.nextInt();
		}
	}
}
