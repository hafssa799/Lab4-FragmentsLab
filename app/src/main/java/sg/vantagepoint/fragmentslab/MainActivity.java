package sg.vantagepoint.fragmentslab;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnFragment1);
        Button btn2 = findViewById(R.id.btnFragment2);

        // Charger le premier fragment au démarrage
        if (savedInstanceState == null) {
            loadFragment(new FragmentOne());
        }

        btn1.setOnClickListener(v -> loadFragment(new FragmentOne()));
        btn2.setOnClickListener(v -> loadFragment(new FragmentTwo()));
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}