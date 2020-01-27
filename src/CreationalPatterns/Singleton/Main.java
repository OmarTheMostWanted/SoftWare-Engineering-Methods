package CreationalPatterns.Singleton;

public class Main {

    public static void main(String[] args) {

        User1 user1 = new User1();
        User2 user2 = new User2();
        User3 user3 = new User3();

        boolean test1 = (user1.getSingletonClass() == user2.getSingletonClass());
        boolean test2 = (user2.getSingletonClass() == user3.getSingletonClass());

        assert test1;
        assert test2;

        //this is not possible.
        //SingletonClass singletonClass = new SingletonClass();

        Object added = new Object();

        user1.getSingletonClass().addObject(added);

        boolean test3 = (user1.getSingletonClass().getObject(0) == user2.getSingletonClass().getObject(0));
        boolean test4 = (user3.getSingletonClass().removeObject(0) == added);
        boolean test5 = user1.getSingletonClass().getObject(0) == null;

        assert test3;
        assert test4;
        assert test5;

        boolean res = test1 & test2 & test3 & test4 & test5;

        if (res) {
            System.out.println("test successful");
        }
    }
}
