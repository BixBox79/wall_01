package com.bixbox.wall_01.utils.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 13/11/2018.
 * tantuan127@gmail.com
 */
class SchedulerProvider private constructor() : BaseSchedulerProvider {

    companion object {
        val instance: BaseSchedulerProvider by lazy { SchedulerProvider() }
    }

    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}
