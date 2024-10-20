public class Strings {
public static void main(String[] args){
   /* String s="Computer Science";
    System.out.println(s);
   // System.out.println(s.charAt(0));
    for(int i=0;i<s.length();i++){
        System.out.println(s.charAt(i));
    }
    s=s+"Work";
    //Strings are immutable,cannot be changed after they are created
    System.out.println(s);
    System.out.println(s.charAt(0));
    System.out.println(s.substring(5));
    System.out.println(s);
    System.out.println(s.substring(5,7));//beginning index is inclusive and end index is exclusive
    System.out.println(s.substring(0,2));
    s="   Computer Science Work ";
    System.out.println(s.strip());//remove the leading and trailing whitespace
    s=s.strip();*/
  /*  String [] ans=s.split(" ");//dividing string based on delimeter
    for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
    }
    String [] ans1=s.split("e");
    for(int i=0;i< ans1.length;i++){
        System.out.println(ans1[i]);
    }
*/

    String s="   Computer Science Work ";
    System.out.println(s.strip());//remove the leading and trailing whitespace
    s=s.strip();
    char [] res=s.toCharArray();
    res[0]='B';
    for(int i=0;i<res.length;i++){
        System.out.println(res[i]);
    }


}
}
