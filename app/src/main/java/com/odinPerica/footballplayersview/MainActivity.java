package com.odinPerica.footballplayersview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText imeIgraca;
    private EditText prezimeIgraca;
    private Button btnGet;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imeIgraca = findViewById(R.id.imeIgraca);
        prezimeIgraca = findViewById(R.id.prezimeIgraca);
        btnGet = findViewById(R.id.buttonGet);
        textView = findViewById(R.id.textView);
        textView.setText("Molim vas unesite tocno ime i prezime igraca da bi aplikacija uredno radila.");


        btnGet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                try {
                    ucitaj();
                }catch (Exception e){
                    textView.setText("Unjeli ste ne tocno ime ili prezime.");
                }


            }
        });


    }


    private void ucitaj(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/api/v1/json/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        String playerName = imeIgraca.getText().toString() + "_" + prezimeIgraca.getText().toString();

        Call<Request> requestCall = api.getPlayer(playerName);
        requestCall.enqueue(new Callback<Request>() {
            @Override
            public void onResponse(Call<Request> call, Response<Request> response) {

                if(!response.isSuccessful()){
                    textView.setText("Code: " +response.code());
                }

                Request request = response.body();

                String content = "";

                try {
                    content += "Ime i prezime: " +  request.getPlayer().get(0).getStrPlayer() + "\n";
                    content += "Datum rođenja: " +request.getPlayer().get(0).getDateBorn() + "\n";
                    content += "Nacionalnost: " + request.getPlayer().get(0).getStrNationality() + "\n";
                    content += "Klub: " + request.getPlayer().get(0).getStrTeam() + "\n";
                    content += "Agent: " +request.getPlayer().get(0).getStrAgent() + "\n";
                    content += "O igraču: " +request.getPlayer().get(0).getStrDescriptionEN() + "\n";


                    textView.setText(content);

                }catch (Exception e){

                    textView.setText("Unjeli ste krivo ime ili prezime.");

                }







            }

            @Override
            public void onFailure(Call<Request> call, Throwable t) {
                textView.setText("Unijeli ste netocno ime igraca.");
            }
        });






    }
}
