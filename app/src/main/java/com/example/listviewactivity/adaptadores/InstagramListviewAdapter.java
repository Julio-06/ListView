package com.example.listviewactivity.adaptadores;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewactivity.R;
import com.example.listviewactivity.entidades.Chat;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class InstagramListviewAdapter  extends ArrayAdapter<Chat> {
    private List<Chat> chats = new ArrayList<>();
    public InstagramListviewAdapter(Context context, List<Chat> datos){
        super(context, R.layout.listview_layouttemplate,datos);
        chats =datos;
    }
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater =LayoutInflater.from(getContext());
        View item =inflater.inflate(R.layout.listview_layouttemplate,null);

        ImageView img = (ImageView)item.findViewById(R.id.imgfoto);
        img.setImageResource(chats.get(position).getFoto());
        TextView titulo = (TextView)item.findViewById(R.id.lbltitulo);
        titulo.setText(chats.get(position).getTitulo());
        TextView descripcion = (TextView)item.findViewById(R.id.lbldescripcion);
        descripcion.setText(chats.get(position).getDescripcion());
        return (item);
    }
}
