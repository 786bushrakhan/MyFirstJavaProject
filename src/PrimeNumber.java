public class PrimeNumber {
    public static void main(String [] args){
        int num = 9;
        boolean isPrime = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " " + "is Prime Number");
        }

        else{
            System.out.println(num + " " + "is not Prime Number");
        }
    }
}
