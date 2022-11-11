package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;

public interface ApoderadoService {
     // funcion que te permita mostrar todos los datos    
    List<ApoderadoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ApoderadoEntity> findById(Long id);
    
    //funcion para registrar datos
    ApoderadoEntity add(ApoderadoEntity a);
    
    //funcion para actualizar datos
    ApoderadoEntity update(ApoderadoEntity a);
    
    //funcion para eliminar datos
    ApoderadoEntity delete(ApoderadoEntity a);
}
