import java.io.*;
public class RPNcalc
{	public static void main(String[] args)throws IOException
	{
		String input;
		while(true)
		{
			System.out.println("enter the expression to be calculated");
			input=acceptString();
			if(input.equals(""))
			break;
		Calc thecalc=new Calc(input);
		thecalc.calcu();
		}
	}

	public static String acceptString()throws IOException
	{InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader keybd=new BufferedReader(isr);
		String s=keybd.readLine();
		return s;
	}
}
