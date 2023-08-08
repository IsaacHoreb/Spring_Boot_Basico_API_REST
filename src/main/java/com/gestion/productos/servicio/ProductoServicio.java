package com.gestion.productos.servicio;

import com.gestion.productos.modelos.Producto;
import com.gestion.productos.repositorio.ProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductosRepositorio repositorio;

    public List<Producto> listarProducto() {
        return repositorio.findAll();
    }


    //FUNCIONES

    public void guardarProducto(Producto producto) {
        repositorio.save(producto);
    }

    public Producto obtenerProductoPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public void eliminarProducto(Integer id) {
        repositorio.deleteById(id);
    }

}
