import java.io.*;
public class Fruits
{
public static void main(String[] args)
{
try
{
FileOutputStream fout = new FileOutputStream("C:\\java\\New folder\\welcome.txt");
String message="Apple";
byte[] b =message.getBytes();
fout.write(100);
fout.write(b);
System.out.println("data successfully");
}
catch(Exception e)
{
System.out.println(e.getMessage() );
}
}
}
