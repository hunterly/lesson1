package com.example.lesson1.jiemian;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lesson1.R;


/**
 * Created by lxx569378712m on 2015/12/1.
 */
public class Second extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button1 = (Button) findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Second.this,"注册失败,怪我咯",
                Toast.LENGTH_SHORT).show();
            }
        });


    }
}
