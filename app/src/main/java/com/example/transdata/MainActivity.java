package com.example.transdata;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnToastClick(View view) {
        int duration = Toast.LENGTH_LONG;
        Toast toast2 = Toast.makeText(getApplicationContext(),R.string.catfood, duration);
        toast2.setGravity(Gravity.TOP, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast2.getView();
        toastContainer.setBackgroundColor(Color.TRANSPARENT);
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.grumpy);
        toastContainer.addView(catImageView, 0);
        toast2.show();
//        //Створюємо текстове спливаюча підказка
//        Toast toast = Toast.makeText(getApplicationContext(),
//                "Час покормити кота!", Toast.LENGTH_SHORT);//Задаємо текст підказки та тривалість її на екрані
//        toast.setGravity(Gravity.CENTER, 0 ,0);//центруємо підказку
//        toast.show();//показуємо підказку
    }
}
