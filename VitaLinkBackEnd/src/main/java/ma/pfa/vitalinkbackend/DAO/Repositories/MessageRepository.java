package ma.pfa.vitalinkbackend.DAO.Repositories;

import ma.pfa.vitalinkbackend.DAO.Entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

