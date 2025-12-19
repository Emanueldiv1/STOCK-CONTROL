package br.com.stock_control.user.entity;

import br.com.stock_control.Enuns.Setor;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

@Table(name = "tb_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    @NotNull
    private String email;

    @Column(nullable = false)
    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Setor setor;

}
