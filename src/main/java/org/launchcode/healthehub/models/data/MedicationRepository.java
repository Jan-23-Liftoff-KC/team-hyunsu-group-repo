package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Medication;
import org.springframework.data.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Integer> {
}
