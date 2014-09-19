package s.Tien.viewpager_demo;

import com.example.viewpager_demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;


public class ViewPager_Main extends FragmentActivity {

	private ViewPager viewpager;
	private PagerAdapter adapter;
	private static final int NUM_PAGES = 2; //fragment 數量
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);
        init();
    }


    private void init() {
    	viewpager = (ViewPager)findViewById(R.id.viewpager);
		adapter = new slideAdapter(getSupportFragmentManager());
		viewpager.setAdapter(adapter);	
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.view_pager__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    private class slideAdapter extends FragmentStatePagerAdapter{
		public slideAdapter(FragmentManager fm) {
            super(fm);
        }
		
		@Override
        public Fragment getItem(int position) {
			switch(position) {
            case 0: return Fragment1.newInstance();
            case 1: return Fragment2.newInstance(null);
            }
			return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
    
    
}
