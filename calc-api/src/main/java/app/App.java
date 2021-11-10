package app;

import io.jooby.Jooby;

public class App extends Jooby {
  {
    // Declara as rotas.
    mvc(new Controller());
    mvc(new RaizQuadrada());
    mvc(new Potencia());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }
}
