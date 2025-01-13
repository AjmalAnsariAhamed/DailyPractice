package com.OOPs.Abstract;

public abstract class AbstractRecipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }
    public abstract void getReady();
    public abstract void doTheDish();
    public abstract void cleanUp();
}
