package com.example.sampleservice

import org.springframework.context.annotation.Configuration
import org.springframework.util.Assert
import org.springframework.vault.annotation.VaultPropertySource
import org.springframework.vault.authentication.ClientAuthentication
import org.springframework.vault.authentication.TokenAuthentication
import org.springframework.vault.client.VaultEndpoint
import org.springframework.vault.config.AbstractVaultConfiguration

@Configuration
@VaultPropertySource("\${db.vault.secret.path}")
class VaultConfig : MyVCAbstractVaultConfiguration()


class MyVCAbstractVaultConfiguration : AbstractVaultConfiguration() {

    override fun vaultEndpoint(): VaultEndpoint {
        return VaultEndpoint.create(environment.getProperty("spring.cloud.vault.host"),
                Integer.parseInt(environment.getProperty("spring.cloud.vault.port")))
    }

    override fun clientAuthentication(): ClientAuthentication {
        val token = environment.getProperty("spring.cloud.vault.token")
        Assert.hasText(token,
                "Vault Token authentication: Token (vault.token) must not be empty")

        return TokenAuthentication(token)
    }
}