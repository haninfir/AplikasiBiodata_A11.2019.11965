package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alamat(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.com/maps/place/Jl.+Kepodang+IV,+Simpang+Selatan,+Danyang,+Kec.+Purwodadi,+Kabupaten+Grobogan,+Jawa+Tengah+58113/@-7.0997857,110.9078445,17.41z/data=!4m5!3m4!1s0x2e70b00a342bdcfd:0x6ab01c1582469b1!8m2!3d-7.0995689!4d110.9063049";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void email(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"111201911965@mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_CC, new String[] {""});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");
        intent.putExtra(Intent.EXTRA_TEXT, "Percobaan mengirim email dari aplikasi Android Studio");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
    public void telepon(View v) {
        String nomor = "081329604521" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }
}