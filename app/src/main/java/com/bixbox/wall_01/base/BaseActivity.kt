package com.bixbox.wall_01.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 14/11/2018.
 * tantuan127@gmail.com
 */
abstract class BaseActivity : AppCompatActivity() {
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onCreateView(savedInstanceState)
        setUpView()
    }


    protected abstract fun onCreateView(savedInstanceState: Bundle?)

    protected abstract fun setUpView()

}
