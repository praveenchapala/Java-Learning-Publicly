//is-a relationship is nothing but inheritance means parent child relationship so it means one object "is a" type of another object 
//basically it is represented as is-a relationship between objects 
//all the times we dont have is-a relationship only but there is one more relationship called "has-a" relationship so it is also two types again 1. weak has-a relationship and another one is strong-has-a relationship 
//whenever one object is deleted automatically another object is getting deleted so such type of objects is having Strong has-a relationship 
//whenever one object is deleted then another object is still exists independently so this kind of relation ship between the objects is known as weak-has a relationship 


//weak  has -a relationship is acheived using aggregation and similarly strong  has-a relationship is acheived using composition.

// this is the implementation of aggregation

public class Main{
    public static void main(String args[]){
        Song sng = new Song();
        sng.title = "kolaveri di";
        sng.artist = "Dhanush";

        playlist pl = new playlist();
        pl.track = sng;
        pl.playsong(sng);
        System.out.println("This song is fire! its also on my freinds playlist");
        System.out.println("Song:"+sng.title+"By"+sng.artist);
        
    }
}

class Song{
    String title;
    String artist;
    
}
class playlist{
    Song track;

     void playsong(Song banger){
         track = banger;
         System.out.println("Now playing: "+track.title);
         System.out.println("Artist: "+track.artist);
     }
}


