package ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Alana";

    void print(final String param){
        String lastName = "Camargo";
        class LocalClass{
            // final
            // abstract
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();

    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Gustavo");
    }
}
