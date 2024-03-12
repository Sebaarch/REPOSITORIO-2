public class musicas {
    public static void main(String[]args);

    //atributos
    String title;
    String album;
    String date;
    int time;
    
    //metodos
    
    //primera forma
    /*
    public void musicas(String _title, String _album, String _date, int _time){
        title=_title;
        album=_album;
        date=_date;
        time=_time;
    }
*/
    //segunda forma

    public musicas(String title, String album,String date,int time){
    this.title=title;
    this.album=album;
    this.date=date;
    this.time=time;
    }
    public void ShowPlaylist(){
            System.out.println("Title"+title);
            System.out.println("Album"+album);
            System.out.println("Date"+date);
            System.out.println("Time"+time);

}
}