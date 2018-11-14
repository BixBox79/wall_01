package com.bixbox.wall_01.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 14/11/2018.
 * tantuan127@gmail.com
 */
abstract class BaseFragment : Fragment() {
    lateinit var viewodelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return createView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
    }

    protected abstract fun createView(
        @NonNull inflater: LayoutInflater,
        @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?
    ): View

    protected abstract fun setUpView()

}
