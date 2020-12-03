package tn.isg.soa.gestion_elections.Models;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "Photo")
public class Candidat {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long Id;
    @NonNull
    private String Nom;
    @NonNull
    private String Prenom ;
    @NonNull
    private Date DateNaiss ;
    @NonNull
    private String Mail;
    @NonNull
    private String Fb;
    @NonNull
    private String Twitter;
    @NonNull
    private String Linkedin;
    @NonNull
    private Long Score;

    @NonNull
    @Lob
    private byte [] Photo;

    @ManyToOne
    @JoinColumn (name="IdParti" )
    private Parti parti ;

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<Formation> Formations = new HashSet<>();

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<Poste> Postes = new HashSet<>();

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<Activite> Activites = new HashSet<>();

    @OneToMany(mappedBy = "can",cascade=CascadeType.ALL)
    private Set <Avis> avisCan = new HashSet<>();

 @ManyToOne
    @JoinColumn(name="IdListe")
    private ListeElectorale Liste;

   /* @ManyToOne
    @JoinColumn(name="IdListe")
    private ListePresidentielle Listep ;*/
}

