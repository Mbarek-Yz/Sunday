package com.yazan.sunday

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform