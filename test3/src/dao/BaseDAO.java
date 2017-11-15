package dao;

import java.util.List;

public interface BaseDAO<T> {

	public List<T> find ();
	public void delete (int id);
	public void update(T object);
	public void save(T object);
}
