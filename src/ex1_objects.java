public class ex1_objects {
  // Testing for GitHub
    public void main(String[] args){

        // new door object
        Door frontDoor = new Door("Front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        System.out.println("Expected: open");

        // new door object
        Door backDoor = new Door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: closed");

        // Use the mutator to change the state variable
        backDoor.setState("open");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: open");

        // Use the mutator to change the name variable
        backDoor.setName("Kitchen");
        System.out.println("The back door is called " + backDoor.getName());
        System.out.println("Expected: Kitchen");

        // Create a third Door object called sideDoor with the name property Side and an initial state of closed.
        Door sideDoor = new Door("sideDoor", "closed");
        //  Use the mutator to change the state of object sideDoor to open.
        sideDoor.setState("open");
        System.out.println("The sideDoor is "+ sideDoor.getState());
        System.out.println("Expected: open");

    }

    // Create a class for a Door
    public class Door{  // Class for a door

        private String name; // instance variables
        private String state;



        // method to open door
        public String open(){
            state = "Open";
            return state;
        }


        // method to close door
        public String Close(){
            state = "Closed";
            return state;
        }


        // Constructor for a new door object
        public Door(String name, String state){
            this.name = name;
            this.state = state;
        }


        // Accessor methods
        public String getName() {
            return name;
        }


        // Accessor methods
        public String getState() {
            return state;
        }


        // Mutator methods to change the value of the variable

        public void setName(String name) {
            this.name = name;
        }


        // Mutator methods to change the value of the variable
        public void setState(String state) {
            this.state = state;
        }



    }
}
