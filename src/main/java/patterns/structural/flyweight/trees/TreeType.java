package patterns.structural.flyweight.trees;

import java.awt.*;

public class TreeType {
	@SuppressWarnings("unused")
	private String name;
	private Color color;
	public TreeType(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.drawRect( x-1, y, 3 ,5);
		g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
	}
}
