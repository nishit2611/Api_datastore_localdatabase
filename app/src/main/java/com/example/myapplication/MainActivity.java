package com.example.retro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retro.client.ApiClient;
import com.example.retro.client.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RVServiceListAdapter rvServiceListAdapter;
    ArrayList<ServicesList> servicesLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        servicesLists = new ArrayList<>();
        recyclerView=findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvServiceListAdapter=new RVServiceListAdapter(MainActivity.this,servicesLists);
        recyclerView.setAdapter(rvServiceListAdapter);
        populateServices();
    }
    public void populateServices(){
        ApiClient.getClient().create(ApiInterface.class).getServiceList().enqueue(new Callback<ServiceListApiResponse>() {
            @Override
            public void onResponse(Call<ServiceListApiResponse> call, Response<ServiceListApiResponse> response) {
                if (response.code()== 200){
                    if (response.body().isStatus()){
                       servicesLists.addAll(response.body().getResponce());
                       rvServiceListAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<ServiceListApiResponse> call, Throwable t) {

            }
        });
    }
}