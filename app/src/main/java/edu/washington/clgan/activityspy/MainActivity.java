package edu.washington.clgan.activityspy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ActivitySpy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "This app title is " + this.getTitle().toString());
        Log.i(TAG, "onCreate event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "We’re going down, Captain!");
    }

}
