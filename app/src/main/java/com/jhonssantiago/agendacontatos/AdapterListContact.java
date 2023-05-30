package com.jhonssantiago.agendacontatos;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListContact extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Contato> arrayContatos;

    public AdapterListContact(Context context, ArrayList<Contato> arrayContatos){
        this.arrayContatos = arrayContatos;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayContatos.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Contato contato = arrayContatos.get(position);

        view = inflater.inflate(R.layout.listcontact, null);
        ImageView image = view.findViewById(R.id.img_item);
        image.setImageResource(contato.getFoto());
        TextView nome = view.findViewById(R.id.textView_nome);
        nome.setText(contato.getNome());

        return view;
    }
}
