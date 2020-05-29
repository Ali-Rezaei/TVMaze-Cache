package com.android.sample.tvmaze.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.android.sample.tvmaze.domain.Show
import com.android.sample.tvmaze.repository.ShowRepository
import com.android.sample.tvmaze.util.Result

class MainViewModel(
    repository: ShowRepository
) : ViewModel() {

    private val _shows = repository.shows
    val shows: LiveData<Result<List<Show>>>
        get() = _shows
}