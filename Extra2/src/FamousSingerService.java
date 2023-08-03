import java.util.ArrayList;
import java.util.List;

public class FamousSingerService {
    List<FamousSinger> lstFamousSinger = new ArrayList<>();

    public void addFamousSinger(String name,String cd){
        FamousSinger p = new FamousSinger(name,cd);
        lstFamousSinger.add(p);
    }
    public void showAllSingers(){
        for (FamousSinger p: lstFamousSinger
             ) {
            System.out.println(p.toString());
        }
    }
    public void removeSinger(String name){
        for (FamousSinger p:lstFamousSinger
             ) {
            if(p.getName().equalsIgnoreCase(name)){
                lstFamousSinger.remove(p);
                break;
            }
        }
    }


}
