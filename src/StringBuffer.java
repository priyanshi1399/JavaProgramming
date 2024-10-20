import java.lang.StringBuffer;
class StringBuffer1 {
    public static void main(String[] args) {
        String s = "Computer Science Work";
        //String Buffer
        //thread safe->one thread will modify other will use
        //have synchronization
        //Synchronization overgead
        //helps in multithreading
        //String Builder-mutable
        //diff is they are not synchronized
        //in builder-overhead

       StringBuffer sb=new StringBuffer();
       sb.append("Hello");
       sb.append("World");
        System.out.println(sb.toString());
        StringBuilder sdb=new StringBuilder("Hi");
        sdb.append("hello");
        sdb.append("World");
        System.out.println(sdb.toString());

    }
}