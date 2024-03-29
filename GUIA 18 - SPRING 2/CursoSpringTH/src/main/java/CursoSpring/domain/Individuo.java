package CursoSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Esteban
 */
@Data
@Entity
@Table(name = "individuo")
public class Individuo implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;

    @NotEmpty
    private String nombre;
    @NotEmpty

    private String apellido;
    @NotEmpty

    private String telefono;
    @NotEmpty
    @Email
    private String correo;
    @NotEmpty

    private String edad;

}//final
