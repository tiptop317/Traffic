package appegat.r.patthrawan.traffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView showTitleTextView, showDetailTextView;
    ImageView showImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //BindWidget
        bindWidget();

        //Button Controller
        buttonController();

        //Show Title
        showTitle();

        //Show Image
        showImage();

        //Show Detail
        showDetail();

    }   //OnCreate

    private void showDetail() {
        String strDetail[] = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        showDetailTextView.setText(strDetail[intIndex]);
    }

    private void showImage() {
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        showImageView.setImageResource(intImage);
    }

    private void showTitle() {
        String strTitle = getIntent().getStringExtra("Title");
        showTitleTextView.setText(strTitle);
    }

    private void buttonController() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                //Intent obIntent = new Intent(DetailActivity.this, MainActivity.class);
                //startActivity(obIntent);
            }
        });
    }

    private void bindWidget() {
        showTitleTextView = (TextView) findViewById(R.id.txtShowTitle);
        showDetailTextView = (TextView) findViewById(R.id.txtShowDetail);
        showImageView = (ImageView) findViewById(R.id.imvShowImage);
        backButton = (Button) findViewById(R.id.btnBack);
    }   //bindWidget

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   //Main Class
