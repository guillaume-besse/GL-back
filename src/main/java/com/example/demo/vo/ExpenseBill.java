package com.example.demo.vo;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExpenseBill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String descritpion;
    @OneToMany
    @JoinTable(
            name = "line_in_exepense_bill",
            joinColumns = @JoinColumn(name = "expense_id"),
            inverseJoinColumns = @JoinColumn(name = "line_id"))
    private List<LineBill> listLineBill;
    // TODO liste d'avances
    private LocalDate date; //TODO format de la date pour les mois
    private float amount;
    private BillStates state;
    //TODO User


}
