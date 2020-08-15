package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button button;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        OnclickButtonLister();

    }

    public void OnclickButtonLister(){
        button = (Button)findViewById(R.id.button9);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Changes are saved";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context , text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0 );
                        toast.show();

                        Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
