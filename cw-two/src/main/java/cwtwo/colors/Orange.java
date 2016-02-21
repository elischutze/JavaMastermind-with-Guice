package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Orange extends Color {

    private static Orange instance = new Orange();

    private void Orange(){
        this.name = "Orange";
    }

    public static Orange getInstance(){
        return instance;
    }

}