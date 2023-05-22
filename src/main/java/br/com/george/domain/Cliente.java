package br.com.george.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="tb_cliente")
public class Cliente implements Persistente{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1,allocationSize = 1)
	private Long id;
	
	@Column(name = "nome", nullable = false,length = 50 )
	private String nome;
	
	
	@Column(name = "cpf", nullable = false, unique = true)
    private Long cpf;
    
	@Column(name = "tel", nullable = false)
    private Long tel;
    
	@Column(name = "endereco", nullable = false,length = 100)
    private String end;
    
	@Column(name = "numero", nullable= false)
    private Integer numero;
    
	@Column(name = "cidade",nullable = false,length = 100)
    private String cidade;
    
	@Column(name = "estado",nullable=false,length = 50)
    private String estado;

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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public Long getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
