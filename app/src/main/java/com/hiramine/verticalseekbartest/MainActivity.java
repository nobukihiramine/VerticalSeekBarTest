package com.hiramine.verticalseekbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener
{
	SeekBar seekBar1;
	SeekBar seekBar2;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		seekBar1 = (SeekBar)findViewById( R.id.seekBar1 );
		seekBar1.setOnSeekBarChangeListener( this );

		seekBar2 = (SeekBar)findViewById( R.id.seekBar2 );
		seekBar2.setOnSeekBarChangeListener( this );
	}

	@Override
	public void onProgressChanged( SeekBar seekBar, int progress, boolean fromUser )
	{
		if( seekBar1.getId() == seekBar.getId() )
		{
			String strMessage = "SeekBar1 : " + String.valueOf( progress );
			( (TextView)findViewById( R.id.textview_message ) ).setText( strMessage );
		}
		if( seekBar2.getId() == seekBar.getId() )
		{
			String strMessage = "SeekBar2 : " + String.valueOf( progress );
			( (TextView)findViewById( R.id.textview_message ) ).setText( strMessage );
		}
	}

	@Override
	public void onStartTrackingTouch( SeekBar seekBar )
	{

	}

	@Override
	public void onStopTrackingTouch( SeekBar seekBar )
	{

	}
}
