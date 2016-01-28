package thingcontainer;

/**
 * Created by Taylor on 1/21/16.
 */
public class App {
    public static void main(String[] args) {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing thing = new ColorfulThing("red");
        ColorfulThing thing2 = new ColorfulThing("blue");
        ColorfulThing thing3 = new ColorfulThing("green");

        thingContainer.add(thing); //call this to refer to thing created when instantiated
        thingContainer.add(thing2);
        thingContainer.pop();




        thingContainer.add(thing3);
        thingContainer.printThings();

        }

    }

