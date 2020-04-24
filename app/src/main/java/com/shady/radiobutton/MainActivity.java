package com.shady.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "RadioButton";
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioGroup = findViewById(R.id.radioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mRadioButton = findViewById(checkedId);
                switch(mRadioButton.getId()){
                    case R.id.yesID:
                        Log.d(TAG, "onCheckedChanged: Yes");
                        break;
                    case R.id.maybeID:
                        Log.d(TAG, "onCheckedChanged: Maybe");
                        break;
                    case R.id.noID:
                        Log.d(TAG, "onCheckedChanged: No");
                        break;
                    default:
                        Log.d(TAG, "onCheckedChanged: Error!");
                }

            }
        });
    }
}
