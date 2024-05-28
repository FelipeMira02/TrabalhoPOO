package dao;

import models.Hospede;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospedeDAO {

    // Para inserir um hóspede no banco de dados
    public void inserirHospede(Hospede hospede) throws SQLException {
        String sql = "INSERT INTO hospedes (nome, documento, telefone) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getDocumento());
            stmt.setString(3, hospede.getTelefone());
            stmt.executeUpdate();
        }
    }

    // Para atualizar as informações de um hóspede no banco de dados
    public void atualizarHospede(Hospede hospede) throws SQLException {
        String sql = "UPDATE hospedes SET nome = ?, documento = ?, telefone = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getDocumento());
            stmt.setString(3, hospede.getTelefone());
            stmt.setInt(4, hospede.getId());
            stmt.executeUpdate();
        }
    }

    // Para excluir um hóspede do banco de dados
    public void excluirHospede(int id) throws SQLException {
        String
