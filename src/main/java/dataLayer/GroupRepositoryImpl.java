package dataLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import entities.Group;

public class GroupRepositoryImpl implements GroupRepository{
	  private Connection conn;

	  public GroupRepositoryImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Group> findAll() {
		List<Group> lst = null;
	    String sql = "SELECT * FROM group";
	    Statement statement;
		try {
			statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				Group g = new Group(result.getString(0), result.getString(1));
				lst.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return lst;
	}

}
