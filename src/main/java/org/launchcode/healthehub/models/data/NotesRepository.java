package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository <Notes, Integer> {
}
