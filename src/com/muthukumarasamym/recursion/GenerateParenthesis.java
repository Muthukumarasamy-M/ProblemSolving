package com.muthukumarasamym.recursion;

public class GenerateParenthesis {

	public static void main(String[] args) {
		
		GenerateParenthesis g = new GenerateParenthesis();
		g.generateParenthesis("(",2);
	}
	public void generateParenthesis(String s,int n)
	{
		if(n==0)
			return ;
		for(int i=0;i<n;i++)
		{	
			generateParenthesis("(",n-1);
			System.out.print(s);
			generateParenthesis(")",n-1);
		}
	
	}

}
