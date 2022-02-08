package io.rohail.anchorswap

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    fun getRandomColors(context: Context): List<Int> {
        val blue = ContextCompat.getColor(context, android.R.color.holo_blue_dark)
        val yellow = ContextCompat.getColor(context, android.R.color.holo_orange_light)

        val returnList = mutableListOf<Int>()

        for (i in 100 downTo 1) {
            if (Random.nextBoolean())
                returnList.add(blue)
            else
                returnList.add(yellow)
        }

        return returnList
    }
}