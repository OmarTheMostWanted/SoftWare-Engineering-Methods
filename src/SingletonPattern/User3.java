package SingletonPattern;

public class User3 {
    //has an instance of the class
    private SingletonClass singletonClass;

    /**
     * uses the static method to get an instance
     */
    public User3() {
        this.singletonClass = SingletonClass.getInstance();
    }

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }
}
