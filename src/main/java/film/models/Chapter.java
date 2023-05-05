package film.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private String ChapterName;

    @NotNull
    private int ChapterNumber;

    @NotNull
    private String Video;

    @NotNull
    @OneToOne
    @JoinColumn(name = "filmId")
    private Film Film;

    @NotNull
    private String ChapterDescription;

    @NotNull
    private String TrailerChapter;

    @NotNull
    private String ChapterImage;

    @NotNull
    private Date ChapterCreateDay;

    @NotNull
    private Date ChapterPremieredDay;

    @NotNull
    private String ChapterStatus;
}
