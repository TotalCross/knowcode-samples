package com.totalcross.containers;

import com.totalcross.util.Fonts;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.util.UnitsConverter;

public class Home extends Container {

    public Home() {

    }

    public Container homeContainer;
    public Label homeLabel, textLabel;

    static final int SIZEC = 100;

    public void initUI() {

        
        homeLabel = new Label("TC Home");
        textLabel = new Label("Bem vindo! Você chegou no demo do\n" + "Home Assistant onde mostramos as\n"
                + "melhores UIs criados por nossa\n" + "comunidade.");

        homeLabel.setFont(Font.getFont(Fonts.FONT_DEFAULT, true, 20));
        textLabel.setFont(Font.getFont(Fonts.FONT_DEFAULT, false, 15));
        setBorderStyle(BORDER_RAISED);
        setBackColor(0xFFFFFF);
        add(homeLabel, LEFT + 10, TOP);
        add(textLabel, LEFT + 10, AFTER + 20);

        //homeContainer.setRect(LEFT + 10, TOP + UnitsConverter.toPixels(DP + SIZEC), PREFERRED, PREFERRED);
        this.resize();

    }

}
