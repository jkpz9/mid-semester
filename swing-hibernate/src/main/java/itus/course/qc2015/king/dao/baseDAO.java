package itus.course.qc2015.king.dao;

import java.util.List;

public interface baseDAO<T> {
	boolean add(T entity);
	boolean update(T entity);
	boolean delete(T entity);	
	List<T> getAll();
	T getById(String id);
}
