public class StringOverview {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.println("Character at " + i + " index ="+ s.charAt(i));
        }
    }
}
