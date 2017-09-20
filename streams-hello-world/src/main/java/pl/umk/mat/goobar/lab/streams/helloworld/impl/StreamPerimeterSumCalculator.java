package pl.umk.mat.goobar.lab.streams.helloworld.impl;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Perimeter;
import pl.umk.mat.goobar.lab.streams.helloworld.api.PerimeterSumCalculator;


public class StreamPerimeterSumCalculator implements PerimeterSumCalculator
{

    @Override
    public Perimeter aggregate(Collection<Figure> figures) {
        return figures.parallelStream().map(Figure::perimeter)
                .reduce((sum, figurePerimeter) -> sum.plus(figurePerimeter))
                .orElse(new Perimeter(0));
    }
}
