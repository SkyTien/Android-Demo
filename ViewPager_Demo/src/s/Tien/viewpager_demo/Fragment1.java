package s.Tien.viewpager_demo;

import java.util.List;

import com.example.viewpager_demo.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment{
	
	Context context;
	TextView textview; 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment1_layout, container, false);
		context = getActivity();
		init(view);
		send();
        return view;
	}
	
	public void send() {
		Bundle bundle = new Bundle();		
		bundle.putString("String", "test string");
		Fragment2.newInstance(bundle);
		getActivity().getSupportFragmentManager().beginTransaction().commit();		
	}

	private void init(View view) {
		textview = (TextView)view.findViewById(R.id.textView1);
	}
	
	private Fragment1 getInstance(Bundle bundle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//接傳過來的參數
	public static Fragment1 newInstance() {
		Fragment1 fragment = new Fragment1();		
		return fragment;
	}

}
