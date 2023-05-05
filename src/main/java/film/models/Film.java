package film.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private String FilmName;

    @NotNull
    private String FilmDescription;

    @NotNull
    private String BannerFilmName;

    @NotNull
    private int FilmBollen;

    @NotNull
    private String TrailerFilm;

    @NotNull
    private String FilmImage;
}
