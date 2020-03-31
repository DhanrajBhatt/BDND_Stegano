package com.BDND.stegno;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Tabone extends Fragment {


    private static final int REQUEST_CAPTURE = 1;
    private static final int GALLERY_KITKAT_INTENT_CALLED =100 ;
    private static final int GALLERY_INTENT_CALLED = 101;

    ImageView imacapture;
    Button btngallery;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate ( R.layout.fragment1 , container , false );

        btngallery = v.findViewById ( R.id.btngallery );
        imacapture = v.findViewById ( R.id.imageview );

        btngallery.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("video/, images/");
                startActivityForResult(intent, 2);
            }
        } );


        return v;
    }

    @Override
    public void onActivityResult(int requestCode , int resultCode , Intent data) {

        super.onActivityResult ( requestCode , resultCode , data );
    }
}






