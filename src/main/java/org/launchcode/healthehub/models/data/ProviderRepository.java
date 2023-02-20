package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Notes, Integer> {
}
