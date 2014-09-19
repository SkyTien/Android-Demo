package s.Tien.viewpager_demo;

import com.example.viewpager_demo.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment{
	
	static String s;
	Context context;
	static TextView textview;
	static Bundle bundle;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment2_layout, container, false);
		context = getActivity();
		init(view);
		set();		
        return view;
	}
	
	private void set() {
		textview.setText(s);
	}

	private void init(View view) {
		textview = (TextView)view.findViewById(R.id.textView1);
	}
	
	
	
	public static Fragment2 newInstance(Bundle mbundle) {
		Fragment2 fragment = new Fragment2();
		bundle = mbundle;
		if(bundle != null){
			s = bundle.getString("String");
		}
		return fragment;
	}

	
	


}
