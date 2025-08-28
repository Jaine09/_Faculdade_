public class Veiculo {
    private String placa;
    private String modelo;
    private String fabricante;

    public Veiculo(String placa, String modelo, String fabricante) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " | Modelo: " + modelo + " | Fabricante: " + fabricante;
    }
}