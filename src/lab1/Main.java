package lab1;
import lab1.home.Challenge1;
import lab1.home.Challenge2;
import lab1.home.Challenge3;
import lab1.home.Challenge4;

public class Main {
    private static int semester = 2;
    private int instanceVar =3;
    public static void main(String[] args){
        int var = 2020;
        System.out.println("Atelierul Digital " + var);
        int a = 5;
        var = a>2?(a<4? 10 : 8) : 7;
        System.out.println("var= " + var);

        ControlFlow cf = new ControlFlow();
        System.out.println("result= " + cf.addManyTimes());

        int nr=6;
        //cf.Autobox(nr);

        Challenge1 c1 = new Challenge1() ;
        c1.challenge1();

        Challenge2 c2 = new Challenge2();
        for(int i=1; i<=53; i++)
        {
            System.out.println(c2.compute(i));
        }

        Challenge3 c3 = new Challenge3();
        int arr[] = {3,2,-3,-2,3,0};
        System.out.println(c3.pairOfTwo(arr));

        Challenge4 c4 = new Challenge4();
        int arr2[] = {3,2,-3,-5,3};
        System.out.println(c4.pairOfThree(arr2));
    }
}