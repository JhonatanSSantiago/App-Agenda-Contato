package com.jhonssantiago.agendacontatos;

public class Contato {
    private int id;
    private int foto;
    private String nome;
    private String sobrenome;
    private String numero;
    private String email;
    private String endereço;
    private String dataNascimento;

    public Contato(int id, int foto, String nome, String sobrenome, String numero, String email, String endereço, String dataNascimento) {
        this.id = id;
        this.foto = foto;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.email = email;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", foto=" + foto +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                ", endereço='" + endereço + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
