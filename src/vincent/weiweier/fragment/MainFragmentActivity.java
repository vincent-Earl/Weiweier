package vincent.weiweier.fragment;

import vincent.weiweier.R;
import vincent.weiweier.fragment.hostFragments.HomeHostFragment;
import vincent.weiweier.fragment.hostFragments.MessageHostFragment;
import vincent.weiweier.fragment.hostFragments.MoreHostFragment;
import vincent.weiweier.fragment.hostFragments.ProfileHostFragment;
import vincent.weiweier.fragment.hostFragments.SquareHostFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainFragmentActivity extends FragmentActivity {
	private RadioGroup radioGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
		HomeHostFragment fragment = new HomeHostFragment();
		
		FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.content, fragment);
		transaction.commit();
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
				Fragment fragment = null;
				if (checkedId == R.id.home) {
					fragment = new HomeHostFragment();
				} else if (checkedId == R.id.message) {
					fragment = new MessageHostFragment();
				} else if (checkedId == R.id.profile) {
					fragment = new ProfileHostFragment();
				} else if (checkedId == R.id.square) {
					fragment = new SquareHostFragment();
				} else if (checkedId == R.id.more) {
					fragment = new MoreHostFragment();
				}
				transaction.replace(R.id.content, fragment);
				transaction.commit();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
