package com.example.hasan.fragment_bottom_sheetdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyBottomSheetDialog extends BottomSheetDialogFragment implements View.OnClickListener {

    public static final String TAG = "MyBottomSheetDialog";

    private BottomSheetListener mListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.bottom_sheet_layout, container, false);

        Button bt1 = view.findViewById(R.id.bt1);
        Button bt2 = view.findViewById(R.id.bt2);

        bt1.setOnClickListener(MyBottomSheetDialog.this);
        bt2.setOnClickListener(MyBottomSheetDialog.this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.w(TAG, "onClick:Dinleniyor : " + v.getId());
        switch (v.getId()) {
            case R.id.bt1:
                mListener.onButtonClicked("Button 1 Click");
                dismiss();
                break;
            case R.id.bt2:
                mListener.onButtonClicked("Button 2 Click");
                dismiss();
                break;
        }
    }


    public interface BottomSheetListener {
        void onButtonClicked(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            mListener = (BottomSheetListener) getContext();
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "mus implement BottomSheetListener");
        }
    }
}
