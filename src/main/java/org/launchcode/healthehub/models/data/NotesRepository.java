package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository <Note, Integer> {
}
