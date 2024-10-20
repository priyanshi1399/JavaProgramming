import java.lang.StringBuilder;
public class String_Builder {
    public static void main(String [] args) {
        StringBuilder sdb1 = new StringBuilder();
        StringBuilder sdb2=new StringBuilder();

        sdb1.append("hello");
        sdb1.append("World");
        sdb2.append("hello");
        sdb2.append("World");

        System.out.println(sdb1.toString()==sdb2.toString()); //false
        System.out.println(sdb1.toString().equals(sdb2.toString())); //true
        /*
        sdb1.toString() == sdb2.toString(): This checks if the two String objects created by toString() are the same object in memory. They are not, so it returns false.
sdb1.toString().equals(sdb2.toString()): This checks if the two String objects have the same value. They do ("helloWorld"), so it returns true.
         */

    }
}