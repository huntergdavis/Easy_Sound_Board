package com.hunterdavis.easysoundboard;

import java.io.IOException;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class EasySoundBoard extends Activity {

	InventorySQLHelper SoundData = new InventorySQLHelper(this);

	Uri uri1 = null;
	Uri uri2 = null;
	Uri uri3 = null;
	Uri uri4 = null;
	Uri uri5 = null;
	Uri uri6 = null;
	Uri uri7 = null;
	Uri uri8 = null;
	Uri uri9 = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// find all the text views
		final TextView textView1 = (TextView) findViewById(R.id.soundFile1);
		final TextView textView2 = (TextView) findViewById(R.id.soundFile2);
		final TextView textView3 = (TextView) findViewById(R.id.soundFile3);
		final TextView textView4 = (TextView) findViewById(R.id.soundFile4);
		final TextView textView5 = (TextView) findViewById(R.id.soundFile5);
		final TextView textView6 = (TextView) findViewById(R.id.soundFile6);
		final TextView textView7 = (TextView) findViewById(R.id.soundFile7);
		final TextView textView8 = (TextView) findViewById(R.id.soundFile8);
		final TextView textView9 = (TextView) findViewById(R.id.soundFile9);

		// find all the buttons
		final Button playButton1 = (Button) findViewById(R.id.playButton1);
		final Button playButton2 = (Button) findViewById(R.id.playButton2);
		final Button playButton3 = (Button) findViewById(R.id.playButton3);
		final Button playButton4 = (Button) findViewById(R.id.playButton4);
		final Button playButton5 = (Button) findViewById(R.id.playButton5);
		final Button playButton6 = (Button) findViewById(R.id.playButton6);
		final Button playButton7 = (Button) findViewById(R.id.playButton7);
		final Button playButton8 = (Button) findViewById(R.id.playButton8);
		final Button playButton9 = (Button) findViewById(R.id.playButton9);

		// create a mega onclick listener
		OnClickListener everyThingListner = new OnClickListener() {
			public void onClick(View v) {
				// do something when the button is clicked
				if (v == playButton1) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri1);
				} else if (v == playButton2) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri2);
				} else if (v == playButton3) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri3);
				} else if (v == playButton4) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri4);
				} else if (v == playButton5) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri5);
				} else if (v == playButton6) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri6);
				} else if (v == playButton7) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri7);
				} else if (v == playButton8) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri8);
				} else if (v == playButton9) {
					// Things to do
					// play a sound from button 1
					playSound(v.getContext(), uri9);
				}

				// blah blah

				else if (v == textView1) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 1);
				} else if (v == textView2) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 2);
				} else if (v == textView3) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 3);
				} else if (v == textView4) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 4);
				} else if (v == textView5) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 5);
				} else if (v == textView6) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 6);
				} else if (v == textView7) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 7);
				} else if (v == textView8) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 8);
				} else if (v == textView9) {
					Intent intent = new Intent();
					intent.setType("audio/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					startActivityForResult(
							Intent.createChooser(intent, "Select Audio"), 9);
				}

			}
		};

		// attach the listener
		playButton1.setOnClickListener(everyThingListner);
		textView1.setOnClickListener(everyThingListner);
		playButton2.setOnClickListener(everyThingListner);
		textView2.setOnClickListener(everyThingListner);
		playButton3.setOnClickListener(everyThingListner);
		textView3.setOnClickListener(everyThingListner);
		playButton4.setOnClickListener(everyThingListner);
		textView4.setOnClickListener(everyThingListner);
		playButton5.setOnClickListener(everyThingListner);
		textView5.setOnClickListener(everyThingListner);
		playButton6.setOnClickListener(everyThingListner);
		textView7.setOnClickListener(everyThingListner);
		playButton7.setOnClickListener(everyThingListner);
		textView7.setOnClickListener(everyThingListner);
		playButton8.setOnClickListener(everyThingListner);
		textView8.setOnClickListener(everyThingListner);
		playButton9.setOnClickListener(everyThingListner);
		textView9.setOnClickListener(everyThingListner);

		// load the old values
		loadOldValues(getBaseContext());

		
		// Look up the AdView as a resource and load a request.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		adView.loadAd(new AdRequest());
		
		
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

		final TextView textView1 = (TextView) findViewById(R.id.soundFile1);
		final TextView textView2 = (TextView) findViewById(R.id.soundFile2);
		final TextView textView3 = (TextView) findViewById(R.id.soundFile3);
		final TextView textView4 = (TextView) findViewById(R.id.soundFile4);
		final TextView textView5 = (TextView) findViewById(R.id.soundFile5);
		final TextView textView6 = (TextView) findViewById(R.id.soundFile6);
		final TextView textView7 = (TextView) findViewById(R.id.soundFile7);
		final TextView textView8 = (TextView) findViewById(R.id.soundFile8);
		final TextView textView9 = (TextView) findViewById(R.id.soundFile9);

		if (resultCode == RESULT_OK) {
			Uri localUri = null;
			if (requestCode == 1) {
				uri1 = data.getData();
				textView1.setText(uri1.toString());
				localUri = uri1;
			} else if (requestCode == 2) {
				uri2 = data.getData();
				textView2.setText(uri2.toString());
				localUri = uri2;
			} else if (requestCode == 3) {
				uri3 = data.getData();
				textView3.setText(uri3.toString());
				localUri = uri3;
			} else if (requestCode == 4) {
				uri4 = data.getData();
				textView4.setText(uri4.toString());
				localUri = uri4;
			} else if (requestCode == 5) {
				uri5 = data.getData();
				textView5.setText(uri5.toString());
				localUri = uri5;
			} else if (requestCode == 6) {
				uri6 = data.getData();
				textView6.setText(uri6.toString());
				localUri = uri6;
			} else if (requestCode == 7) {
				uri7 = data.getData();
				textView7.setText(uri7.toString());
				localUri = uri7;
			} else if (requestCode == 8) {
				uri8 = data.getData();
				textView8.setText(uri8.toString());
				localUri = uri8;
			} else if (requestCode == 9) {
				uri9 = data.getData();
				textView9.setText(uri9.toString());
				localUri = uri9;
			}
			// update the sql table
			if (localUri != null) {
				updateSqlValues(requestCode, localUri);
			}

		}
	}

	public void playSound(Context context, Uri PATH_TO_FILE) {
		if (PATH_TO_FILE == null) {
			showError(context);
			return;
		}
		MediaPlayer mp = new MediaPlayer();
		try {
			mp.setDataSource(context, PATH_TO_FILE);
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		}
		try {
			mp.prepare();
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		}
		try {
			mp.start();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			Toast.makeText(context, "Error Playing Audio File!",
					Toast.LENGTH_LONG).show();
		}

	}

	public void showError(Context context) {
		Toast.makeText(getBaseContext(), "Please Select An Audio File",
				Toast.LENGTH_SHORT).show();
	}

	private void loadOldValues(Context context) {
		for (int i = 1; i < 10; i++) {
			Cursor cursor = getCursorByID(i);
			if(cursor.getCount() > 0)
			{
				cursor.moveToFirst();
				setButtonUri(i,cursor.getString(2));
			}
		}
	}
	
	private void setButtonUri(int i, String uri)
	{
		if(i == 1)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile1);
			textView.setText(uri);		
			uri1 = Uri.parse(uri);
		}
		else if(i == 2)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile2);
			textView.setText(uri);
			uri2 = Uri.parse(uri);
		}
		else if(i == 3)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile3);
			textView.setText(uri);
			
			uri3 = Uri.parse(uri);
		}
		else if(i == 4)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile4);
			textView.setText(uri);		
			
			uri4 = Uri.parse(uri);
		}
		else if(i == 5)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile5);
			textView.setText(uri);	
			
			uri5 = Uri.parse(uri);
		}
		else if(i == 6)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile6);
			textView.setText(uri);	
			
			uri6 = Uri.parse(uri);
		}
		else if(i == 7)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile7);
			textView.setText(uri);		
			
			uri7 = Uri.parse(uri);
		}
		else if(i == 8)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile8);
			textView.setText(uri);	
			
			uri8 = Uri.parse(uri);
		}
		else if(i == 9)
		{
			TextView textView = (TextView) findViewById(R.id.soundFile9);
			textView.setText(uri);	
			
			uri9 = Uri.parse(uri);
		} 
		
	}

	private void updateSqlValues(int id, Uri value) {
		SQLiteDatabase db = SoundData.getWritableDatabase();
		ContentValues args = new ContentValues();
		args.put("uri", value.toString());
		args.put("num",String.valueOf(id)); 
		db.insert(InventorySQLHelper.TABLE, null, args);
	}

	private Cursor getCursorByID(int rowId) {
		SQLiteDatabase db = SoundData.getReadableDatabase();
		Cursor cursor = db.query(InventorySQLHelper.TABLE, null, "num = "
				+ rowId, null, null, null, null);
		startManagingCursor(cursor);
		return cursor;
	}

}