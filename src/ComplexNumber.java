
public class ComplexNumber implements Complex{
    private int real;
    private int image;
    public ComplexNumber(int real, int image) {
        this.real=real;
        this.image=image;
    }
    public ComplexNumber() {
        real=0;
        image=0;
    }
    @Override
    public String toString() {
        if (image>=0)
        return "ComplexNumber: "  + real+"+"+"i*"+image;
        else
            return "ComplexNumber: "  + real+"-"+"i*"+Math.abs(image);
    }

    // Методы для работы с созданным комплексным числом
}
