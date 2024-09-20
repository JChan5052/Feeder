public class Main
{ public static void main(String[] args)
 {
Feeder g =new Feeder(5000);
g.simulateManyDays(0, 0);
System.out.println(g.simulateManyDays(10,10));

}
}