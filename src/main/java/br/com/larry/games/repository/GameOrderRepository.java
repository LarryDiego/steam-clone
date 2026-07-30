package br.com.larry.games.repository;

import br.com.larry.games.model.entity.GameOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameOrderRepository extends JpaRepository<GameOrderEntity, Long> {
}
