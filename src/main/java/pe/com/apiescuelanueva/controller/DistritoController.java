package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.service.DistritoService;
 
//@Controller  ---> indica que es un controlador de tipo spring
//@ResponseBody ---> cuando se agreda esta anotacion se vuelve un REST
//@RestController = @Controller + @ResponseBody  aparece en la version 4 de spring

@RestController  //indica que va a ser un controlador de tipo REST

@RequestMapping("/distrito")  //--->permite definir el nombre del ENDPOINT
public class DistritoController {
    
    @Autowired
    private DistritoService distritoservice;
    
    @GetMapping  //permite obtener valores
    public List<DistritoEntity> findAll(){
      return distritoservice.findAll(); 
    }
    
    @GetMapping ("/custom") //permite obtener valores
    public List<DistritoEntity> findAllCustom(){
      return distritoservice.findAllCustom(); 
    }
    
    @GetMapping ("/{id}")
    public Optional<DistritoEntity>findById(@PathVariable Long id){
        return distritoservice.findById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return distritoservice.add(d);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity d){
        d.setCodigo(id);
        return distritoservice.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id){
        DistritoEntity objdistrito=new DistritoEntity();
        objdistrito.setEstado(false);        
        return distritoservice.delete(DistritoEntity.builder().codigo(id).build());
    }
    
}
