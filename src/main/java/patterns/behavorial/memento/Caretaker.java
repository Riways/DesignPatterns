package patterns.behavorial.memento;

import java.util.Stack;

public class Caretaker {
	private Stack<Memento> mementos = new Stack<Memento>();

	private Originator originator = null;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	public void backup() {
		System.out.println("\nCaretaker: Saving Originator's state...");
		mementos.add(originator.getMementoShot());
	}

	public void undo()
    {
        if (mementos.size() == 0)
        {
            return;
        }

       	Memento memento = mementos.pop();
       	
       	System.out.println("Caretaker: Restoring state to: " + memento.getName());

        try
        {
            originator.restore(memento);
        }
        catch (Exception e)
        {
            undo();
        }
    }

	public void showHistory()
    {
		System.out.println("Caretaker: Here's the list of mementos:");

        for(Memento memento : mementos)
        {
        	System.out.println(memento.getName());
        }
    }
}
