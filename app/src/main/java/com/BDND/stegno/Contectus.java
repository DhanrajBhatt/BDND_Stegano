package com.BDND.stegno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class Contectus extends AppCompatActivity {
    TextView txt_contact_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_contectus );

        if (!Python.isStarted ()) {
            Python.start ( new AndroidPlatform( this ) );
            Python py = Python.getInstance ();
            PyObject pyf = py.getModule ( "contact_us" );
            PyObject obj=  pyf.callAttr ( "contact_us" );
            txt_contact_us=findViewById(R.id.contact_us);
            txt_contact_us.setText(obj.toString());


        }
    }
}
