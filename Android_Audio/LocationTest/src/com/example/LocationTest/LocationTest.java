package com.example.LocationTest;

import android.app.Activity;
import android.location.*;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

/**
 * 8.1 位置
 */
public class LocationTest extends Activity implements LocationListener {
    //Define human readable names
    private static final String[] A = {"invalid", "n/a", "fine", "coarse"};
    private static final String[] P = {"invalid", "n/a", "low", "medium", "high"};
    private static final String[] S = {"out of service", "temporarily unavailable", "available"};
    private LocationManager mgr;
    private TextView output;
    private String best;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mgr = (LocationManager) getSystemService(LOCATION_SERVICE);//返回LocationManager的实例，开始定位服务
        output = (TextView) findViewById(R.id.output);
        log("Location providers:");
        dumpProviders();//输出系统中所有位置提供者的列表
        //选择一个最好的位置提供者
        Criteria criteria = new Criteria();//标准; 规范; 准据
        best = mgr.getBestProvider(criteria, true);//返回的是提供者的名字
        log("\nBest provider is: " + best);

        log("\nLocatoins (starting with last known):");
        Location location = mgr.getLastKnownLocation(best);
        dumpLocation(location);//上次保存下来的位置，一般是不会再准确了
    }

    @Override
    protected void onResume() {
        super.onResume();
        //请求更新位置  参数：提供则名称、延迟、最小变化距离，LocationListener对象
        mgr.requestLocationUpdates(best, 15000, 1, this);
    }

    //Write a string to the output window 输出到TextView
    private void log(String string) {
        output.append(string + "\n");
    }

    //Write information from all location providers 所有的提供者
    private void dumpProviders() {
        List<String> providers = mgr.getAllProviders();
        for (String provider : providers) {
            dumpProviders(provider);
        }
    }

    //Write information from a single location provider
    private void dumpProviders(String provider) {
        LocationProvider info = mgr.getProvider(provider);
        StringBuilder builder = new StringBuilder();
        builder.append("LocationProvider[")
                .append("name=")
                .append(info.getName())
                .append(",enabled=")
                .append(mgr.isProviderEnabled(provider))
                .append(",getAccuracy=")//准确性
                .append(A[info.getAccuracy() + 1])
                .append(",getPowerRequirement=")
                .append(P[info.getPowerRequirement() + 1])
                .append(",hasMonetaryCost=")
                .append(info.hasMonetaryCost())
                .append(",requiresCell=")
                .append(info.requiresCell())
                .append(",requiresNetwork=")
                .append(info.requiresNetwork())
                .append(",requiresSatellite=")
                .append(info.requiresSatellite())
                .append(",supportsAltitude=")
                .append(info.supportsAltitude())
                .append(",supportsBearing=")
                .append(info.supportsBearing())
                .append(",supportsSpeed=")
                .append(info.supportsSpeed());
        log(builder.toString());
    }

    //Describe the given location,which might be null
    private void dumpLocation(Location location) {
        if (location == null) {
            log("\nLocation[unknown]");
        } else {
            log("\n" + location.toString());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mgr.removeUpdates(this);//暂停时停止获取更新，也就是指在前台更新
    }

    @Override
    public void onLocationChanged(Location location) {
        dumpLocation(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        log("\nProvider status changed: " + provider + ", status " + S[status] + ", extras" + extras);
    }

    @Override
    public void onProviderEnabled(String provider) {
        log("\nProvider enable:" + provider);
    }

    @Override
    public void onProviderDisabled(String provider) {
        log("\nProvider disable:" + provider);
    }
}
