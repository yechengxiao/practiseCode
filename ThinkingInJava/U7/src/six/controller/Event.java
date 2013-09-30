package six.controller;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 9   为什么要用内部类:控制框架
 */
abstract public class Event {
    private long evtTime;

    public Event(long eventTime) {
        evtTime = eventTime;
    }

    public boolean ready() {
        //以计算机时钟为基础
        return System.currentTimeMillis() >= evtTime;
    }

    //事件就绪后需要调用的方法
    abstract public void action();

    //提供与事件有关的文字信息。
    abstract public String description();
}
