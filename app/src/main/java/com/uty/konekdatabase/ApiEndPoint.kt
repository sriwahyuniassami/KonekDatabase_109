package com.uty.konekdatabase

class ApiEndPoint {
    companion object{
        //alamat IP didapatkan melalui cmd dengan mengetik ipconfig
        private val SERVER = "http://localhost/universitaskotlin/"
        val CREATE = SERVER+"create_fakultas.php"
        val READ = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
    }
}