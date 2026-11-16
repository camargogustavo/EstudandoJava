package ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name =  "Gustavo";
    //Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 OuterClass = new OuterClassesTest01();
        Inner inner2 = new OuterClassesTest01().new Inner();
        Inner inner = OuterClass.new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
