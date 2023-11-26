package com.mehmetozkok.holocircleseekbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.mehmetoz.holocircleseekbar.R;


public class SampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sample);
    }

}