package br.com.adrianofpinheiro.trabalhokotlin.domain.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import br.com.adrianofpinheiro.trabalhokotlin.domain.Carro
import br.com.adrianofpinheiro.trabalhokotlin.domain.dao.CarroDAO

// Define as classes que precisam ser persistidas e a versão do banco
@Database(entities = arrayOf(Carro::class), version = 1)
abstract class CarrosDatabase : RoomDatabase() {
    abstract fun carroDAO(): CarroDAO
}
