public class RelogioDigital {
    private int hora;
    private int minuto;

    // Construtor padrão
    public RelogioDigital() {
        this.hora = 12;
        this.minuto = 20;
    }

    // Getters e setters para hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    // Getters e setters para minuto
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    // Método para avançar o tempo em 1 minuto
    public void tick() {
        if (minuto < 59) {
            minuto++;
        } else {
            minuto = 0;
            if (hora < 23) {
                hora++;
            } else {
                hora = 0;
            }
        }
    }
}
