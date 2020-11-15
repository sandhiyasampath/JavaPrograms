/*1) WAP to assign an Hex value to an int variable and see the result.
Similarly check it for Octal?!*/
public class Operator
{
	public static void main(String[] args)
	{
	int x = 0xAB;
	System.out.println("Hexa value of oxAB = "+x);
/*2) WAP to add two int values and see the result by printing it using*/
	int a = 10;
	int b = 20;
	System.out.println(a+b);
	double d = 10;
	double e = 20;
	System.out.println(d+e);
	
/*3) WAP add char variable with ‘a’ assigned to it with value 100 and
see the result? Print it both as char as well as int value.!*/
	char c = 'a';
	int i = 100+c;
	int in = 'a';
	System.out.println(c);
	System.out.println(i);
	System.out.println(in);
/*5) WAP to assign a Maximum long(data type) value to float and see
the result? (use long l = -1L >>> 1; to get biggest long value) !*/
	float f = -1l>>>1l;
	System.out.println(f);
/*6) WAP to subtract two int values and see the result? Try different
values.!*/
	int aa = 20;
	int bb = 10;
	System.out.println(aa-bb);
	System.out.println(bb-aa);

/* 7) WAP to multiply two int values and see the result? Then do this
for doubles as well and check.!*/
	System.out.println(a*b	);
	System.out.println(d*e);
	System.out.println(1+2*5/2-2*4);
	System.out.println(1*2*5-2+24);
	System.out.println(1+2/5/2/2-4);
	System.out.println(2/5/2/2);
	System.out.println( true ? false : true);
	System.out.println( true ? true : false);
	boolean tt = true;
	int ii=0;
	boolean ff = false, bbb;
	bbb = (tt & ((ii++) == 0));
	System.out.println(bbb);
	bbb = (ff & ((ii+=2) > 0));
	System.out.println(bbb);
	System.out.println(ii);

	
	
	

	
	}
}
