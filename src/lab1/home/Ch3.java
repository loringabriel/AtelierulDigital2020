package lab1.home;

public class Challenge3 {

    public int pairOfTwo(int arr[])
    {
        int ok[] = new int[arr.length];
        int nbPairs = 0;

        for(int i=0; i<arr.length-1; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]+arr[j]==0 && ok[i]==ok[j] && ok[j]==0)
                {
                    nbPairs++;
                    ok[i]=1;
                    ok[j]=1;
                }

        return nbPairs;
    }
}