package tn.isg.soa.gestion_elections.Models;
import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Avis {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private AvisID Id;
    @NonNull
    private int Note ;
    @NonNull
    private String Commentaire ;
    @ManyToOne
    @MapsId("idCandidat")
    private Candidat can;
    @ManyToOne
    @MapsId("idElecteur")
    private Electeur elec;

}
