public class ValidadorCPF {

    /**
     * Método responsável por validar um CPF.
     * Um CPF válido deve ter 11 dígitos numéricos e passar pelo cálculo de verificação.
     *
     * @param cpf Número do CPF em formato de string (somente números).
     * @return Retorna `true` se o CPF for válido e `false` caso contrário.
     */
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int primeiroDigito = (soma * 10) % 11;
        if (primeiroDigito == 10) primeiroDigito = 0;

        if (numeros[9] != primeiroDigito) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        int segundoDigito = (soma * 10) % 11;
        if (segundoDigito == 10) segundoDigito = 0;

        return numeros[10] == segundoDigito;
    }

    /**
     * Método responsável por formatar um CPF para o padrão XXX.XXX.XXX-XX.
     *
     * @param cpf Número do CPF em formato de string (somente números).
     * @return Retorna o CPF formatado ou null se o CPF não tiver exatamente 11 números.
     */
    public static String formatarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return null;
        }

        return cpf.substring(0, 3) + "." +
               cpf.substring(3, 6) + "." +
               cpf.substring(6, 9) + "-" +
               cpf.substring(9, 11);
    }

    public static void main(String[] args) {
        String cpf = "12345678909";

        if (validarCPF(cpf)) {
            System.out.println("CPF válido!");
            System.out.println("CPF formatado: " + formatarCPF(cpf));
        } else {
            System.out.println("CPF inválido!");
        }
    }
}