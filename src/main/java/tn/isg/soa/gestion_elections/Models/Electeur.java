package tn.isg.soa.gestion_elections.Models;
import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Electeur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long Id;
    @NonNull
    private String Nom ;
    @NonNull
    private String Prenom;
    @NonNull
    private Date DateNaiss;
    @NonNull
    private String Mail ;
    @NonNull
    private String Mdp;
    @NonNull
    private Boolean Role;
    @OneToMany(mappedBy = "elec",cascade=CascadeType.ALL)
    private Set <Avis> avisElec = new HashSet<>();
}
