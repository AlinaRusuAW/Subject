package com.example.subject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "discipline", schema = "public")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @NotBlank(message = "Cimp obligatoriu!")
   // @Size(min=3, max=50, message = "Lungimea cimpului in intervalul de 3 - 50 caractere.")
    @Column(name = "denumire")
    private String denumire;

   // @NotBlank(message = "Cimp obligatoriu!")
   // @Size(min=3, max=30, message = "Lungimea cimpului in intervalul de 3 - 30 caractere.")
    @Column(name = "profesor")
    private String profesor;

   // @NotBlank(message = "Cimp obligatoriu!")
   // @Size(min=2, max=30, message = "Lungimea cimpului in intervalul de 2 - 30 caractere.")
    @Column(name = "grupa")
    private String grupa;
    
}
