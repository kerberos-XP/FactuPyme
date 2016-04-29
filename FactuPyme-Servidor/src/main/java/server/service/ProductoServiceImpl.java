package server.service;

import server.model.ProductoVO;

/**
 *
 * @author Omar Paché
 */
public class ProductoServiceImpl implements ProductoService{

    @Override
    public ProductoVO getParacetamol() {
        ProductoVO producto = new ProductoVO();
        producto.setId(1);
        producto.setNombre("Paracetamol Chile");
        return producto;
    }
    
}
