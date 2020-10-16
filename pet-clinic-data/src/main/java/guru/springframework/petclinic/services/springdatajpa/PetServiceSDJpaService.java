package guru.springframework.petclinic.services.springdatajpa;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.repositories.PetRepository;
import guru.springframework.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetServiceSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetServiceSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long aLong) {
        return null;
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
