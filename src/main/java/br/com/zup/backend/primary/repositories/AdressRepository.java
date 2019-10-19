package br.com.zup.backend.primary.repositories;

import br.com.zup.backend.primary.domain.Address;
import br.com.zup.backend.primary.repositories.generics.GenericRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface AdressRepository extends GenericRepository<Address> {
}