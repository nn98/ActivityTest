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
    ConstraintLayout.LayoutParams lp,lp0,lp1,lp2,lp3;
    Button btns[]=new Button[20];
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

//        l1=new ConstraintLayout(this);
//        l1.setLayoutParams(lp1);
//        layout.addView(l1);

        btns[0]=new Button(this);
        btns[0].setLayoutParams(lp);
        btns[0].setText("Add");
        l0.addView(btns[0]);

        lp2=new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        lp2.rightToRight=ConstraintLayout.LayoutParams.PARENT_ID;
        btns[1]=new Button(this);
        btns[1].setLayoutParams(lp2);
        btns[1].setText("Add");
        l0.addView(btns[1]);

        /*
        lp 속성이 변하면 해당 lp 가진 모든 뷰의 속성이 변동.
        뷰마다 설정하는게 제일 베스트?
        결국엔 const 잡아주려면
        M M / W W / M W / W M 4개만 깔고 나머지는 다 람다식으로로
        */

//        et0=new EditText(this);
//        et0.setLayoutParams(lp);
//        tv0=new TextView(this);
//        tv0.setLayoutParams(lp);
//        l1.addView(et0);
//        l1.addView(tv0);
    }
}
