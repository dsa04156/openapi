package org.example.openapi.domain.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Table(name = "member")
@NoArgsConstructor
public class TestDto {
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

    @Builder
    public TestDto(String mb_id, String mb_pw, String address, String mb_tell) {
        this.mb_id = mb_id;
        this.mb_pw = mb_pw;
        this.mb_tell = mb_tell;
        this.address = address;

    }
}
