package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bean.Users;
import cn.cong.firstproject.R;

/**
 * Created by ASUS on 2017/12/5.
 */

public class UserAdapter extends BaseAdapter {
    private List<Users> list;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //创建View,Holder
        View view;
        Holder holder;
        //先判断view是否存在，不存在的话，创建view
        if (convertView==null){
           view= LayoutInflater.from(parent.getContext())
                   .inflate(R.layout.item_user,parent,false);
           holder=new Holder();
           holder.tv_name=view.findViewById(R.id.tv_name);
           holder.tv_sign=view.findViewById(R.id.tv_sign);
           holder.iv_head=view.findViewById(R.id.iv_head);
           view.setTag(holder);
         }else{
            view=convertView;
            holder= (Holder) convertView.getTag();
        }
        Users u=list.get(position);
        holder.tv_name.setText(u.getUname());

        return view;
    }
    class  Holder{
        TextView tv_sign,tv_name;
        ImageView iv_head;
    }
}
