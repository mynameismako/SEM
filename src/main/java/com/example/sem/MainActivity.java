package com.example.sem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnResultaat = (Button) findViewById(R.id.btnResultaat);
        btnResultaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting Button to Function (Edit Text)
                EditText uurLoon = (EditText) findViewById(R.id.uurLoon);
                EditText aantalDagen = (EditText) findViewById(R.id.aantalDagen);
                EditText weekOverUren = (EditText) findViewById(R.id.weekOverUren);

                //Weekend Overuren
                EditText zaterdagUren = (EditText) findViewById(R.id.zaterdagUren);
                EditText zaterdagOverUren = (EditText) findViewById(R.id.zaterdagOverUren);
                EditText zondagUren = (EditText) findViewById(R.id.zondagUren);

                //Zwamp Toelagen
                EditText zwampToelagen = (EditText) findViewById(R.id.zwampToelagen);

                //Text View
                TextView bord = (TextView) findViewById(R.id.bord);
                TextView normaleLoon1 = (TextView) findViewById(R.id.normaleLoon1);
                TextView weekOverUren1 = (TextView) findViewById(R.id.weekOverUren1);

                //Weekend Overuren
                TextView zaterdagUren1 = (TextView) findViewById(R.id.zaterdagUren1);
                TextView zaterdagOverUren1 = (TextView) findViewById(R.id.zaterdagOverUren1);
                TextView zondagUren1 = (TextView) findViewById(R.id.zondagUren1);

                //Zwamp Toelagen
                TextView zwampToelagen1 = (TextView) findViewById(R.id.zwampToelagen1);

                //Bruto + SubTotaal Toelagen
                TextView brutoSaldo = (TextView) findViewById(R.id.brutoSaldo);
                TextView subTotaal1 = (TextView) findViewById(R.id.subTotaal1);

                //TextField Integer convert to String
                double num1 = Double.parseDouble(uurLoon.getText().toString());
                double num2 = Double.parseDouble(aantalDagen.getText().toString());
                double num3 = Double.parseDouble(weekOverUren.getText().toString());
                double num4 = Double.parseDouble(zaterdagUren.getText().toString());
                double num5 = Double.parseDouble(zaterdagOverUren.getText().toString());
                double num6 = Double.parseDouble(zondagUren.getText().toString());
                double num7 = (double) 100;
                double num9 = (double) 1.50;
                double num10 = (double) 2;
                double num11 = (double) 3;
                double num12 = Double.parseDouble(zwampToelagen.getText().toString());
                double num13 = (double) 8;

                //Giving the operator a math function

                bord.setText("Slip Resultaat");

                //Normale Loon function
                double aantalUren = num2 * num13;
                double normaleLoon2 = aantalUren * num1;
                normaleLoon1.setText("Normale loon: " + "SRD " + normaleLoon2);

                //Door de week overuren loon function
                double weekOverUren2 = num1 * num3 * num9;
                weekOverUren1.setText("Normale overuur: " + "SRD " + weekOverUren2);

                //Zaterdag Loon function
                double zaterdagUren2 = num1 * num4 * num9;
                zaterdagUren1.setText("Zaterdag loon: " + "SRD " + zaterdagUren2);

                //zaterdag overuren function
                double zaterdagOverUren2 = num1 * num5 * num10;
                zaterdagOverUren1.setText("Zaterdag overuur: " + "SRD " + zaterdagOverUren2);

                //Zondag Loon function
                double zondagUren2 = num1 * num6 * num11;
                zondagUren1.setText("Zondag loon: " + "SRD " + zondagUren2);

                //Bruto Saldo
                double brutoSaldo2 = normaleLoon2 + weekOverUren2 + zaterdagUren2 + zaterdagOverUren2 + zondagUren2;
                brutoSaldo.setText("Bruto Saldo: " + "SRD " + brutoSaldo2);


                //Zwamp Toelagen function (Codes Nazien)
                double zwampToelagen2 = brutoSaldo2 / num7;
                double zwampToelagen3 = zwampToelagen2 * num12;
                zwampToelagen1.setText("Zwamp toelagen: SRD " + zwampToelagen3);

                //SubTotaal
                double subTotaal2 = brutoSaldo2 + zwampToelagen3;
                        subTotaal1.setText("SubTotaal: " + "SRD" + subTotaal2);

            }
        });

        //Clear (Edit Text)
        final EditText uurLoon = (EditText) findViewById(R.id.uurLoon);
        final EditText aantalDagen = (EditText) findViewById(R.id.aantalDagen);
        final EditText weekOverUren = (EditText) findViewById(R.id.weekOverUren);
        final EditText zaterdagUren = (EditText) findViewById(R.id.zaterdagUren);
        final EditText zaterdagOverUren = (EditText) findViewById(R.id.zaterdagOverUren);
        final EditText zondagUren = (EditText) findViewById(R.id.zondagUren);

        //Clear (Zwamp Toelagen)
        final EditText zwampToelagen = (EditText) findViewById(R.id.zwampToelagen);

        //Clear (Text View)
        final TextView bord = (TextView) findViewById(R.id.bord);
        final TextView normaleLoon1 = (TextView) findViewById(R.id.normaleLoon1);
        final TextView weekOverUren1 = (TextView) findViewById(R.id.weekOverUren1);
        final TextView zaterdagUren1 = (TextView) findViewById(R.id.zaterdagUren1);
        final TextView zaterdagOverUren1 = (TextView) findViewById(R.id.zaterdagOverUren1);
        final TextView zondagUren1 = (TextView) findViewById(R.id.zondagUren1);
        final TextView zwampToelagen1 = (TextView) findViewById(R.id.zwampToelagen1);
        final TextView brutoSaldo = (TextView) findViewById(R.id.brutoSaldo);
        final TextView subTotaal1 = (TextView) findViewById(R.id.subTotaal1);


        Button New = (Button) findViewById(R.id.New);
        New.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                //Edit Text
                uurLoon.getText().clear();
                aantalDagen.getText().clear();
                weekOverUren.getText().clear();
                zaterdagUren.getText().clear();
                zaterdagOverUren.getText().clear();
                zondagUren.getText().clear();
                zwampToelagen.getText().clear();

                //Text Field
                bord.setText("");
                normaleLoon1.setText("");
                weekOverUren1.setText("");
                zaterdagUren1.setText("");
                zaterdagOverUren1.setText("");
                zondagUren1.setText("");
                zwampToelagen1.setText("");
                brutoSaldo.setText("");
                subTotaal1.setText("");

            }
        });
    }
}
