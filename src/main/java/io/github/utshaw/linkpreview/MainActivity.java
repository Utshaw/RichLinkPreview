package io.github.utshaw.linkpreview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;


public class MainActivity extends AppCompatActivity {

    RichLinkView richLinkView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ...
        //

        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);


        richLinkView.setLink("https://stackoverflow.com", new ViewListener() {

            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });




    }
}