package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Allergy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepository extends CrudRepository <Allergy, Integer> {
}
