package ma.pfa.vitalinkbackend.DAO.Repositories;

import ma.pfa.vitalinkbackend.DAO.Entities.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}

