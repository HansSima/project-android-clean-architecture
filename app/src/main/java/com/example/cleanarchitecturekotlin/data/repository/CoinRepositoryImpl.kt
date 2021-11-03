package com.example.cleanarchitecturekotlin.data.repository

import com.example.cleanarchitecturekotlin.data.remote.CoinPaprikaApi
import com.example.cleanarchitecturekotlin.data.remote.dto.CoinDetailDto
import com.example.cleanarchitecturekotlin.data.remote.dto.CoinDto
import com.example.cleanarchitecturekotlin.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}