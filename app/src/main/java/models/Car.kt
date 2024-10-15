package models

import java.io.Serializable

data class Car(
    val nomeCarro: String,
    val descricao: String,
    val price: String,
    val foto: Int,
    val cor: String,
    val modelo: String,
    val ano: String,
    val item: String,
    val km: String,
    val shortDescription: String,
    val rating: Float,
): Serializable