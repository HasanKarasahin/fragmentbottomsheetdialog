package com.example.hasan.fragment_bottom_sheetdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
    }

    public void btClick(View view) {
        MyBottomSheetDialog dialog = new MyBottomSheetDialog();
        dialog.show(getSupportFragmentManager(), "dailog");
        dialog.callBack(new MyBottomSheetDialog.BottomSheetListener() {
            @Override
            public void onButtonClicked(String text) {
                tvResult.setText(text);
            }
        });
    }
}
