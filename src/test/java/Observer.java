//public interface Observer {
//    void objectCreated(Object obj);
//    void objectModified(Object obj);
//}
//
//class EmptyObserver implements Observer {
//    public void objectCreated(Object obj) { }
//    public void objectModified(Object obj) { }
//}
//
//class Observers<T extends Observer> extends ArrayList<T> {
//    public void notifyObjectCreated(Object obj) {
//        for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
//            iter.next().objectCreated(obj);
//    }
//    public void notifyObjectModified(Object obj) {
//        for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
//            iter.next().objectModified(obj);
//    }
//}
//
//    Observers observers = new Observers();
//  observers.add(new EmptyObserver() {
//public void objectCreated(Object obj) { /* реализация */ }
//        });
//
//public class Subject {
//    Observers observers = new Observers();
//
//    private Object field;
//
//    public void setField(Object o) {
//        field = o;
//        observers.notifyObjectModified(this);
//    }
//}