package vincent.weiweier.fragment.hostFragments;

import vincent.weiweier.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/** 
 * 文件名称:   HomeFragment.java 
 * 功能描述:  
 * 版本信息:   Copyright (c)2013 
 * 公司信息:   瑜旭网络
 * 开发人员:   vincent
 * 版本日志:   1.0 
 * 创建时间:   2013年11月28日 下午2:26:54 
 * 
 * 修改历史: 
 * 时间         开发者      版本号    修改内容 
 * ------------------------------------------------------------------ 
 * 2013年11月28日   vincent      1.0         1.0 Version 
 */
public class HomeHostFragment extends HostFragment {
	private View view ;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = (View)inflater.inflate(R.layout.layout_home_host, null);
		return view;
	}

}
