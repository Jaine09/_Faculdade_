import java.text.DecimalFormat;

public class Devedor {
    private String nome;
    private String sobrenome;
    private double valorDevido;

    public Devedor(String nome, String sobrenome, double valorDevido) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valorDevido = valorDevido;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00"); // Formata para moeda
        return String.format("%-10s %-15s (Devendo: %s)", nome, sobrenome, df.format(valorDevido));
    }
}