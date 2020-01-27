package SingletonPattern;

import java.util.ArrayList;

/**
 * Only one instance of this object is allowed to be created at a time.
 */
public class SingletonClass {

    //static instance of this class. so all objects have reference to the same singletonClass.
    private static SingletonClass instance;
    private ArrayList<Object> objects;

    /**
     * private constructor to prevent other objects from creating a SingletonClass instance.
     */
    private SingletonClass() {
        objects = new ArrayList<>();
    }


    /**
     * only this static method can be used by other objects get an instance of this class
     *
     * @return The same instance for each time its called.
     */
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void addObject(Object object) {
        objects.add(object);
    }

    public Object getObject(int index) {
        if (index < objects.size()) {
            return objects.get(index);
        } else return null;
    }

    public Object removeObject(int index) {
        if (index < objects.size()) {
            Object removed = objects.get(index);
            objects.remove(removed);
            return removed;
        } else return null;
    }


}
