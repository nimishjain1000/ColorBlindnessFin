package lakshmisaraf.colorblindnessfin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    Button test;

    public void test(View view)
    {
        Intent intent = new Intent(getApplicationContext(),TestActivity.class);
        startActivity(intent);

    }


    public void checkColor(View view)
    {
        Intent intent = new Intent(getApplicationContext(),CheckColor.class);
        startActivity(intent);

    }

    public void realView(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}