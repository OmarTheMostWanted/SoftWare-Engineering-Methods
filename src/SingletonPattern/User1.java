package SingletonPattern;

public class User1 {


    //has an instance of the class
    private SingletonClass singletonClass;

    /**
     * uses the static method to get an instance
     */
    public User1() {
        this.singletonClass = SingletonClass.getInstance();
    }

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }

}

