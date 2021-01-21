# Inheritance
## Extends
### The syntax for deriving a child class from a parent class is:
    class childClass extends parentClass
    {
    // new members and constructors of the child class go here
    }
---
## Super
### Using VideoStore example
#### Video's method:
    public String toString()
    {
    return getTitle() + ", " + getLength() + " min. " ; 
    }
#### Movie's method without using super:
    public String toString()
    {
    return getTitle() + ", " + getLength() + " min. available:" + getAvailable() +
            " dir: " + director + ", rating:  " + rating ; 
    }
#### Movie's method with super:
    public String toString()
    {
    return super.toString() + " dir: " + director + ", rating: " + rating ;  
    }
---
## Protected Variables
### Using VideoStore example:
    class Video
    {
    protected String  title;    // name of the item
    protected int     length;   // number of minutes
    protected boolean avail;    // is the video in the store?

    . . .
    }

    class Movie extends Video
    {
    . . .
    public String toString()
    {
        return title + ", " + length + " min. available:" + avail +  // these protected variables CAN NOW be accessed
            " dir: " + director + ", rating:  " + rating ; 
    }
    . . .
    }
---
## Music Example Class:
    class Video
    {
    // stuff omitted
    . . .
    
    public void toString()
    {
        return title + ", " + length + " min. available:" + avail ;
    }
    
    . . .
    
    }

    class MusicVideo extends Video
    {
    private String artist;
    private String category;
    
    // constructor
    public MusicVideo ( String ttl, int len, String art, String cat )
    {
        super( ttl, len );
        artist   = art;
        category = cat;
    }
    
    public String toString()
    {
        return super.toString() +  "artist:" + artist + " style: " + category ;
    }
    
    // Setters and Getters
    public String  getArtist() { return artist; }
    public String  getCategory() { return category; }
    }