package com.bixbox.wall_01.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 14/11/2018.
 * tantuan127@gmail.com
 */
open class BaseViewModel(application: Application) : AndroidViewModel(application) {

    protected val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}
