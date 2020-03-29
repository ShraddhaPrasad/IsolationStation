package com.example.lahacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);

        TextView textView= findViewById(R.id.textView);
        textView.setText(message);

        Bundle bundle=this.getIntent().getExtras();
        String imageId = bundle.getString(MainActivity.IMAGE_ID);
        int pic = bundle.getInt(imageId);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setImageResource(pic);
    }

    public void imageButtonOnClick(View view)
    {
        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.LINK_ID);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}
