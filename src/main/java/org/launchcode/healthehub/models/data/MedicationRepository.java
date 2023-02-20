package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Medication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends CrudRepository<Medication,Integer> {
}
