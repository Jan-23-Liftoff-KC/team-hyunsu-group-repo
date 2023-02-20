package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Immunization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmunizationRepository extends JpaRepositoryRepository<Immunization, Integer > {
}
