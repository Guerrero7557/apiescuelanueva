package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;

public interface ParentescoService {
     // funcion que te permita mostrar todos los datos    
    List<ParentescoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ParentescoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ParentescoEntity> findById(Long id);
    
    //funcion para registrar datos
    ParentescoEntity add(ParentescoEntity p);
    
    //funcion para actualizar datos
    ParentescoEntity update(ParentescoEntity p);
    
    //funcion para eliminar datos
    ParentescoEntity delete(ParentescoEntity p);
}
