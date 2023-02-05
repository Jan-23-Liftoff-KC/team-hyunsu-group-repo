package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Immunization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmunizationRepository extends CrudRepository<Immunization, Integer > {
}
