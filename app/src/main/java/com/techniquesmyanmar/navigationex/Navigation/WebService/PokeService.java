package com.techniquesmyanmar.navigationex.Navigation.WebService;

import com.techniquesmyanmar.navigationex.Navigation.WebService.model.PokeHub;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 9/11/2018.
 */

public interface PokeService {

    @GET("pokedex.json")
    Call<PokeHub> getPokemon();
}
