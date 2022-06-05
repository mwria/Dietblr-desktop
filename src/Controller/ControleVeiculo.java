package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Veiculo;
import model.dao.VeiculoDAO;

public class ControleVeiculo {
    
    public boolean insereVeiculo(String placa, String marca, String modelo, String cor, int ano, String status) throws SQLException{
        
        Veiculo v1 = new Veiculo (placa, marca, modelo, cor, ano, status);
        VeiculoDAO v1DAO = new VeiculoDAO();
        boolean inseriu = v1DAO.inserir(v1);
        return inseriu;
        
    } 
    
    public boolean excluiVeiculo(String placa, String marca, String modelo, String cor, int ano, String status) throws SQLException{
        
        Veiculo v1 = new Veiculo (placa, marca, modelo, cor, ano, status);
        VeiculoDAO v1DAO = new VeiculoDAO();
        boolean excluiu = v1DAO.excluir(v1);
        return excluiu;
        
    }
    
    public ArrayList<Veiculo> buscarVeiculo() throws SQLException{
        VeiculoDAO v1DAO = new VeiculoDAO(); 
        return (v1DAO.buscar());
    }
    
    public ArrayList<Veiculo> buscarManutencao() throws SQLException{
        VeiculoDAO v1DAO = new VeiculoDAO(); 
        return (v1DAO.buscarManutencao());
    }
    
    public ArrayList<Veiculo> buscarBom() throws SQLException{
        VeiculoDAO v1DAO = new VeiculoDAO(); 
        return (v1DAO.buscarBom());
    }
    
    public ArrayList<Veiculo> buscarQuebrado() throws SQLException{
        VeiculoDAO v1DAO = new VeiculoDAO(); 
        return (v1DAO.buscarQuebrado());
    }

    public boolean insereVeiculo(String text, String text0, String text1, String text2, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean excluiVeiculo(String text, String text0, String text1, String text2, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
