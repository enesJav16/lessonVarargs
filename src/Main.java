import java.util.Locale;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
//        int c=0;
//        for (int i = 0; i < 10; i++) {
//            c = random1.nextInt(1,100);
//            System.out.println(c);
//        }

//        myVar(c);

//        System.out.println(myVarargs(1,2,3,4,5,6,7,8,9,10));
//        myVar(1,2,3,4,5,6,7,8,9,10);


        //for each
//        int []d={1,2,3,4,5};
//        for (int i:d){
//            System.out.println(i+i);
//        }

//        String [] name={"enes","said","max"};
//        for (String i:name){
//            System.out.println(i+" is Java developer");
//        }

        //String methods
        String word =" Qwerty&";
        String a =" Qwerty&";
        System.out.println(word.charAt(3));// charAt() symbol at that  index.
        System.out.println(word.substring(0,3));// substring() symbols in range.
        System.out.println(word.contains("xs"));// contains() will check is there any similar symbols (true, false)
        System.out.println(word.toUpperCase());// toUpperCase() will make symbols uppercase
        System.out.println(word.toLowerCase());// will make lower case
        System.out.println(word.trim());// will trim spaces before and after""
        System.out.println(word.equals("we"));// will compare symbols fully
        System.out.println(word.replace("e","E"));// will replace target symbol or symbols
        System.out.println(word.concat(a));
    }

    public static int myVarargs (int...a){
        int b =0;
        for (int i = 0; i < a.length; i++) {
            b+=a[i];
        }
        return b;
    }

    public static void myVar (int...a){
        int b =0;
        for (int i = 0; i < a.length; i++) {
            b+=a[i];
        }
        System.out.println(b);
    }
}