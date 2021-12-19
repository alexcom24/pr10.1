public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
      //  System.out.println("0+i*0");
        return new ComplexNumber();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new ComplexNumber(real,image);
    }
}
