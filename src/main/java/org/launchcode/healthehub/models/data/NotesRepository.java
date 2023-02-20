package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Notes;
import org.springframework.data.repository.JpaRepository;

public interface NotesRepository extends JpaRepository <Notes, Integer> {
}
