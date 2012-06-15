package org.amcgala.example.letter;

import org.amcgala.Framework;
import org.amcgala.framework.shape.shape2d.Text;


public class LetterMain extends Framework {


    public LetterMain(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        new LetterMain(500, 250).start();
    }

    @Override
    public void initGraph() {
        add(new Text("amCGAla öäüß +-*/ !? ", -100, 0));
    }
}
