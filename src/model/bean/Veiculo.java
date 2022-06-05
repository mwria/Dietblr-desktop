
package model.bean;

public class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String status;

    public Veiculo() {
        
    }

    
    
    public String getMarca() {
        return marca;
    }

   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }

  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
    public Veiculo(String placa, String marca, String modelo, String cor, int ano, String status){     
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.status = status;
    }
    
}
