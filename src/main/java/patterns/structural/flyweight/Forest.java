package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import java.awt.*;

import patterns.structural.flyweight.trees.Tree;
import patterns.structural.flyweight.trees.TreeFactory;
import patterns.structural.flyweight.trees.TreeType;

@SuppressWarnings("serial")
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color) {
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
