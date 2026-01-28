public class basic1 {
    public static void main(String[] args) {
       
        int a=10;
        int b=20;
        System.out.println(a>b&&b<a);
        a+=b;
        System.out.println(b%a!=0||a>b);
        b+=2;
        System.out.println(b%a!=0);
        b/=a;
        System.out.println(a%2!=0||b%2==0);
        b+=a;
        System.out.println(a%2!=0||b%2==0);
    }
}
