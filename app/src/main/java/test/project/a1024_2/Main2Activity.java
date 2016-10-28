package test.project.a1024_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity
    implements View.OnClickListener
{
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button2)
        {
            Log.d("MYLOG", "Button2 click");
        }
        else if(v.getId() == R.id.button3)
        {
            Log.d("MYLOG", "Button3 click");
        }
    }
    public void click4(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();
        Log.d("Phone",str);
    }
}