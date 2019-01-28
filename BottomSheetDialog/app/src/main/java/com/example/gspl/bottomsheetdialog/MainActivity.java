package com.example.gspl.bottomsheetdialog;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView imageshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout =findViewById(R.id.bottomsheet);
        imageshare= findViewById(R.id.shareimage);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);

        //state hidden
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        //state collapsed
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        //state expaned
       // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imageshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
