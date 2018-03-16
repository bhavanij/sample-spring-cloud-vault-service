package com.example.sampleservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class VaultPropertiesTest(@Value("\${db.username}") val userName: String,
                          @Value("\${db.password}") val password: String) {


    init {
        println("UserName:: $userName. Password:: $password")
    }

}