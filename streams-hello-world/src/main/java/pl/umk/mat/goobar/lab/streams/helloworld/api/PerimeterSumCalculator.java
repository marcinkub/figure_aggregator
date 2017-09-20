/**
 *
 */
package pl.umk.mat.goobar.lab.streams.helloworld.api;

import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Perimeter;

import java.util.Collection;

/**
 * Calculates sum of all {@link Perimeter}s.
 *
 * @author goobar
 *
 */
// TODO: create collection and stream implementation
public interface PerimeterSumCalculator extends FiguresAggregator<Perimeter>
{
    Perimeter aggregate(Collection<Figure> figures);
}
