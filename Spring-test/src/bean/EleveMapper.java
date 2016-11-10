package bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EleveMapper implements RowMapper{

	public Eleve mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Eleve eleve = new Eleve();
		eleve.setId(rs.getInt("id"));
		eleve.setNom(rs.getString("nom"));
		eleve.setNick(rs.getString("nick"));
		return eleve;
	}

	
	
}
