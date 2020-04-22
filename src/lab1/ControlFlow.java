package lab1;

public class ControlFlow {
    private int times = 10;

    public int addManyTimes(){
        int result = 3;

        for(int i=0; i<times; ++i)
        {
            result++;
        }
        return result;
    }

    public void AutoBox(Integer i)
    {
        System.out.println(i);
    }
}