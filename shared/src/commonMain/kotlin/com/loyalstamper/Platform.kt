package com.loyalstamper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform