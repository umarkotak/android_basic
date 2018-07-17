package com.example.umarramadhana.atp.network;

import com.example.umarramadhana.atp.pojo.Account;
import com.example.umarramadhana.atp.pojo.AccountAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AccountClient {
    private final String BASE_URL = "http://192.168.0.13";
    private Retrofit retrofit;
    private AccountAPI accountAPI;

    public AccountClient() {
        getAPIClient();
    }

    public AccountAPI getAPIClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        accountAPI = retrofit.create(AccountAPI.class);
        return accountAPI;
    }

    public void addAccount(Account account) {
        Call<Account> call = accountAPI.addAccount(account.name, account.email, account.noktp, account.address,
                account.nohp, account.username, account.password);
        call.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {

            }

            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
