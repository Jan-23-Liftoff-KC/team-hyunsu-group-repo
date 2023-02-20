package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Hospitalization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HospitalizationRepository {
    @Repository
    public interface hospitalizationRepository extends JpaRepository<Hospitalization, Integer > {
    }
}
