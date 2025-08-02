package dev.axiom;

import android.widget.Toast;
import dev.axiom.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    private ActivityMainBinding binding;
	
    @Override
    public void onCreateDoes() {
		binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
		binding.fab.setOnClickListener(v ->
          Toast.makeText(MainActivity.this, "Replace with your action", Toast.LENGTH_SHORT).show()
        );
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}