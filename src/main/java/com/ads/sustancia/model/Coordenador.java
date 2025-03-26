package com.ads.sustancia.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Coordenador implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private UsuarioStatus status;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    
   

    public Coordenador(String nome, String email, String senha,
            LocalDate dataNascimento, UserRole userRole) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.role = userRole;
        this.status = UsuarioStatus.PENDENTE;

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
    
    }


    

