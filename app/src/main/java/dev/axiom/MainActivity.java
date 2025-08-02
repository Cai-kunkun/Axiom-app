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
		binding.efab.setOnClickListener(v ->
          fabOnClickEvents()
        );
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
    private void fabOnClickEvents(){
        if (binding.efab.isExtended()) binding.efab.shrink();
        else binding.efab.extend();
        Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
    }
}