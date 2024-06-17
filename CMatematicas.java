package CMatematicas;

public class CMatematicas {
    private int num1, num2;
    private int x, y, a, b;
    private double radius;

    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int AreaRectangulo() {
        return num1 * num2;
    }

    public int AreaTriangulo() {
        return (x * y) / 2;
    }

    public double Division() {
        if (b != 0) {
            return (double) a / b;
        } else {
            return Double.NaN;
        }
    }

    public double VolumenEsfera() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double Hipotenusa() {
        return Math.sqrt(a * a + b * b);
    }
}
