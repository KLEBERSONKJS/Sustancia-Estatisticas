package com.ads.sustancia.model;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Entrevistador implements UserDetails {

    @Id
    private String id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private UsuarioStatusEnum status;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @ManyToOne
    @JoinColumn(name = "coordenador_id")
    private Coordenador coordenador;

    private static final AtomicLong contador = new AtomicLong(1);

    public Entrevistador(String nome, String email, String senha,
            LocalDate dataNascimento, UserRole userRole) {
        this.id = gerarId();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.role = userRole;
        this.status = UsuarioStatusEnum.PENDENTE;

    }

    private String gerarId() {
        DecimalFormat format = new DecimalFormat("0000");
        return "SUSTANCIA-" + format.format(contador.getAndIncrement());
        
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN)
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else
            return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @OneToMany(mappedBy = "entrevistador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pessoa> entrevistados;

}
