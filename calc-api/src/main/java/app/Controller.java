package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi() {
    return "Bem-vidos(as) a API calculadora!";
  }
}
