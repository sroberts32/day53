package day53.TelevisionShows.src;

public class TvShow {
    private String name;
    private int numEp;
    private String genre;

    public TvShow(String showName, int numOfEp, String showGenre) {
        this.name = showName;
        this.numEp = numOfEp;
        this. genre = showGenre;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getEps() {
        return numEp;
    }
    
    public void setEps(int numEp) {
        this.numEp = numEp;
    }

    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "The name of ths show is " + getName() + " with " + getEps() + " episodes. The genre is " + getGenre();
    }

}