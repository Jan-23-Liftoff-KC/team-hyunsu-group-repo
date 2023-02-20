package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepository extends JpaRepository <Allergy, Integer> {
}
