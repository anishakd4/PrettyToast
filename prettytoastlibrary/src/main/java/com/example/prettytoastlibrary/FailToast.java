package com.example.prettytoastlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FailToast extends LinearLayout {

    public FailToast(Context context, String message) {
        super(context);
        show(context, message);
    }

    private void show(Context context, String message) {
        View view = LayoutInflater.from(context).inflate(R.layout.success_toast, this, true);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}
