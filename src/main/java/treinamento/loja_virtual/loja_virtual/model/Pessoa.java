package treinamento.loja_virtual.loja_virtual.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", initialValue = 1, allocationSize = 1)
public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
    private Long id;

    //@Size(min = 4, message = "O nome deve ter no minimo 4 letras")
    //@NotBlank(message = "Nome deve ser informado")
    @NotNull
    @Column(nullable = false)
    private String nome;

    //@Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column
    private String tipoPessoa;

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Endereco> enderecos = new ArrayList<Endereco>();
//
//
//    @ManyToOne(targetEntity = PessoaJuridica.class)
//    @JoinColumn(name = "empresa_id", nullable = true,
//            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "empresa_id_fk"))
//    private PessoaJuridica empresa;
//
//
//
//    public Endereco enderecoEntrega() {
//
//        Endereco enderecoReturn = null;
//
//        for (Endereco endereco : enderecos) {
//            if (endereco.getTipoEndereco().name().equals(TipoEndereco.ENTREGA.name())) {
//                enderecoReturn = endereco;
//                break;
//            }
//        }
//
//        return enderecoReturn;
//    }
//
//
//
//    public PessoaJuridica getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(PessoaJuridica empresa) {
//        this.empresa = empresa;
//    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }


//    public void setEnderecos(List<Endereco> enderecos) {
//        this.enderecos = enderecos;
//    }
//
//    public List<Endereco> getEnderecos() {
//        return enderecos;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}