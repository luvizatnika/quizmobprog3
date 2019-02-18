package yudiwbs.edu.upi.cs.quiz3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mahasiswa> Items;
    Toolbar myToolbar;
    RecyclerView rvAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Items = new ArrayList<>();

        rvAlamat = (RecyclerView) findViewById(R.id.rvAlamat);
        rvAlamat.setHasFixedSize(true);

        /*CustomListAdapter adapter = new CustomListAdapter((Activity) getApplicationContext(), Items);
        rvAlamat.setAdapter(adapter);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rvAlamat.setLayoutManager(lm);*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.mIsiNama:
                Toast.makeText(getApplicationContext(), "Nama Terisi..", Toast.LENGTH_LONG).show();
                //lengkapi
                return true;
            case R.id.mIsiTabel:
                //Toast.makeText(getApplicationContext(), "Nama dan alamat terisi", Toast.LENGTH_LONG).show();
                //lengkapi
                Intent goCreate = new Intent(MainActivity.this, isiTabel.class);
                startActivity(goCreate);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
