package com.bixbox.wall_01.utils.rx

import androidx.annotation.NonNull
import io.reactivex.Scheduler

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 13/11/2018.
 * tantuan127@gmail.com
 */
interface BaseSchedulerProvider {

    @NonNull
    fun io(): Scheduler

    @NonNull
    fun ui(): Scheduler
}
