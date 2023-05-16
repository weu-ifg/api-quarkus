package br.edu.ifg.pweb;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Veiculos {
    private final Template veiculos;

    public Veiculos(Template veiculos) {
        this.veiculos = veiculos;
    }
    @GET
    public TemplateInstance veiculos(){
        return veiculos.instance();
    }
}
