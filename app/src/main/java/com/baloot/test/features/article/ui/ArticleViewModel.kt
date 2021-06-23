package com.baloot.test.features.article.ui

import com.baloot.test.core.util.viewModel.BaseViewModel
import com.baloot.test.features.article.domain.GetArticleLocal
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapMerge
import javax.inject.Inject

@FlowPreview
@HiltViewModel
class ArticleViewModel @Inject constructor(
    getArticleLocal: GetArticleLocal
) : BaseViewModel() {

    private val articleId = MutableStateFlow(0)

    val article = articleId.flatMapMerge {
        getArticleLocal(it)
    }

    fun emitArticleId(value: Int) {
        articleId.value = value
    }

    override fun getData() {}
}
