package com.corejava.practice;

public class StringEx 
{
	public static void main(String[] args) 
	{
		// String s1 = new String("Mahesh Gurjar");
		
		String s1 = "Mahesh Gurjar";
		
		int l = s1.length();
		System.out.println("Length = "+l);
		
		System.out.println("Length = "+s1.length());
		
		System.out.println("Upper Case = "+s1.toUpperCase());
		System.out.println("Lower Case = "+s1.toLowerCase());
		
		System.out.println("Character At 0 = "+s1.charAt(0));
		System.out.println("Character At 4 = "+s1.charAt(4));
		
		System.out.println("Index Of esh = "+s1.indexOf("esh"));
		System.out.println("Index Of urj = "+s1.indexOf("urj"));
		System.out.println("Index Of M = "+s1.indexOf("M"));
		System.out.println("Index Of zab = "+s1.indexOf("zab"));
		System.out.println("Index Of Esh = "+s1.indexOf("Esh"));
		
		System.out.println("Index of a = "+s1.indexOf("a"));
		System.out.println("Index of a from 4 = "+s1.indexOf("a", 4));
		
		System.out.println("Last Index Of a = "+s1.lastIndexOf("a"));
		System.out.println("Last Index Of a from 8 = "+s1.lastIndexOf("a", 8));
		
		System.out.println("substring - 4 = "+s1.substring(4));
		System.out.println("substring - 4, 10 = "+s1.substring(4, 10));
		System.out.println("substring - 4, 11 = "+s1.substring(4, 11));
		
		String s2 = "Mahesh";
		String s3 = "mahesh";
		
		if(s2.equals(s3))
		{
			System.out.println("equals - Yes");
		}
		else
		{
			System.out.println("equals - No");
		}
		
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("equalsIgnoreCase - Yes");
		}
		else
		{
			System.out.println("equalsIgnoreCase - No");
		}
		
		if(s2.compareTo(s3)>0)
		{
			System.out.println("compareTo - s2 is greater");
		}
		else if(s2.compareTo(s3)<0)
		{
			System.out.println("compareTo - s3 is greater");
		}
		else
		{
			System.out.println("compareTo - Both are same...");
		}
		
		if(s2.compareToIgnoreCase(s3)>0)
		{
			System.out.println("compareToIgnoreCase - s2 is greater");
		}
		else if(s2.compareToIgnoreCase(s3)<0)
		{
			System.out.println("compareToIgnoreCase - s3 is greater");
		}
		else
		{
			System.out.println("compareToIgnoreCase - Both are same....");
		}
		
		String s4 = "Param";
		String s5 = "Gurjar";		
		
		System.out.println("concat = "+s4.concat(s5));
		
		String s6 = s4+s5;
		System.out.println("s6 = "+s6);
		
		String s7 = s4+" "+s5;
		System.out.println("s7 = "+s7);
		
		System.out.println("replace character = "+s1.replace('a', 'Z'));
		System.out.println("replace string = "+s1.replaceAll("Mahesh", "Bharat"));
		System.out.println("replace string - case sensitive = "+s1.replace("mahesh", "Krunal"));
		System.out.println("replace string - case In sensitive = "+s1.toLowerCase().replaceAll("mahesh", "Krunal"));
		
		System.out.println("contains = "+s1.contains("esh"));
		System.out.println("contains = "+s1.contains("Esh"));
		System.out.println("constains - case In sensitive = "+s1.toLowerCase().contains("esh"));
		
		String s8=" ";
		System.out.println("isEmpty = "+s8.isEmpty());
		
		System.out.println("startswith - "+s1.startsWith("Mah"));
		System.out.println("startswith - "+s1.startsWith("Par"));
		System.out.println("startswith - "+s1.startsWith("mah"));
		System.out.println("startswith - igonrecase - "+s1.toLowerCase().startsWith("mah"));
		
		System.out.println("endswith - "+s1.endsWith("rjar"));
		System.out.println("endswith - "+s1.endsWith("RJar"));
		System.out.println("endswith - ignorecase = "+s1.toUpperCase().endsWith("RJAR"));
		
		byte b[] = s1.getBytes();
		
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]+",");
		}
		
		System.out.println();
		
		String s9="Mahesh";
		System.out.println("repeat - "+s9.repeat(5));
		
		String s10 = "Mahesh;Bharat;Krunal;Hiren;Biren;Ketan";
		
		String str[] = s10.split(";");
		
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
		String s11 = "     My Name Is Mahesh Gurjar           ";
		System.out.println("s11 = "+s11);
		System.out.println("trim = "+s11.trim());
	}
}
