package com.darakeon.kolinit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.happy.happy_button

class HappyActivity : AppCompatActivity() {

	var MyNameIs: String? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.happy)

		happy_button.setOnClickListener {
			showText("Hey, listen!")
		}
	}

	private fun showText(text: String) {
		Toast.makeText(
			this,
			text,
			Toast.LENGTH_SHORT
		).show()
	}

	companion object {
		var ImHappy: Boolean? = true
	}
}
