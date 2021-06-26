package com.vdab.Shopr.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "lp")
@Entity

public class Lp extends Article{
    
    @Column
    private String author;
    @Column
    @Enumerated(EnumType.STRING)
    private LpGenre lpGenre;
    
    
}
