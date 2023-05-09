import java.util.*;
public class circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double area=r*r*(3.14);
        System.out.format("%.2f",area);
    }
}