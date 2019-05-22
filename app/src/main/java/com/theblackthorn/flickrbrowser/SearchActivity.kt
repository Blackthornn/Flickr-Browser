package com.theblackthorn.flickrbrowser

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView


class SearchActivity : BaseActivity() {
    private val TAG = "SearchActivity"
    private var searchView: SearchView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "***.onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        activateToolBar(true)
        Log.d(TAG, "***.onCreate: ends")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        return true
    }
}
