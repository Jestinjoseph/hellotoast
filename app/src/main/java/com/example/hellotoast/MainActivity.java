package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int text,toast;
    private	int	mCount	=	0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "hello",Toast.LENGTH_LONG);
//        Toast toast = Toast.makeText(this, mShowCount.setText(Integer.toString(mCount)));

        toast.show();
    }
    public void countUp(View view) {
        mShowCount	=	(TextView)	findViewById(R.id.show_count);

        mCount++;
        if	(mShowCount	!=	null)
            mShowCount.setText(Integer.toString(mCount));

    }
}

