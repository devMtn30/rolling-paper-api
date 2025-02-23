package com.memorymakerpeople.memoryrollingpaper.member.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@DynamicUpdate // 변경한 필드만 대응
@Table(name = "tbl_user")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotNull
    private String username;//아이디
    @NotNull
    private String email;
    private String nickname;
    private String password;

    @Builder
    public Member(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}