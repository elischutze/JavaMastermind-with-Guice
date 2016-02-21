package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Red extends Color {

    private static Red instance = new Red();

    private void Red(){
        this.name = "Red";
    }

    public static Red getInstance(){
        return instance;
    }

}