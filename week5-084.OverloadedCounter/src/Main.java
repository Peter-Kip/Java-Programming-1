public class Main {
    public static void main(String[] args) {
        // write testcode here
       Counter c = new Counter(900,false);
       Counter d = new Counter(2,false);
       
       c.decrease(55);
       d.decrease(6);
       System.out.println(c.value());
       System.out.println(d.value());
       
    }
}
