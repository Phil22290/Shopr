package com.vdab.Shopr.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "game")
@Entity

public class Game extends Article{

    @Column
    private String publisher;
    @Column
    private int minAge;
    @Enumerated(EnumType.STRING)
    @Column
    private GameGenre gameGenre;

}
