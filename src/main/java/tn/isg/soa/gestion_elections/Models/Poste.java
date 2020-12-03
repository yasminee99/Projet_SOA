package tn.isg.soa.gestion_elections.Models;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Poste {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long Id;
    @NonNull
    private String Titre ;
    @NonNull
    private String Lieu ;
    @NonNull
    private Date DateDebut ;
    @NonNull
    private Date DateFin ;

    @ManyToOne
    @JoinColumn(name="IdCandidat")
    private Candidat candidat ;
}

