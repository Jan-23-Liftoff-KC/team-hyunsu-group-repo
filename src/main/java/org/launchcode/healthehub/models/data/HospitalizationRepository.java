package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Hospitalization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface HospitalizationRepository {
    @Repository
    public interface hospitalizationRepository extends CrudRepository<Hospitalization, Integer > {
    }
}
