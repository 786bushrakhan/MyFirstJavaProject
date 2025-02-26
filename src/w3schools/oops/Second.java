package w3schools.oops;

public class Second {
    public static void main (String [] args){
        First myCar = new First();
        Second myCar1 = new Second();
        myCar.fullThrottle();
        myCar.speed(200);

        StaticVsPublicMethod obj = new StaticVsPublicMethod();
        obj.myPublicMethod();
        StaticVsPublicMethod.myStaticMethod();
    }
}
