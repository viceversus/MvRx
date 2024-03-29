package com.airbnb.mvrx.helloDagger.base

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.helloDagger.BuildConfig

/**
 * Base class for ViewModels.
 *
 * This class sets the 'Debug' mode in a [BaseMvRxViewModel] to the corresponding parameter
 * in the [BuildConfig] class.
 */
abstract class BaseViewModel<S : MvRxState>(initialState: S) : BaseMvRxViewModel<S>(initialState, BuildConfig.DEBUG)