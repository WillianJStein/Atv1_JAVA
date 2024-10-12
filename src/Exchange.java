// public class Exchange {

//     private final double cotacaoDolar = 5.5;
//     private final double iof = 0.0586;
//     private final double taxaOperacaoEmPercentual = 1;

//     public double comprarDolar(double valorReal) {
//         double valorDolar = valorReal / cotacaoDolar;
//         valorDolar -= valorDolar * iof;
//         valorDolar -= valorDolar * taxaOperacaoEmPercentual / 100; // converte porcentagem para decimal
//         return valorDolar;
//     }

//     public static void main(String[] args) {
//         Exchange exchange = new Exchange();
//         double valorReal = 1000;
//         double valorDolar = exchange.comprarDolar(valorReal);
//         System.out.println("Valor em dólar: " + valorDolar);
//     }
// }


public class Exchange {
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 0.01;

    @SuppressWarnings("unused")
    public double comprarDolar(double valorReal) {
        // 1. Converter o real para dólar
        double valorDolar = valorReal / cotacaoDolar;
        // 2. Descontar o IOF
        double valorDolarComIOF = valorDolar * (1 - iof);
        // 3. Descontar a taxa de operação
        double taxaOperacao = valorDolar * taxaOperacaoEmPercentual;
        double valorFinal = valorDolarComIOF - taxaOperacao;
        
        return valorFinal;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}