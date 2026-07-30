package br.com.larry.games.repository;

import br.com.larry.games.model.entity.GameDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDetailRepository extends JpaRepository<GameDetailEntity, Long> {
}
