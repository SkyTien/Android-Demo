package s.Tien.viewpager_demo;

import java.util.ArrayList;

import com.example.viewpager_demo.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter{

	ArrayList<String> text_list;
	LayoutInflater myInflater;
	Context mContext;
	
	public ListAdapter(Context mContext,ArrayList<String> text_list){
		this.mContext = mContext;
		this.text_list = text_list;
		myInflater = LayoutInflater.from(mContext);
	}
	
	@Override
	public int getCount() {
		return text_list.size();
	}

	@Override
	public Object getItem(int position) {
		return text_list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		final ViewTag viewTag;
        
        if(convertView == null){
            convertView = myInflater.inflate(R.layout.list_adapter_layout, parent, false);

            viewTag = new ViewTag(
            		(TextView)convertView.findViewById(R.id.list_textview));
            
            convertView.setTag(viewTag);
        }
        else{
            viewTag = (ViewTag) convertView.getTag();
        }

        // put list's value to view
        viewTag.list_textview.setText(text_list.get(position));
        
		return convertView;
	}
	class ViewTag{
    	TextView list_textview;
    	
        public ViewTag(
        		TextView list_textview){
        	
        	this.list_textview = list_textview;
        }
        
    }
}
