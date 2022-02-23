package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Potencia {
    @Path("/potencia/{base}/{expoente}")
    @GET
    public String rotaRaizQuadrada(@PathParam String base, @PathParam String expoente) throws BadRequestException {
        try {
            double pot = potencia(base, expoente);
            return String.format("%.2f", pot);
        } catch (IllegalArgumentException iae) {
            throw new BadRequestException(iae.getMessage());
        }
    }

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