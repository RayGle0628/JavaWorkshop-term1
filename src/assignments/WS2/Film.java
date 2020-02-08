package assignments.WS2;

/**
* This class is used to describe the films.It contains three
 *    attributes:title,releaseDate, length.
*   We distinguish three field variable:

 *    title, the official name of a film
 *   releaseDate, an int to represent a day when the movie released formally
*   length, the length of a film

 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/11
 * @Content:workshop
 */
public class Film {
private  String title;
private Date   releaseDate;
private  int length;
    /**
     *Film is a constructor  for a very simple to creat a new movie
     * @param title  the official name of a film
     * @param releaseDate  an int to represent a day when the movie released formally
     * @param length the length of a film
     */

    public Film(String title, Date releaseDate, int length) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.length = length;
    }
    /**
     * @return the title of the film's name as String
     */
    public String getTitle() {
        return title;
    }
    /**
     * @return the releaseDate as Date (a java built-in class),Used to accurately represent dates
     */
    public Date getReleaseDate() {
        return releaseDate;
    }
    /**
     * @return the length of the movie
     */
    public int getLength() {
        return length;
    }
    /**set the released date of a movie
     * @param releaseDate  an int to represent a day when the movie released formally
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    /**toString defines how to print a film
     * @return The object in a human readable form.
     */
    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        Film adAstra = new Film("Ad Astra",new
                Date(18, "September", 2019), 123);

    }
}
