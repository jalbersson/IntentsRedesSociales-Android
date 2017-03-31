package com.example.jalberssonplazas.intentsredessociales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class inicioActivity extends AppCompatActivity
{

    ImageView imgTwiter, imgLinkedin, imgGoogle, imgFacebook, imgInstagram;
    EditText etxtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        imgGoogle= (ImageView) findViewById(R.id.imgIconoGoogle);
        imgLinkedin= (ImageView) findViewById(R.id.imgIconoLinkedin);
        imgTwiter= (ImageView) findViewById(R.id.imgIconoTwiter);
        imgFacebook= (ImageView) findViewById(R.id.imgIconoFacebook);
        imgInstagram= (ImageView) findViewById(R.id.imgIconoInstagram);
        etxtTexto= (EditText) findViewById(R.id.etxtTexto);

        imgTwiter.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto= etxtTexto.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.twiter.android");
                startActivity(sendIntent);
                return false;
            }
        });
        imgGoogle.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto= etxtTexto.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.google.android.apps.plus");
                startActivity(sendIntent);
                return false;
            }
        });
        imgLinkedin.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto= etxtTexto.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.linkedin.android");
                startActivity(sendIntent);
                return false;
            }
        });
        imgFacebook.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto= etxtTexto.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.facebook.katana");
                startActivity(sendIntent);
                return false;
            }
        });
        imgInstagram.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto= etxtTexto.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.instagram.android");
                startActivity(sendIntent);
                return false;
            }
        });

        //compartir(inicioActivity.this);
    }
    /*public  void compartir(View view)
    {
        Intent sendIntent= new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        String texto= etxtTexto.getText().toString();
        sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
        sendIntent.setType("text/plain");
        switch (view.getId())
        {
            case R.id.imgIconoGoogle:
                sendIntent.setPackage("com.google.android.apps.plus");
                break;

            case R.id.imgIconoLinkedin:
                sendIntent.setPackage("com.linkedin.android");
                break;

            case R.id.imgIconoTwiter:
                sendIntent.setPackage("com.twiter.android");
                break;

        }
        startActivity(sendIntent);
    }*/
}
