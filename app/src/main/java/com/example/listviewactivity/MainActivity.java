package com.example.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewactivity.adaptadores.InstagramListviewAdapter;
import com.example.listviewactivity.entidades.Chat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstSF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstSF = (ListView)findViewById(R.id.lstSF);
        this.LoadList();
    }
    private void LoadList(){
        /*List<String> listSencillo = new ArrayList<String>();
        listSencillo.add("Matematicas");
        listSencillo.add("español");
        listSencillo.add("ingles");
        listSencillo.add("ciencias");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listSencillo);*/


        List<Chat> chats =  new ArrayList<>();
        chats.add(new Chat(R.drawable.ricky,"Pickles Rick","Active now"));
        chats.add(new Chat(R.drawable.iron,"Iron Man","Active now"));
        chats.add(new Chat(R.drawable.hulk,"Hulk","Active now"));
        chats.add(new Chat(R.drawable.gato,"Gato llorando","Active now"));
        chats.add(new Chat(R.drawable.pepa,"Peppa pig","Active now"));

        InstagramListviewAdapter adapter =  new InstagramListviewAdapter(getApplicationContext(),chats);

        lstSF.setAdapter(adapter);
    }
}
