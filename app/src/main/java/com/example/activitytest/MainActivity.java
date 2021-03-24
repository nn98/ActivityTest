package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout,l0,l1,l2;
    ConstraintLayout.LayoutParams lp,lp0,lp1;
    Button btn0;
    EditText et0;
    TextView tv0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.parent);
        lp=new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        lp0=new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        lp1=new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);

        lp0.topToTop=ConstraintLayout.LayoutParams.PARENT_ID;
        lp0.rightToRight=ConstraintLayout.LayoutParams.PARENT_ID;

        l0=new ConstraintLayout(this);
        l0.setLayoutParams(lp0);
        layout.addView(l0);

        lp1.topToBottom=l0.getBottom();
        lp1.leftToLeft=ConstraintLayout.LayoutParams.PARENT_ID;
        lp1.rightToRight=ConstraintLayout.LayoutParams.PARENT_ID;

        l1=new ConstraintLayout(this);
        l1.setLayoutParams(lp1);
        layout.addView(l1);


        btn0=new Button(this);
        btn0.setLayoutParams(lp1);
        btn0.setText("Add");
        l0.addView(btn0);

        et0=new EditText(this);
        et0.setLayoutParams(lp);
        tv0=new TextView(this);
        tv0.setLayoutParams(lp);
        l1.addView(et0);
        l1.addView(tv0);
    }
}
