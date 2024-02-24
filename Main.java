public class Main {
    public static void main(String[] args) {
        MyFuncInter addn = (a,b) -> a+b;
        MyFuncInter subs = (a,b) -> a-b;
        MyFuncInter mult = (a,b) -> a*b;

        System.out.println(addn.Clac(1,2));
        System.out.println(subs.Clac(5,3));
        System.out.println(mult.Clac(2,3));

        Animal a1 = new Animal();
        Animal d1 = new Dog();
        Animal p1 = new Pig();

        a1.makeSound();
        d1.makeSound();
        p1.makeSound();
    }
}
