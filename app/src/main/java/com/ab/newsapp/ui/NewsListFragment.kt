package com.ab.newsapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ab.newsapp.R
import com.ab.newsapp.data.FakeDataSource
import com.ab.newsapp.ui.news.DiffUtilNewsItemCallback
import com.ab.newsapp.ui.news.NewsListAdapter

class NewsListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rv_list_news)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        adapter = NewsListAdapter(DiffUtilNewsItemCallback())
        recyclerView.adapter = adapter

        val fakeDataSource = FakeDataSource()
        adapter.submitList(fakeDataSource.fakeListNews)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }
}