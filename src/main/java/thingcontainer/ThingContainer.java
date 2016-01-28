package thingcontainer;

/**
 * Created by Taylor on 1/21/16.
 */
public class ThingContainer {
    ColorfulThing[] colorArray;
    int arraySize; // now I can reference size (and final position) outside of the scope of the constructor
    int count = 0;

    public ThingContainer(int size) {
        colorArray = new ColorfulThing[size]; //size will be passed in, colorArray is array of Objects
        arraySize = size; // see global variable. Have to alias because size is local to constructor

    }

    public void add(ColorfulThing obj) {
        if (colorArray[arraySize - 1] == null) { //if the last position has no value
            for (int i = 0; i < colorArray.length; i++) {
                if (colorArray[i] == null) { // if current position has no value
                    colorArray[i] = obj; // create a new object as passed in the parameter at position
                    count++;
                    break; // stop creating
                }
            }


        }
    }

    public void printThings() {

        for (int i = 0; i < colorArray.length; i++) {
            System.out.println(colorArray[i].getColor());

        }
        if (colorArray[arraySize - 1] != null) {
            System.out.println("ThingContainer is full.");
        }

    }

    public ColorfulThing pop() {

        for (int i = colorArray.length - 1; i >= 0; i--) {

            if (colorArray[i] != null) {
                ColorfulThing removedThing = colorArray[arraySize - 1];
                colorArray[i] = null;

                return removedThing;

            }
            //colorArray[arraySize - 1] = null;

//setting a reference equal to null doesn't change the thing you referenced, just the reference.

        }
        return null;
    }
}