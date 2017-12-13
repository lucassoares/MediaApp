package mediaapp.lucassoares.com.mediaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstBim, secondBim, thirdBim, fourthBim;
    private EditText media, finalMedia;
    private Button mediaButton;
    private float bim1, bim2, bim3, bim4, soma, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBim = (EditText) findViewById(R.id.bimId1);
        secondBim = (EditText) findViewById(R.id.bimId2);
        thirdBim = (EditText) findViewById(R.id.bimId3);
        fourthBim = (EditText) findViewById(R.id.bimId4);

        media = (EditText) findViewById(R.id.somaId);
        finalMedia = (EditText) findViewById(R.id.mediaId);
        mediaButton = (Button) findViewById(R.id.btnMediaId);

        mediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstBim.getText().toString().isEmpty() || secondBim.getText().toString().isEmpty() ||
                        thirdBim.getText().toString().isEmpty() || fourthBim.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Preencha todos os campos para calcular a média",Toast.LENGTH_SHORT).show();
                    return;
                }

                bim1 = Float.parseFloat(firstBim.getText().toString());
                bim2 = Float.parseFloat(secondBim.getText().toString());
                bim3 = Float.parseFloat(thirdBim.getText().toString());
                bim4 = Float.parseFloat(fourthBim.getText().toString());

                soma = bim1 + bim2 + bim3 + bim4;
                resultado = soma / 4;

                media.setText(Float.toString(soma));
                finalMedia.setText(Float.toString(resultado));
            }
        });
    }
}
