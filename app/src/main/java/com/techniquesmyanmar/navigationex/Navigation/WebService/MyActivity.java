package com.techniquesmyanmar.navigationex.Navigation.WebService;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.techniquesmyanmar.navigationex.Navigation.WebService.model.PokeHub;
import com.techniquesmyanmar.navigationex.Navigation.WebService.model.Pokemon;
import com.techniquesmyanmar.navigationex.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 9/11/2018.
 */

public class MyActivity extends AppCompatActivity{

    RecyclerView rv;
    final String url="https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        rv=findViewById(R.id.rv_mya);
        rv.setLayoutManager(new GridLayoutManager(MyActivity.this, 2));

        Retrofit retrofit=new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()).build();

        PokeService ps=retrofit.create(PokeService.class);

        ps.getPokemon().enqueue(new Callback<PokeHub>() {
            @Override
            public void onResponse(Call<PokeHub> call, Response<PokeHub> response) {
                if (response.isSuccessful()){
                    PokeHub ph=response.body();
                    List<Pokemon> lists=ph.getPokemon();
                    PokeAdapter adapter=new PokeAdapter(MyActivity.this, lists);
                    rv.setAdapter(adapter);
                }else {
                    Toast.makeText(MyActivity.this,
                            "Something Wrong", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<PokeHub> call, Throwable t) {
                Toast.makeText(MyActivity.this, t.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
