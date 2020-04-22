package lab1.home;

public class Challenge2 {

    public String compute(int nb)
    {
        String s = "";

        if(nb%3==0)
            s = s.concat("Foo");
        if(nb%5==0)
            s = s.concat("Bar");
        if(nb%7==0)
            s = s.concat("Qix");



        int aux = nb;
        while(aux>0)
        {
            if(aux%10==3)
                s = s.concat("Foo");
            aux/=10;
        }

        aux = nb;

        while(aux>0)
        {
            if(aux%10==5)
                s = s.concat("Bar");
            aux/=10;
        }

        aux = nb;

        while(aux>0) {
            if (aux % 10 == 7)
                s = s.concat("Qix");
            aux /= 10;
        }

        if(s == "")
            s = Integer.toString(nb);

        return s;
    }
}