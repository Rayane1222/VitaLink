package ma.pfa.vitalinkbackend.DAO.Repositories;

import ma.pfa.vitalinkbackend.DAO.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

