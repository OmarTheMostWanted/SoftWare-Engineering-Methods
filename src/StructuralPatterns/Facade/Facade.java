package StructuralPatterns.Facade;

/**
 * this class helps clients interact with complex api
 * it provides an interface for interacting with the API.
 *
 * Using this class helps the client to decouple from the subSystem classes.
 *
 * This adds layers to the subsystem.
 *
 * its not all good as A facade can become a “god object” that is coupled to all classes in the application.
 *
 * When only one Facade object is required, Facade is often combined with Singleton.
 */
public class Facade {

    private ComplexAPI complexAPI;


    /**
     * Adapter defines new interfaces for old code. Facade defines new interfaces to simplify complex subsystems.
     * @param complexAPI complex subsystem that needs to be simplified.
     */
    public Facade(ComplexAPI complexAPI){

        //Abstract Factory can be used with Facade to provide an interface for creating subsystem objects in a subsystem-independent way.
        this.complexAPI = complexAPI;
    }


    /**
     * makes calls to the subSystem.
     */
    public void doOperationA(){
        this.complexAPI.getComponentA().ComplexStuff();
    }

    public void doOperationB(){
        this.complexAPI.getComponentB().ComplexStuff();
    }

    public void callAPI(){
        this.complexAPI.doComplexAPIStuff();
    }

}

