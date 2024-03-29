package gr.codehub.hackathon.repository;

import gr.codehub.hackathon.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("select a from Author a join fetch a.activities where a.id = ?1")
    Optional<Author>  getAuthor(Long id);
}
