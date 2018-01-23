import java.util.Scanner;
public class Sortingvc
{
public static void main(String args[])
{
int n,i,j;
String temp;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of names");
n=s.nextInt();
String names[]=new String[n];
Scanner s1=new Scanner(System.in);
System.out.println("Enter all the names:");
 for ( i = 0; i < n; i++) 
 {
 names[i] = s1.nextLine();
}
for(j=0;j<n;i++)
{
char ch=names[i].charAt(j)
if(ch == 'a' || ch == 'e' || ch== 'i'
                || ch == 'o' || ch == 'u') {
System.out.println("name starting with vowels:" +names[j]);
}
else if((ch >= 'a'&& ch <= 'z'))
System.out.println("name starting with consonants:" +names[i]);
}
}
}
}
}
}}}