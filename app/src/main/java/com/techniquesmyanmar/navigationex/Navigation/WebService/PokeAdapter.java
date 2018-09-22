package com.techniquesmyanmar.navigationex.Navigation.WebService;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.techniquesmyanmar.navigationex.Navigation.WebService.model.Pokemon;
import com.techniquesmyanmar.navigationex.R;

import java.util.List;

/**
 * Created by user on 9/11/2018.
 */

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeHolder>{

    Context ctxt;
    List<Pokemon> pokes;

    public PokeAdapter(Context ctxt, List<Pokemon> pokes) {
        this.ctxt = ctxt;
        this.pokes = pokes;
    }

    @Override
    public PokeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li=LayoutInflater.from(ctxt);
        View v=li.inflate(R.layout.simple_view, parent, false);
        PokeHolder holder=new PokeHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(PokeHolder holder, int position) {
        Pokemon pkm=pokes.get(position);
        holder.tv.setText(pkm.getName());
        Picasso.get().load(pkm.getImg())
                .into(holder.imv);
    }

    @Override
    public int getItemCount() {
        return pokes.size();
    }

    public class PokeHolder extends RecyclerView.ViewHolder{

        ImageView imv;
        TextView tv;

        public PokeHolder(View itemView) {
            super(itemView);
            imv=itemView.findViewById(R.id.imv_svgv);
            tv=itemView.findViewById(R.id.tv_name_svgv);
        }
    }
}
