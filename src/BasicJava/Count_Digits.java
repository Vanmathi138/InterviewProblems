package BasicJava;

public class Count_Digits {
    public static void main(String[] args) {
        int n = 014;
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
