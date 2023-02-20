package com.tech.max.hrWorker.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "tb_worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dalyincome;

}
