package service;

import java.util.List;

public interface BaseService<T> {

	public List<T> find();
	public void delete(T object);
	public void update(T object);
	public void save(T object);
}
