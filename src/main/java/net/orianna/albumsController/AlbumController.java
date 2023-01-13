package net.charlie.albumsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.charlie.model.Album;
import net.charlie.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumController {
		@Autowired
		private IAlbumsService serviceAlbum;
		
		@GetMapping("/albums")
		public List<Album> buscarTodo(){
			return serviceAlbum.buscartodo();
		}
		
		@PostMapping("/albums")
		public Album guardar(@RequestBody Album album){
			serviceAlbum.guardar(album);
			return album;
		}
		
		@PutMapping("/albums")
		public Album modificar(@RequestBody Album album) {
			serviceAlbum.guardar(album);
			return album;
		}
		
		@DeleteMapping("/albums/{id}")
		public String eliminar(@PathVariable("id")int idAlbum) {
				serviceAlbum.eliminar(idAlbum);
				return "Registro Eliminado";
		}
}
