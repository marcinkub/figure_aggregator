package pl.umk.mat.goobar.lab.streams.helloworld.impl;

import java.util.ArrayList;
import java.util.Collection;

import pl.umk.mat.goobar.lab.figures.Ellipse;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Rectangle;
import pl.umk.mat.goobar.lab.streams.helloworld.api.FiguresGrouper;

/**
 * Created by marcin on 11.04.17.
 */
public class CollectionFiguresGrouper implements FiguresGrouper
{
    public Collection<Ellipse> groupEllipses(Collection<Figure> figures)
    {
        Collection<Ellipse> k = new ArrayList<Ellipse>();
        Ellipse tmpEll = new Ellipse(1,1);
        for (Figure F : figures)
        {
            if(F.getClass() == tmpEll.getClass())
            {
                k.add((Ellipse) F);
            }
        }
        return k;
    }

    public Collection<Rectangle> groupRectangles(Collection<Figure> figures)
    {
        Collection<Rectangle> k = new ArrayList<Rectangle>();
        Rectangle tmpRec = new Rectangle(1,1);
        for (Figure F : figures)
        {
              if(F.getClass() == tmpRec.getClass())
              {
                  k.add((Rectangle)F);
              }
        }
        return k;
    }
}
