package com.sorapp.volley_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity
{


    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Main Function End




    //Get On Click On Button Event Start
    public void GetOnClick_OnButton(View v)
    {
        Get_String();
    }
    //Get On Click On Button Event End




    //Get Data From Server Function Start
    private void Get_String()
    {
        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "http://www.mocky.io/v2/597c41390f0000d002f4dbd1";

        StringRequest  mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                Toast.makeText(getApplicationContext(),"Response :" + response.toString(), Toast.LENGTH_LONG).show();
                Log.i("Errt",response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Log.i("Error","Error :" + error.toString());
            }
        });

        queue.add(mStringRequest);

    }
    //Get Data From Server Function End



}