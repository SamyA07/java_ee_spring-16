package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.controller.model.User;

public class UserJDBCDao implements UserDao {

	Connection conn;

	public void setConnection(Connection connection) {
		this.conn = connection;
	}

	public User find(String email) {
		User user = null;

		// TODO : complete query
		String query = "SELECT * FROM user WHERE email=\"" + email + "\"";

		try {
			ResultSet rs = conn.createStatement().executeQuery(query);

			// TODO : use resultSet, map to User;
			user = new User();

			user.setMail(rs.getString(1));
			user.setNom(rs.getString(2));
			user.setPrenom(rs.getString(3));
			user.setMotDePasse(rs.getString(4));

			rs.close();
		} catch (SQLException e) {
			throw new Error("Unable to find User " + email, e);
		}

		return user;
	}

	public void delete(String email) {
		// TODO : complete query
		String query = "DELETE FROM user WHERE email=\"" + email + "\"";

		try {
			conn.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			throw new Error("Unable to delete User " + email, e);
		}
	}

	public void create(User user) {
		// TODO : complete query
		String query = "INSERT INTO user VALUES(\"" + user.getMail() + "\",\"" + user.getNom() + "\",\""
				+ user.getPrenom() + "\",\"" + user.getMotDePasse() + "\")";

		try {
			conn.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			throw new Error("Unable to insert User " + user, e);
		}
	}

	public void update(User user) {
		// TODO : complete query
		String query = "UPDATE user SET lastname=\"" + user.getNom() + "\", firstname=\"" + user.getPrenom()
				+ "\", pwd=\"" + user.getMotDePasse() + "\" WHERE email=\"" + user.getMail() + "\"";

		try {
			conn.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			throw new Error("Unable to insert User " + user, e);
		}
	}

	public boolean checkPassword(String email, String password) {
		// TODO : complete query
		String query = "SELECT * FROM user WHERE email=\"" + email + "\" and pwd=\"" + password + "\"";

		try {
			ResultSet rs = conn.createStatement().executeQuery(query);
			boolean exists = rs.next();
			rs.close();
			return exists;
		} catch (SQLException e) {
			throw new Error("Unable to identified User " + email, e);
		}
	}
}
