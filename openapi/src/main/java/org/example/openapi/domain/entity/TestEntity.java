package org.example.openapi.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Table(name = "member")
@NoArgsConstructor
@Entity
public class TestEntity {


    @Id
    @Column(name = "seq", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int seq;

    @Column(name = "mb_id", length = 500, nullable = false)
    String mb_id;
    @Column(name = "mb_pw", length = 500, nullable = false)
    String mb_pw;
    @Column(name = "address", length = 500, nullable = false)
    String address;
    @Column(name = "mb_tell", length = 500, nullable = false)
    String mb_tell;
}

