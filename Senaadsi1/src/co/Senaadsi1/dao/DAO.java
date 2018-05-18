/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.Senaadsi1.dao;

import java.util.List;

/**
 *
 * @author jeffe
 * @param <O>
 * @param <K>
 */
public interface DAO <O,K>{
    public void insertar (O o);
    public void modificar (O o);
    public void eliminar (O o);
    public O obtenerporid (K k);
    public List <O> listar ();
}
