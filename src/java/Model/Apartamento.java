package Model;

import java.util.Objects;

/**
 *
 * @author Gabriel Rocha
 */
public class Apartamento extends Entidade{
    private Integer inquilino;
    private Integer proprietario;
    private String edificio;
    private String numero;
    private double aluguel;
    private String observacao;

    public Integer getInquilino() {
        return inquilino;
    }

    public void setInquilino(Integer inquilino) {
        this.inquilino = inquilino;
    }

    public Integer getProprietario() {
        return proprietario;
    }

    public void setProprietario(Integer proprietario) {
        this.proprietario = proprietario;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getDescricao() {
        String name = getNumero();
        if(getEdificio()!=null){
            name+=" - "+getEdificio();
        }
        return name;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.inquilino);
        hash = 23 * hash + Objects.hashCode(this.proprietario);
        hash = 23 * hash + Objects.hashCode(this.edificio);
        hash = 23 * hash + Objects.hashCode(this.numero);
        hash = 23 * hash + Objects.hashCode(this.aluguel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apartamento other = (Apartamento) obj;
        if (!Objects.equals(this.inquilino, other.inquilino)) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        if (!Objects.equals(this.edificio, other.edificio)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.aluguel, other.aluguel)) {
            return false;
        }
        return true;
    }
    
}
