package model.dao;

import Conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Veiculo;

public class VeiculoDAO {
    
    Connection con = null;
    
    public boolean inserir(Veiculo v1) throws SQLException {
        
        boolean inseriu = false;
        
            try{
                con = new Conexao().getConnection();
                System.out.println("aaaaaaaaa");
                String sql = "INSERT INTO veiculos (PLACA, MARCA, MODELO, COR, ANO, STATUS ) values (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, v1.getPlaca());
                stmt.setString(2, v1.getMarca());
                stmt.setString(3, v1.getModelo());
                stmt.setString(4, v1.getCor());   
                stmt.setInt(5, v1.getAno());
                stmt.setString(6, v1.getStatus()); 
                stmt.execute();
                stmt.close();
                inseriu = true;    
            }catch (Exception ex){
       
                ex.printStackTrace();
            }
            finally{
                con.close();  
                buscar();
            }       
            return inseriu;   
    }
    
    public boolean excluir(Veiculo v1) throws SQLException{
        
        boolean excluiu = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM veiculos WHERE Placa = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, v1.getPlaca());
            stmt.execute();
            stmt.close();
            excluiu = true;   
        }catch (Exception ex){     
            ex.printStackTrace();
        }finally{
            con.close();
            buscar();
        }
        return excluiu;
    }
    
    public ArrayList<Veiculo> buscar(){        
        ResultSet rs = null;
        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        try{            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){               
                Veiculo v1 = new Veiculo();
                v1.setPlaca(rs.getString("Placa"));
                v1.setMarca(rs.getString("marca"));
                v1.setModelo(rs.getString("modelo"));
                v1.setCor(rs.getString("cor"));
                v1.setAno(rs.getInt("ano"));
                v1.setStatus(rs.getString("status"));
                listaVeiculos.add(v1);
            }           
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return listaVeiculos;
    }
    
    public ArrayList<Veiculo> buscarManutencao() throws SQLException{        
        ResultSet rs = null;
        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        try{            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos WHERE Status='Manutenção'";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){               
                Veiculo v1 = new Veiculo();
                v1.setPlaca(rs.getString("Placa"));
                v1.setMarca(rs.getString("marca"));
                v1.setModelo(rs.getString("modelo"));
                v1.setCor(rs.getString("cor"));
                v1.setAno(rs.getInt("ano"));
                v1.setStatus(rs.getString("status"));
                listaVeiculos.add(v1);
            }           
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return listaVeiculos;
    }
    
    public ArrayList<Veiculo> buscarBom() throws SQLException{        
        ResultSet rs = null;
        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        try{            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos WHERE Status='Bom'";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){               
                Veiculo v1 = new Veiculo();
                v1.setPlaca(rs.getString("Placa"));
                v1.setMarca(rs.getString("marca"));
                v1.setModelo(rs.getString("modelo"));
                v1.setCor(rs.getString("cor"));
                v1.setAno(rs.getInt("ano"));
                v1.setStatus(rs.getString("status"));
                listaVeiculos.add(v1);
            }           
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return listaVeiculos;
    }
    
    public ArrayList<Veiculo> buscarQuebrado() throws SQLException{        
        ResultSet rs = null;
        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        try{            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos WHERE Status='Quebrado'";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){               
                Veiculo v1 = new Veiculo();
                v1.setPlaca(rs.getString("Placa"));
                v1.setMarca(rs.getString("marca"));
                v1.setModelo(rs.getString("modelo"));
                v1.setCor(rs.getString("cor"));
                v1.setAno(rs.getInt("ano"));
                v1.setStatus(rs.getString("status"));
                listaVeiculos.add(v1);
            }           
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return listaVeiculos;
    }
    
}