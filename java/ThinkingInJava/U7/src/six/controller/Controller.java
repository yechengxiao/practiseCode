package six.controller;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午4:48
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 9   为什么要用内部类:控制框架
 * 包含了实际的控制框架,用于管理和触发事件
 */
//第一个类实际只是一个“助手”类,它的职责是容纳 Event 对象。可用任何适当的集合替换它。
class EventSet {
    private Event[] events = new Event[100];
    private int index = 0;
    private int next = 0;

    public void add(Event event) {
        if (index >= events.length) {
            return;
        }
        events[index++] = event;
    }

    public Event getNext() {
        boolean looped = false;
        int start = next;
        do {
            next = (next + 1) % events.length;//?
            //See fi it has looped to the beginning;
            if (start == next) {
                looped = true;
            }
            //if it loops past start,the list is empty;
            if ((next == (start + 1) % events.length) && looped) {
                return null;
            }
        } while (events[next] == null);
        return events[next];
    }

    public void removeCurrent() {
//        注意 removeCurrent()并不只是指示一些标志,指出对象不再使用。相反,它将句柄设为 null。这一点是非
//        常重要的,因为假如垃圾收集器发现一个句柄仍在使用,就不会清除对象。若认为自己的句柄可能象现在这
//        样被挂起,那么最好将其设为 null ,使垃圾收集器能够正常地清除它们。
        events[next] = null;
    }
}

public class Controller {
    private EventSet es = new EventSet();

    public void addEvent(Event c) {
        es.add(c);
    }

    public void run() {
        Event e;
        while ((e = es.getNext()) != null) {
            if (e.ready()) {
                e.action();
                System.out.println(e.description());
                es.removeCurrent();
            }
        }
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        c.run();
    }
}
