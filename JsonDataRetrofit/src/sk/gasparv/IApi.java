package sk.gasparv;

import com.google.gson.JsonArray;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {
    @GET("users")
    Call<JsonArray> getUsers();

    @GET("posts")
    Call<JsonArray> getPosts();
}
