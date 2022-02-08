package patterns.behavorial.memento;

import java.time.LocalDateTime;

public class MementoImpl implements Memento {
	
	private String  state;

    private LocalDateTime  date;

    public MementoImpl(String state)
    {
        this.state = state;
        this.date = LocalDateTime.now();
    }

	@Override
	public String getName() {
		return date + " / " + state;
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public LocalDateTime getDate() {
		return date;
	}

}
