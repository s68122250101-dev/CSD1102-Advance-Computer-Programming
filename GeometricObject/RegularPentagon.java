public class RegularPentagon extends  GeometricObject1  {
    private double p ;
    private double a ;
    private static int count;


public RegularPentagon() { 
    ++count;
}

public RegularPentagon(double p, double a,String color, boolean filled){
    this.p = p;
    this.a = a;
    setColor(color);
    setFilled(filled);
    ++count;
}
public double getp() {
    return p ;
  }
public void setp(double p) {
    this.p = p;
  }
public double geta() {
    return a ;
  }
public void seta(double a) {
    this.a = a;
  }
public double getArea() {
    return (p * a )/ 2;
  }
public int getCount(){
    return count;
  }
}