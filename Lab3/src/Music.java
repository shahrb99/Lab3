package MusicCollection;

/**
 * a class to hold the details of a music track
 */
public class Music {

    // the name of the music track
    private String name;

    // the address of music track
    private String address;

    // the singer of the music track
    private String singer;

    // the year of music publication
    private int publicationYear;

    /**
     * create a music with a given address
     * @param address the address of the music track
     */
    public Music(String address) {
        setAddress(address);
    }

    /**
     * get the name of the music
     * @return name field
     */
    public String getName() {
        return name;
    }

    /**
     * set a name for the music
     * @param name a name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the address of a music
     * @return address field
     */
    public String getAddress() {
        return address;
    }

    /**
     * set an address for the music
     * @param address an address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get the name of thd singer
     * @return singer field
     */
    public String getSinger() {
        return singer;
    }

    /**
     * set a name for the singer of the song
     * @param singer a name
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * get the year of music publication
     * @return publicationYear field
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * set a year for music publication
     * @param publicationYear a year
     */
    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 1950 && publicationYear < 2023) {
            this.publicationYear = publicationYear;
        }
    }

    public String print() {
        return name + " : " + singer + "\t" + publicationYear;
    }
}
