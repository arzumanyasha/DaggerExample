package com.arturarzumanyan.daggerexample

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}