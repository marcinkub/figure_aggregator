package pl.umk.mat.goobar.lab.streams.helloworld.impl;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Area;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.streams.helloworld.api.AreaSumCalculator;

public class CollectionAreaSumCalculator implements AreaSumCalculator
{
    @Override
    public Area aggregate(Collection<Figure> figures)
    {
        Area a = new Area(0);
        for (Figure F: figures)
        {
                a = a.plus(F.area());
        }
        return a;
    }
}
