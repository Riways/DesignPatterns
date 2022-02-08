package patterns.behavorial.memento;

import java.time.LocalDateTime;

public interface Memento {
	 String getName();

     String getState();

     LocalDateTime getDate();
}
