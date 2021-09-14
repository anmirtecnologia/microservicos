package br.com.treinaweb.springbootapi.entity;

//@Entity
public class Pessoa
{
//    @ApiModelProperty(value = "Código da pessoa")
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//
//    @ApiModelProperty(value = "Nome da pessoa")
//    @Column(nullable = false)
    private String nome;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(long id) {
        this.id = id;
    }
}