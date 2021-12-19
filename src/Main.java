public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory Factory=new ConcreteFactory();
        Complex complexNumber1=Factory.createComplex();
        Complex complexNumber2=Factory.createComplex(-3,8);
        System.out.println(complexNumber1);
        System.out.println(complexNumber2);
    }
}
