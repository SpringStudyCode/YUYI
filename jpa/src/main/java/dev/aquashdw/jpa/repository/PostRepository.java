package dev.aquashdw.jpa.repository;

import dev.aquashdw.jpa.entity.BoardEntity;
import dev.aquashdw.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> findAllByWriter(String writer); //where writer = ?
    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity entity); // where wirter = ? and board_entity_id = ?
    List<PostEntity> findAllByWriterContaining(String writer);
}
