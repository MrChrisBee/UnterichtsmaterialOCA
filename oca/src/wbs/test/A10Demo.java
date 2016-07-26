package wbs.test;
class A10 {
}
interface I101 {
}
interface I102 {
}
public class A10Demo extends A10 implements I101 {
public static void main(String[] args) {
Object o = new A10Demo();
System.out.println(o instanceof I101);
System.out.println(o instanceof A10);
System.out.println(o instanceof A10Demo);
System.out.println(o instanceof String);
I101 i101 = new A10Demo();
System.out.println(i101 instanceof I101);
System.out.println(i101 instanceof A10);
System.out.println(i101 instanceof A10Demo);
System.out.println(i101 instanceof I102);
//System.out.println(i101 instanceof String);
}
}