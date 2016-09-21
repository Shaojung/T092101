package tw.com.pcschool.t092101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] fruits = {"蘋果","橘子", "香蕉", "鳳梨", "柚子"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                                        MainActivity.this,
                                        android.R.layout.simple_list_item_1,
                                        fruits);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Click: " + fruits[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
