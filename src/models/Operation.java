package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Operation {

    private int codeOperation;
    private String numeroCompteDebite;
    private String numeroCompteCredite;
    private Double montantOperation;
    private String typeOperation;

    public Operation(int codeOperation, String numeroCompteDebite, String numeroCompteCredite, Double montantOperation, String typeOperation) {
        this.codeOperation = codeOperation;
        this.numeroCompteDebite = numeroCompteDebite;
        this.numeroCompteCredite = numeroCompteCredite;
        this.montantOperation = montantOperation;
        this.typeOperation = typeOperation;
    }

    public int getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(int codeOperation) {
        this.codeOperation = codeOperation;
    }

    public String getNumeroCompteDebite() {
        return numeroCompteDebite;
    }

    public void setNumeroCompteDebite(String numeroCompteDebite) {
        this.numeroCompteDebite = numeroCompteDebite;
    }

    public String getNumeroCompteCredite() {
        return numeroCompteCredite;
    }

    public void setNumeroCompteCredite(String numeroCompteCredite) {
        this.numeroCompteCredite = numeroCompteCredite;
    }

    public Double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(Double montantOperation) {
        this.montantOperation = montantOperation;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }
}
