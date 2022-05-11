public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //int double and bool are most commonly used
        //short and float are rarely used
        //byte and char are functionally obsolete

        //other data types can be created with "classes" to be covered in later lessons

        //strings is a class not a primitive type, it's a sequence of characters.
        //string is limited to 2.14 billion characters

        String myString = "This is a string!";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        //appends as data is not numeric type
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        //appends as one of the data types isn't numeric, number primitive is converted to string before being processed
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47D;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        //strings are immutable, changes are actually creating a new string
        //appending strings is inefficient, will use stringbuffer once we learn about classes


    }
}