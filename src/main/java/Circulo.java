public class Circulo {
    
    private float raio;
    private float pi = 3.14159f;

    public Circulo(float raio){
        this.raio = raio;

    }
    
    public void setRaio(float raio){
        this.raio = raio;
    }
    public float getRaio(){
        return raio;
    }

    public float getCircunferencia(){
        return 2*pi*raio;
    }
    public float getArea(){
        return pi*raio*raio;
    }
}
