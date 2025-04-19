public class Parent {
    static void strict(){
        System.out.println("Parents have to be strict!");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.strict();
        c.strict();
    }
}
class Child extends Parent{
  static void strict(){
        System.out.println("Childs are naughty!");

    }

}