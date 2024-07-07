package treinamento.loja_virtual.loja_virtual.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "MARCA_PRODUTO")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class MarcaProduto {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
        private Long id;

        @NotNull
        @Column(nullable = false)
        private String nomeDesc;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNomeDesc() {
                return nomeDesc;
        }

        public void setNomeDesc(String nomeDesc) {
                this.nomeDesc = nomeDesc;
        }

        @ManyToOne(targetEntity = PessoaJuridica.class)
        @JoinColumn(name = "empresa_id", nullable = false,
                foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "empresa_id_fk"))
        private PessoaJuridica empresa;

    }
