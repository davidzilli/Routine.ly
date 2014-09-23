package com.bravebeard.routinely.robolectric;

import android.app.Activity;
import android.os.Bundle;

import com.bravebeard.routinely.R;

public class DeckardActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.deckard);
  }
}
