package sk.gasparv;

import com.google.gson.JsonArray;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(GsonConverterFactory.create()).build();
        IApi pristupKApi = retrofit.create(IApi.class);

        pristupKApi.getUsers().enqueue(new Callback<JsonArray>() {

            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                System.out.println();
            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable throwable) {

            }
        });
    }
}
