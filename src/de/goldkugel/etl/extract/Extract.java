package de.goldkugel.etl.extract;

import java.util.List;
import de.goldkugel.etl.component.ETLComponent;
import lombok.NonNull;

/**
 * This class only extracts data from a source.
 * 
 * Please do not implement any data transformation processes in here
 * for example changing data format. Also data quality assessments for
 * example data type should not be performed in here but in the
 * transport component. Usually the data is assumed to be in tabular
 * format.
 * 
 * @author Peter Pallaoro
 *
 */
public interface Extract extends ETLComponent {

  /**
   * Returns the amount of header lines which will be skipped
   * 
   * @return
   */
  public int getHeaderLines();

  /**
   * 
   * @param headerlines:
   */
  public void setHeaderLines(@NonNull Integer headerlines);

  public int readHeaderLines(@NonNull List<Object> l);

  /**
   * Reads only one cell from the source. The data of the cell will be
   * added to the given list l. If no cell is available no element will
   * be added to the list. Data can only be saved if the given list is
   * not null, therefore a non null list should be provided. Every entry
   * in the given list reflects one cell of the source system.
   * 
   * @param l: the list in which the read data is stored in.
   * @return the return value should be zero if the reading was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred.
   */
  public int readCell(@NonNull List<Object> l);

  /**
   * Reads multiple amount of cells in the source. The amount of cells
   * which shall be read can be defined by the second parameter. The
   * data of the cell will be added to the given list l. There is the
   * possibility, that fewer cells could be read than requested for
   * example when only one cell is available but three have been
   * requested. If no cell is available no element will be added to the
   * list. Data can only be saved if the given list is not null,
   * therefore a non null list should be provided. Every entry in the
   * given list reflects one cell of the source system.
   * 
   * Please avoid to call "readCell" multiple times while implementing
   * this method. This method should save process time and memory by
   * reading multiple cells at the same time.
   * 
   * @param l: the list in which the read data is stored in.
   * @param amount: the amount of cells which should be read.
   * @return the return value should be zero if the reading was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred.
   */
  public int readCells(@NonNull List<Object> l, @NonNull Integer amount);

  /**
   * Reads one entire line of cells from the source. The data of those
   * cells will be added to the given list l. Every entry in the given
   * list reflects one cell of the source system. If no cell or no row
   * is available no element will be added to the list. Data can only be
   * saved if the given list is not null, therefore a non null list
   * should be provided.
   * 
   * @param l: the list in which the read data is stored in.
   * @return the return value should be zero if the reading was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred.
   */
  public int readRow(@NonNull List<Object> l);

  /**
   * Reads multiple amount of rows in the source. The amount of rows
   * which shall be read can be defined by the second parameter. The
   * data of the rows will be added to the given list l. AEvery entry in
   * the given list reflects one cell of the source system. If no cell
   * or no row is available no element will be added to the list. Data
   * can only be saved if the given list is not null, therefore a non
   * null list should be provided.
   * 
   * Please avoid to call "readRow" multiple times while implementing
   * this method. This method should save process time and memory by
   * reading multiple rows at the same time.
   * 
   * @param l: the list in which the read data is stored in.
   * @param amount: the amount of rows which should be read.
   * @return the return value should be zero if the reading was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred.
   */
  public int readRows(@NonNull List<Object> l, @NonNull Integer amount);

}
