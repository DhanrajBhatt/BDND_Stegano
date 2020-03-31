package com.BDND.stegno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class About extends AppCompatActivity {
    TextView btn_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_about );

        if (!Python.isStarted ()) {
            Python.start ( new AndroidPlatform( this ) );
            Python py = Python.getInstance ();
            PyObject pyf = py.getModule ( "about" );
           PyObject obj=  pyf.callAttr ( "about" );
            btn_about=findViewById(R.id.about);
            btn_about.setText(obj.toString());

        }

    }
}




