package com.kevinriehm.mobileface;

import android.app.Activity;
import android.os.Bundle;

public class ExpressionViewActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.expression_view);

		ExpressionView view = (ExpressionView) findViewById(R.id.expression_surface);
		view.setExpressionFilePath(getIntent().getData().getPath());
		view.setAvatarFilePath(getIntent().getStringExtra("com.kevinriehm.mobileface.AvatarPath"));
	}
}

