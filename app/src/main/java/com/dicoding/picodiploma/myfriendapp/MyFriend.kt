package com.dicoding.picodiploma.myfriendapp

data class MyFriend {
    val nama: String,
    val kelamin: String,
    val email: String,
    val telp: String,
    val alamat: String,
    lateinit var listTeman : MutableList<MyFriend>
}