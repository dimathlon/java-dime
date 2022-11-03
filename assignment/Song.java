public class Song 
{
    private String name;
    private String title;

    public Song(String title, String name)
    {
        this.title = title;
        this.name = name;
    }

    public void print()
    {
        System.out.println("Title: " + this.title + " Name: " + this.name);
    }
}
