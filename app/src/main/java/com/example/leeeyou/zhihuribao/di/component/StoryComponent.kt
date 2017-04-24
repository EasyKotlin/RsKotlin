package com.example.leeeyou.zhihuribao.di.component

import com.example.leeeyou.zhihuribao.di.module.StoryModule
import com.example.leeeyou.zhihuribao.view.activity.StoryDetailActivity
import com.example.leeeyou.zhihuribao.view.activity.fragment.StoryFragmentKT
import dagger.Component
import javax.inject.Singleton

/**
 * Created by leeeyou on 2017/4/24.
 */
@Singleton
@Component(modules = arrayOf(StoryModule::class))
interface StoryComponent {
    fun inject(storyDetailActivity: StoryDetailActivity)

    fun inject(storyFragment: StoryFragmentKT)
}