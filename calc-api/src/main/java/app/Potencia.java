package app;

public class Potencia {

    public double potencia(String baseStr, String expoenteStr) throws IllegalArgumentException {
        double base = 0.;
        try {
            base = Double.parseDouble(baseStr);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("Base inválida:\"%s\"", baseStr));
        }
        double expoente = 0.;
        try {
            expoente = Double.parseDouble(expoenteStr);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("Expoente inválido:\"%s\"", expoenteStr));
        }
        return Math.pow(base, expoente);
    }
}