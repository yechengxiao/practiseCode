package com.yechengxiao.FlashLight.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.yechengxiao.FlashLight.R;

/**
 * Created by yechengxiao on 14-2-16.
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}