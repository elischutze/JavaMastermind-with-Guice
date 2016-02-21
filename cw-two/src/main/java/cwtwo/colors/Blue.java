package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Blue extends Colour {

    private static Blue instance = new Blue();

    private void Blue(){
        this.name = "Blue";
    }

    public static Blue getInstance(){
        return instance;
    }

}
