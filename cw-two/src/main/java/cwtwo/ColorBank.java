package cwtwo;

import com.google.inject.Inject;
import cwtwo.colors.Colour;

import java.util.Hashtable;
import java.util.List;

/**
 * Created by elianne on 21/02/2016.
 */

//@Singleton
public class ColorBank {

    private static Hashtable<String, Colour> colorBank = new Hashtable<>();
    private static Hashtable<String,Colour> rightOrAlmost = new Hashtable<>();

    @Inject
    public ColorBank(List<Colour> colours, Colour[] rightOrAlmost){
        for(Colour colour : colours){
            colorBank.put(colour.getName().substring(0,1),colour);
        }

        this.rightOrAlmost.put("Right",rightOrAlmost[0]);
        this.rightOrAlmost.put("Almost",rightOrAlmost[1]);

    }

    public static Colour getColour(int index) {
        return colorBank.get(colorBank.keySet().toArray()[index]);
    }
    public static Colour getColour(String key) {
        return colorBank.get(key);
    }
    public static Colour getRightorWrongColor(String key) { return rightOrAlmost.get(key); }
    public static int numColors(){ return colorBank.size()-1; }



}
