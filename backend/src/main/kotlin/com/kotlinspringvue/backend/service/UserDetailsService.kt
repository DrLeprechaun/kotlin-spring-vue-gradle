package com.kotlinspringvue.backend.service

import com.kotlinspringvue.backend.jpa.User
import org.springframework.security.core.userdetails.UserDetailsService

interface UserDetailsService : UserDetailsService {

    fun createVerificationTokenForUser(token: String, user: User)

    fun validateVerificationToken(token: String): String
}