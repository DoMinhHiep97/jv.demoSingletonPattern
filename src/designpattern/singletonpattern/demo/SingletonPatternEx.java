package designpattern.singletonpattern.demo;

public class SingletonPatternEx {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain captain1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeACaptain captain2 = MakeACaptain.getCaptain();

        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance");
        }
    }
}
