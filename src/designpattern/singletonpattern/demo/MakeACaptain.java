package designpattern.singletonpattern.demo;

public class MakeACaptain {
    /**LAzy initialization*/
    private static MakeACaptain captain;

    //We make the constructor private to prevent the use of "new"
    private MakeACaptain() {}

    public static MakeACaptain getCaptain() {

        if(captain == null) {
            captain = new MakeACaptain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;


    }

    /**Early initialization */
//    private static MakeACaptain captain = new MakeACaptain();
//
//    private MakeACaptain() {}
//
//    //Global point of access
//    //MakeACaptain.getCaptain() is a public static // method
//    public static MakeACaptain getCaptain() {
//        return captain;
//    }

    /**Bill Pugh solution */

//    private static MakeACaptain captain;
//    private MakeACaptain() {}
//
//    private static class SingletonHelper {
//        //Nest class is referenced after getCaptain() is called
//        private static final MakeACaptain captain = new MakeACaptain();
//    }
//
//    public static MakeACaptain getCaptain() {
//        return SingletonHelper.captain;
//    }
}
