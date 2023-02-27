package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.NoteBROKEN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository <NoteBROKEN, Integer> {
}
