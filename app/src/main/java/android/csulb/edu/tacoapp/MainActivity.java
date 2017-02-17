package android.csulb.edu.tacoapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;
import android.telephony.SmsManager;



public class MainActivity extends AppCompatActivity {


    CheckBox Beefid, Cheeseid, Chickenid, riceid, guacamoleid, sea_foodid, beansid, picoid, lbtid, sodaid, cervezaid, margaritaid, tequilaid;
    RadioButton large, medium, corn, flour;

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       onCheckBoxClicked();

    }

    public void onCheckBoxClicked() {
        Beefid = (CheckBox) findViewById(R.id.Beef);
        Cheeseid = (CheckBox) findViewById(R.id.Cheese);
        Chickenid = (CheckBox) findViewById(R.id.Chicken);
        riceid = (CheckBox) findViewById(R.id.Rice);
        guacamoleid = (CheckBox) findViewById(R.id.Guacamole);
        sea_foodid = (CheckBox) findViewById(R.id.Sea_food);
        beansid = (CheckBox) findViewById(R.id.Beans);
        picoid = (CheckBox) findViewById(R.id.Pico);
        lbtid = (CheckBox) findViewById(R.id.LBT);
        sodaid = (CheckBox) findViewById(R.id.Soda);
        cervezaid = (CheckBox) findViewById(R.id.Cerveza);
        margaritaid = (CheckBox) findViewById(R.id.Margarita);
        tequilaid = (CheckBox) findViewById(R.id.Tequila);
        large = (RadioButton) findViewById(R.id.radioButton);
        medium = (RadioButton) findViewById(R.id.radioButton2);
        corn = (RadioButton) findViewById(R.id.radioButton3);
        flour = (RadioButton) findViewById(R.id.radioButton4);
        bt = (Button) findViewById(R.id.button);


        bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float amt = (float) 0.00;
                        String msg="I would like to have ";
                        if (large.isChecked())
                        {
                            amt = (float) (amt + 3.0);
                            msg = msg + "a large taco ";
                        }

                        if (medium.isChecked())
                        {
                            amt = (float) (amt + 2.5);
                            msg = msg + "a medium taco ";
                        }

                        if (corn.isChecked())
                        {
                            amt = (float) (amt + 2.5);
                            msg = msg + "of corn tortilla with ";
                        }

                        if (flour.isChecked())
                        {
                            amt = (float) (amt + 2.0);
                            msg = msg + "of flour tortilla with ";
                        }

                        if (Beefid.isChecked()) {
                            amt = (float) (amt + 0.5);
                            msg = msg + "beef, ";
                        }
                         if(Cheeseid.isChecked())
                         {
                             amt = (float) (amt + 0.8);
                             msg = msg + "cheese, ";
                         }

                        if(riceid.isChecked())
                        {
                            amt = (float) (amt + 1.0);
                            msg = msg + "rice, ";
                        }

                        if(guacamoleid.isChecked())
                        {
                            amt = (float) (amt +1.5);
                            msg = msg + "guacamole, ";
                        }

                        if(beansid.isChecked())
                        {
                            amt = (float) (amt + 0.9);
                            msg = msg + "beans, ";
                        }

                        if(sea_foodid.isChecked())
                        {
                            amt = (float) (amt +1.2);
                            msg = msg + "sea food, ";

                        }

                        if(Chickenid.isChecked())
                        {
                            amt = (float) (amt + 2.0);
                            msg = msg + "chicken, ";
                        }

                        if(picoid.isChecked())
                        {
                            amt = (float) (amt + 1.4);
                            msg = msg + "pico de gallo, ";
                        }

                        if(lbtid.isChecked())
                        {
                            amt = (float) (amt + 2.5);
                            msg = msg + "LBT, ";
                        }

                        if(sodaid.isChecked())
                        {
                            amt = (float) (amt + 1.6);
                            msg = msg + "with soda ";

                        }

                        if (margaritaid.isChecked())
                        {
                            amt = (float) (amt + 3.0);
                            msg = msg + "with margarita ";
                        }

                        if (cervezaid.isChecked())
                        {
                            amt = (float) (amt + 3.5);
                            msg = msg + "with cerveza ";
                        }

                        if (tequilaid.isChecked())
                        {
                            amt = (float) (amt + 10.00);
                            msg = msg + "with tequila ";
                        }

                        Toast.makeText(getApplicationContext(),"Your total amount is  " +amt , Toast.LENGTH_LONG).show();
                        String phone="+19162931377";

                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phone, null, msg, null, null);
                    }


                }


        );
    }


}


