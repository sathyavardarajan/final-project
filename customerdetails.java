import java.util.*;
import java.io.*;
class customerdetails
{
public static void main(String[] args)
{
try
{FileWriter fw=new FileWriter("C:\\java\\movie.txt");
BufferedWriter bw= new BufferedWriter(fw);
FileReader fr=new FileReader("C:\\java\\movie.txt");
BufferedReader br= new BufferedReader(fr);
ArrayList<String> array=new ArrayList<>();
Scanner sc = new Scanner(System.in);
String line;
int a=2;
int n=0,count=0;
int count1=0;
int count2=0;
int count3=0;
for(int i=0;i<a;i++)
{
System.out.println("Enter the Customer Id:");
String CustomerID=sc.nextLine();
bw.write(CustomerID);
bw.append("-");
System.out.println("Enter the Customer Name:");
String CustomerName=sc.nextLine();
bw.write(CustomerName);
bw.append("-");
System.out.println("Enter the Customer Gender:");
String CustomerGender=sc.nextLine();
bw.write(CustomerGender);
bw.append("-");
System.out.println("Enter the Customer Age:");
String CustomerAge=sc.nextLine();
bw.write(CustomerAge);
bw.append("-");
System.out.println("Enter theCustomer Address:");
String CustomerAddress=sc.nextLine();
bw.write(CustomerAddress);
bw.append("-");
System.out.println("Enter the Customer City:");
String CustomerCity=sc.nextLine();
bw.write(CustomerCity);
bw.append("-");
System.out.println("Enter the Customer Country:");
String CustomerCountry=sc.nextLine();
bw.write(CustomerCountry);
System.out.println("Enter the Customer pin:");

String Customerpin=sc.nextLine();
bw.write(Customerpin);
bw.append("-");
System.out.println("Enter the customer phonenumber:");
String Customerphonenumber=sc.nextLine();
bw.write(Customerphonenumber);
bw.append("-");
System.out.println("Enter the customer DOB:");
String CustomerDOB=sc.nextLine();
bw.write(CustomerDOB);
bw.newLine();
}
bw.close();
fw.close();
System.out.println("success");
while((line=br.readLine())!=null)
{ StringTokenizer str=new StringTokenizer(line,"-");
while(str.hasMoreTokens())
{array.add(str.nextToken());
}
}
count1=0;
count2=0;
for(n=0;n<a;n++)
{String gender=(array.get((9*n)+2));
String s1="M";
String s2="F";
if(gender.equalsIgnoreCase(s1))
{count1++;
}
else if (gender.equalsIgnoreCase(s2))
{count2++;
}}
System.out.println("Number of M customers:"+count1);
System.out.println("Number of F customers:"+count2);
count=0;
for(n=0;n<a;n++)
{int age=Integer.parseInt(array.get((9*n)+3));
if(age>18)
{count++;
}
}
System.out.println("Number of customers whose age is above 18:"+count);
count3=0;
for(n=0;n<a;n++)
{String phonenumber=array.get((9*n)+8);
String s1="null";
if(phonenumber.equals(s1));
{count3++;
}
}
System.out.println("Number of customers without phone number:"+count3);
}catch(Exception e)
{System.out.println(e.getMessage());
}}
}
