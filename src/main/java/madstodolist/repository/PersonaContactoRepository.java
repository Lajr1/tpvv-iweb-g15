package madstodolist.repository;

import madstodolist.model.PersonaContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PersonaContactoRepository extends JpaRepository<PersonaContacto, Long> {
    Optional<PersonaContacto> findById(Long id);
    Optional<PersonaContacto> findByEmail(String emailExt);

}