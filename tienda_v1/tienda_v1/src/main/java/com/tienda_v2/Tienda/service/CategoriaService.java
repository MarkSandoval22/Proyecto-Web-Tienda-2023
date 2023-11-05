
package com.tienda_v2.Tienda.service;

import com.tienda_v2.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Se obtiene un listado de categorias en un list
    public List<Categoria> getCategorias(boolean activos);
}
