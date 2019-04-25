package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
   private TextView que;
   private Button ans_1;
   private Button ans_2;
   int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        que=(TextView)findViewById(R.id.storyTextView);
        ans_1=(Button)findViewById(R.id.buttonTop);
        ans_2=(Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        ans_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    que.setText(getString(R.string.T3_Story));
                    ans_1.setText(getString(R.string.T3_Ans1));
                    ans_2.setText(getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                }
               else if(mStoryIndex==3)
                {
                    que.setText(R.string.T6_End);
                    ans_1.setVisibility(View.GONE);
                    ans_2.setVisibility(View.GONE);
                    mStoryIndex=6;
                }
                else if(mStoryIndex==2)
                {
                    que.setText(getString(R.string.T3_Story));
                    ans_1.setText(getString(R.string.T3_Ans1));
                    ans_2.setText(getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        ans_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    que.setText(getString(R.string.T2_Story));
                    ans_1.setText(getString(R.string.T2_Ans1));
                    ans_2.setText(getString(R.string.T2_Ans2));
                    mStoryIndex = 2;
                }
                else if(mStoryIndex==3)
                {
                    que.setText(R.string.T5_End);
                    ans_1.setVisibility(View.GONE);
                    ans_2.setVisibility(View.GONE);
                }
                else if(mStoryIndex==2)
                {
                    que.setText(R.string.T4_End);
                    ans_1.setVisibility(View.GONE);
                    ans_2.setVisibility(View.GONE);
                    mStoryIndex=4;
                }

            }
        });


    }
}
