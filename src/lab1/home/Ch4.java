package lab1.home;

public class Challenge4 {

    public int pairOfThree(int arr[])
    {
        int ok[] = new int[arr.length];
        int nbPairs = 0;

        for(int i=0; i<arr.length-2; i++)
            for(int j=i+1; j<arr.length-1; j++)
                for(int k=j+1; k<arr.length; k++)
                    if((arr[i]+arr[j]+arr[k])==0 && ok[i]==0 && ok[j]==0 && ok[k]==0)
                    {
                        nbPairs++;
                        ok[i] = ok[j] = ok[k] = 1;
                    }

        return nbPairs;
    }
}