package com.chirikualii.materi_fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chirikualii.materi_fragment.databinding.FragmentHomeBinding
import com.chirikualii.materi_fragment.home.nowplaying.NowPlayingFragment
import com.chirikualii.materi_fragment.home.popular.PopularFragment


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val listFragment = listOf(
        NowPlayingFragment(),
        PopularFragment()
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(
            inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPagerAdapter = ViewPagerAdapter(
            listFragment,parentFragmentManager
        )

        binding.ViewPager.adapter = viewPagerAdapter

        binding.tabLayout.setupWithViewPager(binding.ViewPager)
    }
}