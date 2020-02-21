package com.bf.lineplus;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Create_Note extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_note);

		//각종 변수 선언부
		TextInputLayout til_title = findViewById(R.id.til_title);
		TextInputLayout til_contents = findViewById(R.id.til_contents);
		ImageButton ib_save = findViewById(R.id.ib_save);


		//일단 내용을 가져옴
		StringBuffer strb_title = new StringBuffer();
		StringBuffer strb_contents = new StringBuffer();

		// XML 포맷으로 변형

		til_title.setCounterMaxLength(100);

		ib_save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TextInputLayout til_title = findViewById(R.id.til_title);
                TextInputLayout til_contents = findViewById(R.id.til_contents);
//				Snackbar.make(v, til_contents.getEditText().getText(), Snackbar.LENGTH_LONG)
//						.setAction("Action", null).show();
/*
                xml DB 하나 만들고
                TDB 따롷 하나 더

 */
				try {
					long now = System.currentTimeMillis();
					Date mDate = new Date(now);
					SimpleDateFormat simpleDate = new SimpleDateFormat("yyyyMMddhhmmss");
					String getTime = simpleDate.format(mDate);

					FileOutputStream fos = openFileOutput
							(getTime+".tdb", // 파일명 지정
									Context.MODE_APPEND);// 저장모드
					PrintWriter out = new PrintWriter(fos);
					out.print(til_contents.getEditText().getText());
					out.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});


//		try {
//			// 파일에서 읽은 데이터를 저장하기 위해서 만든 변수
//			StringBuffer data = new StringBuffer();
//			FileInputStream fis = openFileInput("myfile.txt");//파일명
//			BufferedReader buffer = new BufferedReader
//					(new InputStreamReader(fis));
//			String str = buffer.readLine(); // 파일에서 한줄을 읽어옴
//			while (str != null) {
//				data.append(str + "\n");
//				str = buffer.readLine();
//			}
//			tv.setText(data);
//			buffer.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();

	}
}
