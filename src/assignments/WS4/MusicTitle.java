package assignments.WS4;

/**
 *This class describes the name of the music, which contains three variables,
 * mainly used to represent the details of a certain music.
 * In addition, this class implements the MusicTitleInterface and
 * rewrites some of its internal methods.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/12
 * @Content:workshop
 */
public class MusicTitle implements MusicTitleInterface {

    private String title;
    private String artist;
    private int price;

    /**Constructor
     * @param title The price of buying this music
     * @param artist Creator of a certain music
     * @param price The price of buying this music
     */
    public MusicTitle(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    /**
     * @param title set the price of buying this music
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param artist set the Creator of a certain music
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @param price set The price of buying this music
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Standard getter for the title
     *
     * @return The title of the music title.
     */
    @Override
    public String getTitle() {

        return this.title;
    }

    /**
     * Standard getter for the artist
     *
     * @return The artist of the music title.
     */
    @Override
    public String getArtist() {

        return this.artist;
    }

    /**
     * Standard getter for the price
     *
     * @return The price of the music title.
     */
    @Override
    public int getPrice() {

        return this.price;
    }

    /**
     * @return a visual and formatted statement that can be printed to the console
     */
    @Override
    public String toString() {
        return "MusicTitle{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }


}
