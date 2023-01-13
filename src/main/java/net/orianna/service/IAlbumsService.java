package net.charlie.service;

import java.util.List;
import net.charlie.model.Album;

public interface IAlbumsService {
	
	List<Album> buscartodo();
	void guardar(Album album);
	void eliminar(int idAlbum);
	
}
