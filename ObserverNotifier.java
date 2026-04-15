
public class ObserverNotifier {

    public ArrayList<ObserverInterface> listener=new ArrayList<>();


    public void sendNotification(){
        for(ObserverInterface f:listener){
            f.createEvent();
        }
    }

    public void deleteNotification(){
        for(ObserverInterface f:listener){
            f.createEvent();
        }
    }
}