package dao;

import entidades.JSONResponse;
import java.util.List;

public interface IDAO<T> {
	//CRUD
	public JSONResponse insert(T obj); //insert
	public JSONResponse selectAll(); //select muchos registros
	public JSONResponse select(List<String> condicion); //select
	public JSONResponse update(T obj); //update
	public JSONResponse delete(int identificador);//delete
}
