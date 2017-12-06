package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import java.util.List;

import cn.cong.firstproject.R;

/**
 * Created by ASUS on 2017/12/6.
 */

public class MainContextFrag extends Fragment{
private TableLayout tl;
private List<Fragment> frags;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_tab, container, false);
        tl = view.findViewById(R.id.tl);
//给tl添加标签

return view;
    }
}
