package com.baloot.test.features.main.ui

import androidx.navigation.NavDirections

interface MainHelper {

    fun navigate(direction: NavDirections)

    fun navigateSinglePage(direction: NavDirections, finish: Boolean = false)

    fun clearStack(tag: MainNavigationTag = MainNavigationTag.Default)

    fun goBack(tag: MainNavigationTag = MainNavigationTag.Default, number: Int = 1)

    fun switchTab(tag: MainNavigationTag)

    fun showLongMessage(resourceId: Int)

    fun showLongMessage(message: String)

    fun showShortMessage(resourceId: Int)

    fun showShortMessage(message: String)

    fun showRemoteMessage(serverErrorMessage: String?, errorMessage: Int)
}
