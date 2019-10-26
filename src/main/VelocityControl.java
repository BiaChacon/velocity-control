package main;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class VelocityControl {

    public static void analise(double distance) {

        FIS fis = FIS.load("src/resource/analise.fcl", true);

        if (fis == null) {
            System.exit(1);
        }

        JFuzzyChart.get().chart(fis.getFunctionBlock("analise"));
        fis.setVariable("distance", distance);
        fis.evaluate();
        Variable analise = fis.getFunctionBlock("analise").getVariable("velocity");
        JFuzzyChart.get().chart(analise, analise.getDefuzzifier(), true);
        System.out.println(analise.getValue());
    }

}
