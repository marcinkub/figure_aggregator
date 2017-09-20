/**
 *
 */
package pl.umk.mat.goobar.lab.streams.helloworld.api;

import pl.umk.mat.goobar.lab.figures.Area;
import pl.umk.mat.goobar.lab.figures.Figure;

import java.util.Collection;

/**
 * Calculates sum of all {@link Area}s.
 *
 * @author goobar
 *
 */
// TODO: create collection and stream implementation
public interface AreaSumCalculator extends FiguresAggregator<Area>
{
    Area aggregate(Collection<Figure> figures);
}
