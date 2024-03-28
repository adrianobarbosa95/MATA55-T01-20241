public class Triangulo {

private float lado1;
private float lado2;
private float lado3;


public Triangulo(float lado1, float lado2, float lado3) {
  this.lado1 = lado1;
  this.lado2 = lado2;
  this.lado3 = lado3;

}

public float getLado1() {
  return lado1;
}

public float getLado2() {
  return lado2;
}

public float getLado3() {
  return lado3;
}

public void setLado1(float lado1) {
  this.lado1 = lado2;
}

public void setLado2(float lado2) {
  this.lado2 = lado2;
}
 public void setLado3(float lado3) {
  this.lado3= lado3;
}
 @Override
 public String toString() {
   return "Lado 1: " + this.lado1 + " Lado 2: " + this.lado2 + " Lado 3: " + this.lado3;

 }

public boolean isEquilatero(){
  return this.lado1 == this.lado2 && this.lado2 == this.lado3;
}

public boolean isEscaleno() {
  return this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado3 != this.lado1;
}

public boolean isIsoceles() {
  return (this.lado1 == this.lado2) || (this.lado2 == this.lado3) || (this.lado1 == this.lado3);
}


}
