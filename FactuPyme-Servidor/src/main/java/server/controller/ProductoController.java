package server.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import server.model.ProductoVO;
import server.service.ProductoServiceImpl;
import server.service.ProductoService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class ProductoController {

    /**
     * Manejo de peticiones HTTP de tipo GET
     *
     * @return Objeto de tipo Producto retornado en formato JSON
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoVO getProducto() {
        ProductoService servicioProducto = new ProductoServiceImpl();
        return servicioProducto.getParacetamol();
    }
}
