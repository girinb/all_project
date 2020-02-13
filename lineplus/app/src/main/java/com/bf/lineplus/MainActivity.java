package com.bf.lineplus;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	//변수 선언부
	RecyclerView rv_mainlist;
	ArrayList<note_item> itemlist;
	container itemAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		//변수 초기화

		rv_mainlist = findViewById(R.id.id_rv_mainlist);




		ArrayList<String> t_imgs = new ArrayList<>();
		itemlist = new ArrayList<>();
//		t_imgs.add("dddd");
//		itemlist.add(new note_item("asdasd1","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd2","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd3","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd4","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd5","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd6","asddsad",t_imgs));
//		itemlist.add(new note_item("asdasd7","asddsad",t_imgs));

		rv_mainlist.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
		FloatingActionButton fab_createnote = findViewById(R.id.fab_createnote);
		itemAdapter = new container(itemlist);
		rv_mainlist.setAdapter(itemAdapter);
//		itemAdapter.notifyDataSetChanged();
		//

		fab_createnote.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(getApplicationContext(),Create_Note.class);
				startActivity(intent);


//				Snackbar.make(view, itemlist.get(0).getTitle(), Snackbar.LENGTH_LONG)
//						.setAction("Action", null).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
