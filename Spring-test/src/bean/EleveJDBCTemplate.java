package bean;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EleveJDBCTemplate {

	private DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds){
		this.ds = ds;	
		this.jdbcTemplate = new JdbcTemplate(ds);
		System.out.println("set datasource");
	}

	public void create(String nom, String nick){
		String sql = "INSERT INTO eleves(nom, nick) VALUES(?, ?)";
		jdbcTemplate.update(sql, nom, nick);
		System.out.println("création");
	}

	public Eleve getEleve(Integer id){
		String sql = "SELECT * FROM eleves WHERE id = ?";
		Eleve eleve = (Eleve)jdbcTemplate.queryForObject(sql, new Object[]{id}, new EleveMapper());
		return eleve;
	}
	
	public List<Eleve> listEleves(){
		String sql = "SELECT * FROM eleves";
		List<Eleve> listELeves = (List<Eleve>)jdbcTemplate.query(sql, new EleveMapper());
		System.out.println("Get all");
		return listELeves;
	}
	
	public void delete(Integer id){
		String sql = "DELETE FROM eleves WHERE id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Suppression");
	}
	
	public void update(Integer id, String nick){
		String sql = "UPDATE eleves SET nick = ? WHERE id = ?";
		jdbcTemplate.update(sql, nick, id);
		System.out.println("Mise à jour");
	}
}
