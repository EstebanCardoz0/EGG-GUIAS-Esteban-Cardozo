package CursoSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Esteban
 */
@Data
@Entity
@Table (name="individuo")
public class Individuo implements Serializable {
    
    private static final Long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_individuo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String edad;
    
    
    
}//final
