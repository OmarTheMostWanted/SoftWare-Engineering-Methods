package CreationalPatterns.Singleton;

public class User2 {
    //has an instance of the class
    private SingletonClass singletonClass;

    /**
     * uses the static method to get an instance
     */
    public User2() {
        this.singletonClass = SingletonClass.getInstance();
    }

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }
}
