package com.mounika.javacore.dbconnections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class PersonDAO {
	public void insert(int id, String name, int age) throws SQLException {
		Connection con = SqlConnection.getConnection();
		String insertTableSQL = "INSERT INTO Person" + "(id,name,age) VALUES" + "(?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertTableSQL);
		ps.setInt(1, id);
		ps.setString(2, name);

		ps.setInt(3, age);
		ps.executeUpdate();
		System.out.println("row inserted");
	}

	public void getPerson(int id) throws SQLException {
		Connection con = SqlConnection.getConnection();
		String selectTableSQL = "SELECT *FROM Person WHERE id=?";
		PreparedStatement ps = con.prepareStatement(selectTableSQL);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
		}
	}

	public void updatePerson(int id, String name) throws SQLException {
		Connection con = SqlConnection.getConnection();
		String updateTableSQL = "UPDATE Person SET name=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(updateTableSQL);
		ps.setInt(2, id);
		ps.setString(1, name);
		ps.executeUpdate();
	}

}
