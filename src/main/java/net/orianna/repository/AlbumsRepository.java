package net.charlie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.charlie.model.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
