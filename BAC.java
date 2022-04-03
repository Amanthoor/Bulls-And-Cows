package zero;

import static java.lang.Integer.parseInt;

public class BAC {

    public static int toInt(String s){
        int x = parseInt(s);
        return x;
    }

    // Adding a new element to an Array
    public static BACUser[] addBACUserArray(BACUser[] srcArray, BACUser elementToAdd){
        BACUser[] destArray = new BACUser[srcArray.length + 1];

        for (int i = 0; i < srcArray.length; i++){
            destArray[i] = srcArray[i];
        }
        destArray[destArray.length - 1] = elementToAdd;
        return destArray;
    }


}
