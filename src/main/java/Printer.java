public class Printer {

    private int paper;
    private int tonerVolume;

    public Printer(){
        this.paper = 100;
        this.tonerVolume = 100;
    }

    public int getPaper(){
        return this.paper;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        this.paper -= totalPages;
        this.tonerVolume -= totalPages;
    }

    public int getToner(){
        return this.tonerVolume;
    }
}
