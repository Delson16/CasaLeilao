/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
                
        conn = new conectaDAO().GetConnection();
        
        try{
            String sql = "INSERT INTO produtos (nome, valor, status) values (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getValor());
            ps.setString(3, produto.getStatus());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!\n\nInformações do produto cadastrado:\n\nNome: " + produto.getNome() + "\nValor: " + produto.getValor());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Produto não cadastrado!\n\nHouve algum erro no sistema. Tente novamente mais tarde.");
        } 
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
}

