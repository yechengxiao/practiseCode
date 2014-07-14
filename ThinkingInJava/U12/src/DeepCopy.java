/**
 * Created by yechengxiao on 14-3-18.
 */
// 深层复制,比较复杂

class DepthReading implements Cloneable {
    private double depth;

    public DepthReading(double depth) {
        this.depth = depth;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        return o;
    }
}

class TemperatureReading implements Cloneable {
    private long time;
    private double temperature;

    public TemperatureReading(double temperature) {
        this.time = System.currentTimeMillis();
        this.temperature = temperature;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        return o;
    }
}

class OceanReading implements Cloneable {
    private DepthReading depthReading;
    private TemperatureReading temperatureReading;

    public OceanReading(double tdata, double ddata) {
        this.depthReading = new DepthReading(tdata);
        this.temperatureReading = new TemperatureReading(ddata);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OceanReading o = null;
        try {
            o = (OceanReading) super.clone();
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        // Must clone handles
        // 复杂在引用类型数据也要有clone的能力，如果只有基本数据类型，clone就像上面那样比较简单。
        o.depthReading = (DepthReading) o.depthReading.clone();
        o.temperatureReading = (TemperatureReading) o.temperatureReading.clone();

        return o;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        OceanReading reading = new OceanReading(33.9, 100.5);
        OceanReading r = (OceanReading) reading.clone();

        if (reading == r) {
            System.out.println("clone fail");
        } else {
            System.out.println("close successfully");
        }
    }
}
