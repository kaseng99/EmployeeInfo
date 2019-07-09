package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Database> alSalary;

    ListView lvSalary;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSalary = findViewById(R.id.listView);

        alSalary = new ArrayList<>();



        alSalary.add(new Database("John","Programmer","3400.0"));
        alSalary.add(new Database("May","Engineer","2850.0"));
        alSalary.add(new Database("Peter","Manager","2100.0"));

        adapter = new Adapter(MainActivity.this,R.layout.row, alSalary);

        lvSalary.setAdapter(adapter);
    }
}
