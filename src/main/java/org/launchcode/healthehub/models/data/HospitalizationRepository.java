package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Hospitalization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalizationRepository extends JpaRepository<Hospitalization, Integer > {
}
