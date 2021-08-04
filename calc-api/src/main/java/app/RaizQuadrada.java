package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class RaizQuadrada {
    @Path("/raiz/{op}")
    @GET
    public String rotaRaizQuadrada(@PathParam String op) {
        try {
            double operando = Double.parseDouble(op);

            // O endpoint de raiz quadrada vai retornar um status adequado
            // quando o parâmetro for um número menor que zero. 
            if (operando < 0) {
                throw new BadRequestException(String.format("Parâmetro inválido:\"%s\"", op));    
            }

            // Converter op para double (verificar erros)
            // Calcula a raiz quadrada
            double sqrt = Math.sqrt(operando);

            // Retorna raiz quadrada para o usuário com duas casas decimais.
            return String.format("%.2f", sqrt);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException(String.format("Parâmetro inválido:\"%s\"", op));
        }
    }
}