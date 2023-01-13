package net.charlie.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.charlie.model.Album;
import net.charlie.repository.AlbumsRepository;
import net.charlie.service.IAlbumsService;

@Service
public class AlbumsServiceJpa implements IAlbumsService {
	
	@Autowired
	private AlbumsRepository repoAlbum;
	
	@Override
	public List<Album> buscartodo() {
		return repoAlbum.findAll();
	}

	@Override
	public void guardar(Album album) {
		repoAlbum.save(album);
	}

	@Override
	public void eliminar(int idAlbum) {
		repoAlbum.deleteById(idAlbum);
		
	}

}
