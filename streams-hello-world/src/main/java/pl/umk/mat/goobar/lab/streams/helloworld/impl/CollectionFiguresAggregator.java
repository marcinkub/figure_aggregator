package pl.umk.mat.goobar.lab.streams.helloworld.impl;


import java.util.ArrayList;
import java.util.Collection;

import pl.umk.mat.goobar.lab.figures.Area;
import pl.umk.mat.goobar.lab.figures.Ellipse;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Rectangle;
import pl.umk.mat.goobar.lab.streams.helloworld.api.FiguresAggregator;

public  class CollectionFiguresAggregator<T> implements FiguresAggregator<T>
{
    public T aggregate(Collection<Figure> figures)
    {

        if(T instanceof Area)
        {

        }
        for (Figure F:figures)
        {
            k.add((T)F);
        }

        return k;
    }
}
