package br.com.dio.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();
}
