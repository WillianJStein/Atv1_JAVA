public class Exchange {
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1;

    
    public double comprarDolar(double valorReal) {
        
        
        double valorDolar = valorReal / cotacaoDolar;  // Conversão do Real para Dólar
        double valorDolarComIOF = valorDolar * (1 - iof);
        double valorDolarComTaxa = valorDolar * (1 - taxaOperacaoEmPercentual / 100); 
    
        return valorDolarComTaxa;  // Retorna o valor final
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
