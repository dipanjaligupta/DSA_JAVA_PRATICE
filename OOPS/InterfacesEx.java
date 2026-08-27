public class InterfacesEx{
    public static void main(String args[]){
     Queen q = new Queen();
      q.moves();
      Rook r = new Rook();
       r.moves();
 King k  = new King();
       k.moves();
   
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
 public void moves(){
        System.out.println("up, right , down, left,diagonal");
    }
}
class Rook implements chessPlayer{
 public void moves(){
        System.out.println("up , down, left,right");
    }
}
class King implements chessPlayer{
 public void moves(){
        System.out.println("up , down, right,left,diagonal");
    }
}