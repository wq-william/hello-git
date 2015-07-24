package com.example.gittest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("hello 测试ssh更换过后");
		//第一次
		System.out.println("增加打印信息2");
//<<<<<<< HEAD
		//第二次提交服务器
//=======
//>>>>>>> branch 'master' of https://github.com/wq-william/hello-git.git
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
