package br.com.dio.desafio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoararia;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoararia(int i) {
        return cargaHoararia;
    }

    public void setCargaHoararia(int cargaHoararia) {
        this.cargaHoararia = cargaHoararia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoararia=" + cargaHoararia +
                '}';
    }


    }

