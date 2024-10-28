public class practice {
    public static void main(String[] args) {
        int year = 0;
        double rate = 0.07;
        double balance = 3000;

        while(year<10){
            balance = balance* (1+rate);
            year++;
            System.out.println("Total after year: "+year+" "+balance);

        }
    }
}
