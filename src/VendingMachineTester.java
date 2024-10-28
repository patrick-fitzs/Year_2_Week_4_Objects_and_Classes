// Testing for github

public class VendingMachineTester {
    public void main(String[] args){


        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // Fill up with ten cans
        machine.insertToken();
        machine.insertToken();

        System.out.print("Token count: ");
        System.out.println(machine.getNumOfTokens());
        System.out.println("Expected: . . .");

        System.out.print("Can count: ");
        System.out.println(machine.getNumOfCans());
        System.out.println("Expected: . . .");

    }

    public static class VendingMachine{
        // Instance variables with their types and access modifiers
        private int numOfTokens;
        private int numOfCans;

        // A constructor with no arguments, initialises the machine with 10 cans
        public VendingMachine(){
            this(10); // calls the second constructor with 10 cans
        }

        // Constructor with an argument, initialised the machine with the given number of cans
        public VendingMachine(int cans){
            this.numOfCans = cans; // Initialises with given value
            this.numOfTokens = 0;

        }


        // method to add more cans to the machine
        public void fillUp(int cans){
            numOfCans = numOfCans+cans;
        }


        // method to insert a token into the machine
        public void insertToken(){
            if (numOfCans>0){
                numOfTokens++;
                numOfCans--;
            }
        }

        // method to get number of tokens
        public int getNumOfTokens() {
            return numOfTokens;
        }

        // method to get the number if cans

        public int getNumOfCans() {
            return numOfCans;
        }

        // method to reset the number of tokens
//        public void resetTokens(){

        }

}
