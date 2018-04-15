package my.com.miniaturemechanics.the8ballproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.askButton);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.the8BallImage);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("the8ballproject", "askButton was pressed");

                Random randNoGenerated = new Random();
                int rnumber = randNoGenerated.nextInt(5);

                Log.d("the8ballproject", "The random num is: " + rnumber);

                ballDisplay.setImageResource(ballArray[rnumber]);
            }
        });

    }
}
