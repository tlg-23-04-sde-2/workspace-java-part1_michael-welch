/*
 * Client-side main class to create a few instances of television
 * and give them a basic test-drive.
 */
class TelevisionClient {
    public static void main(String[] args) {
        // print instance count #
        System.out.println(Television.getInstanceCount() + " instances");

        //create a greeting String
        String greeting = "Hello, this is the greeting string!";
        System.out.println(greeting);
        System.out.println();

        //create a TV object
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        //turn it on
        tv1.turnOn();

        //create a 2nd TV object
        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.turnOn();

        //create a 3rd TV object without adding properties
        Television tv3 = new Television("LG");
        tv3.turnOn();

        System.out.println();  // create a blank line

        //turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());  // don't need to add the .toString()
        System.out.println(tv3);             // if you pass an object ref it defaults to toString()

        // print instance count #
        System.out.println(Television.getInstanceCount() + " instances");

    }
}