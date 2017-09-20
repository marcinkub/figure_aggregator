package pl.umk.mat.goobar.lab.streams.helloworld.impl;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Perimeter;
import pl.umk.mat.goobar.lab.streams.helloworld.api.PerimeterSumCalculator;

/**
 * Created by marcin on 11.04.17.
 */
public class CollectionPerimeterSumCalculator implements PerimeterSumCalculator
{
    @Override
    public Perimeter aggregate(Collection<Figure> figures)
    {
        Perimeter p = new Perimeter(0);
        for (Figure F: figures)
        {
          p = p.plus(F.perimeter());
        }
        return p;
    }
}
