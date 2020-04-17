package vn.edu.ntu.tronghanh.nguyentronghanh_59130629_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "LifeCycle",  "onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate called, onStart called, onResume called", Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
    }
}
