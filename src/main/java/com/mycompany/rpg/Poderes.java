
package com.mycompany.rpg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class Poderes {
    private int id;
    private String tipo;
    private String nome;
    private int dano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    /*public void inspecionar(Poderes poderes) throws SQLException { //criar classe poderes Poderes poderes
    Conexao c = new Conexao();
    try (Connection conn = c.getConexao()) {
    
    String sql = "SELECT * FROM poderes";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    
    if (rs.next()) {
    int id = rs.getInt("id");
    String tipo = rs.getString("tipo");
    String nome = rs.getString("nome");
    int dano = rs.getInt("dano");
    }
    
    }
    
    }*/
}