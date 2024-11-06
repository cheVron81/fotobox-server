package seiderer.fotobox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seiderer.fotobox.entity.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
}