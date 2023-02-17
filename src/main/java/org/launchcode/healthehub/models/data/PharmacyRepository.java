package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Pharmacy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends CrudRepository<Pharmacy, Integer> {
}
