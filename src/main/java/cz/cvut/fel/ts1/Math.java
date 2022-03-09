package cz.cvut.fel.ts1;

public class Math {
    public int factorial(int a){
        if(a == 1) return 1;
        else return a * factorial(a-1);
    }

    public int factorial2(int a){
        for(int i = a-1; i>0; i--){
            a*=i;
        }
        return a;
    }

}
