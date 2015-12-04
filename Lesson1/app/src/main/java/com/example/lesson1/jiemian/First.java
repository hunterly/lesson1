package com.example.lesson1.jiemian;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson1.R;


/**
 * Created by lxx569378712m on 2015/12/1.
 */
public class First extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button3 = (Button) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First.this,Second.class);
                startActivity(intent);
            }
        });
    }
}





