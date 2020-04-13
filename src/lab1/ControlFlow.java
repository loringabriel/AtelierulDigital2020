package lab1;

public class ControlFlow {
    private int times=10;

    public int addManyTimes(){
        int result=3;
        while(times>0) {
            result++;
            times--;
        }
        return result;
    }
}
