package bean;



import java.util.List;

import javax.sql.DataSource;

public interface EleveDAO {

	public void setDataSource(DataSource ds);
	public void create(String name, String nick);
	public Eleve getEleve(Integer id);
	public List<Eleve>listEleves();
	public void delete(Integer id);
	public void update(Integer id, String nick);
}
