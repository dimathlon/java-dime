public class Song 
{
    private String name;
    private String title;
    private int plays;

    public Song(String title, String name, int plays)
    {
        this.title = title;
        this.name = name;
        this.plays= plays;
    }

    public void print()
    {
        System.out.println("Title: " + this.title + "\t Name: " + this.name + " \t plays:" + this.plays);
    }

    
}
