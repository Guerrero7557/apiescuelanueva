package pe.com.apiescuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor; //te genera constructor con parametros
import lombok.NoArgsConstructor;  //te genera constructor sin parametros
import lombok.Data;
import lombok.Builder;

@Builder  //Genera la clase
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data               //genera getters and setters
@Entity(name = "DistritoEntity")  //define la entidad con la que se va a trabajar
@Table(name = "distrito")

public class DistritoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "coddis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name= "nomdis")
    private String nombre;
    @Column(name="estdis")
    private boolean estado;
}
