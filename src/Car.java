import java.util.Arrays;
import java.util.Scanner;

public class Car
{
    public int price;
    static int arr[]=new int[3],t=0;
    public  String manu;

    public Car()
    {
        Scanner sc = new Scanner(System.in);
        manu= sc.nextLine();
        price= sc.nextInt();
        arr[t]=price;
        t++;
    }
}
class Test extends Car
{
    public static void main(String[] args)
    {


        Car obj[]=new Car[3];
        for(int i=0;i<3;i++)
        {
            obj[i]=new Car();

        }
        Arrays.sort(arr);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i]==obj[j].price)
                {
                    System.out.println(obj[j].price);
                    System.out.println(obj[j].manu);
                    break;
                }
            }
        }
    }
}