package javaleix;

/**
 * @Author Simple
 * @Create 2021/7/1 15:56
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("a.equals(b): "+a.equals(b));
        System.out.println("a==b "+ (a==b));
        System.out.println("a==c "+ (a==c));
        System.out.println("a.equals(c) "+a.equals(c));
        System.out.println("a.substring(0,3)==\"hel\"  "+(a.substring(0,3)=="hel")); /**但实际上只有字符串常量是共享的，而 + 或 substring 等操作产生的结果并不是共享的 */
        System.out.println("a.compareTo(b): "+(a.compareTo(b)));
        System.out.println("a.compareTo(c): "+(a.compareTo(c)));

        char first = a.charAt(0);
        char last = a.charAt(4);
        System.out.println("first = "+first+" "+"last = "+last);
        int index = a.offsetByCodePoints(0, 4);
        int cp = a.codePointAt(index);
        System.out.println(cp);


        int str = a.indexOf("llo");
        System.out.println(str);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("he").append("llo");

        String aa = stringBuilder.toString();

        System.out.println(stringBuilder);
        System.out.println(aa);
        System.out.println(stringBuilder.equals(aa));



        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("Ok");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
        System.out.println(s==t);
    }


}
