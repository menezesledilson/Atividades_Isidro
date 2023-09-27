package Jogo;

public class Player {
    private int id;
    private String username;
    private  float points;

    public Player(int id, String username, float points){
        this.id = id;
        this.username = username;
        this.points = points;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPoints(float points){
        this.points = points;
    }
    public float getPoints() {
        return points;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public int compareTO(Player other){

        if(this.points > other.points){
            return -1;
        }else if ( this.points < other.points){
            return 1;
        }
        else{
            return  this.username.compareTo(other.username);
        }
    }
    public String toString(){
        return  "(" + this.id+")" +this.username+ " | " + this.points;
    }
}
