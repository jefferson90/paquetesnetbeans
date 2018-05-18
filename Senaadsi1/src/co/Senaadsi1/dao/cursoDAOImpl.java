/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.Senaadsi1.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;


public class cursoDAOImpl implements cursoDAO {
    
    private final String INSERTAR = "INSERT INTO usuarios("IDUSUARIO,NOMBRE,APELLIDO,TELEFONO")""VALUE(" ?, ?, ?, ?")";
    
            private Connection conexion;
            private PreparedStatament sentencia;
            private ResultSet resultados;
    @Override
    public void insertar(usuarios o) {
        try{
            conexion = new conexion ().conectar();
            sentencia = conexion.prepareStatement(INSERTAR, statement.RETURN_GENERATED_KEYS);
            sentencia.SetInt(1, o.getIdusuario());
            sentencia.SetString(2, o.getnombre());
            sentencia.SetString(3, o.getapellido());
            sentencia.SetString(4, o.getelefono());



        }
    }   

    @Override
    public void modificar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object obtenerporid(Object k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
