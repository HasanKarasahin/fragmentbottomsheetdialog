package fragment_bottom_sheetdialog;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hasan.fragment_bottom_sheetdialog.R;

public class MyBottomSheetDialog extends BottomSheetDialogFragment {

    private BottomSheetListener mListener;

    public interface BottomSheetListener {
        void onButtonClicked(String text);
    }

    public void callBack(BottomSheetListener listener) {
        this.mListener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {

        View v = i.inflate(R.layout.bottom_sheet_layout, null, false);

        Button bt1 = v.findViewById(R.id.bt1);
        Button bt2 = v.findViewById(R.id.bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onButtonClicked("Bt1 Clk");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onButtonClicked("Bt2 Clk");
            }
        });

        return v;
    }
}
