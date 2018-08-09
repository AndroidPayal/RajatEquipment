package com.cluebix.payal.rajatequipment;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;


import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.cluebix.payal.rajatequipment.Adapters.MainAdapter;
import com.cluebix.payal.rajatequipment.Handlers.RquestHandler;
import com.cluebix.payal.rajatequipment.Model.ListItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    String Tag1_="server_correct_CartActivity",Tag2_="server_error_CartActivity";

    RecyclerView cart_recyclerview;

    MainAdapter adapter;
    ArrayList<ListItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cart_recyclerview=findViewById(R.id.cart_recyclerView);

        cart_recyclerview.setHasFixedSize(false);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        cart_recyclerview.setLayoutManager(layoutManager);
        cart_recyclerview.setNestedScrollingEnabled(false);
        cart_recyclerview.setFocusable(false);

        ArrayList<Integer> photoIdArray = new ArrayList<>();

        photoIdArray.add(R.drawable.ic_launcher_background);
        photoIdArray.add(R.drawable.ic_launcher_background);
        photoIdArray.add(R.drawable.ic_launcher_background);
        photoIdArray.add(R.drawable.ic_launcher_background);

        list = new ArrayList<>();
        ListItem item1 = new ListItem("some name",photoIdArray.get(0));
        ListItem item2 = new ListItem("strange product",photoIdArray.get(1));
        ListItem item3 = new ListItem("strange product",photoIdArray.get(2));
        ListItem item4 = new ListItem("titanium",photoIdArray.get(3));
        ListItem item5 = new ListItem("some string",photoIdArray.get(0));
        ListItem item6 = new ListItem("plutonium",photoIdArray.get(1));
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        list.add(item1);

        adapter = new MainAdapter(this,list,photoIdArray);
        cart_recyclerview.setAdapter(adapter);


    }
}
