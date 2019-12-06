<?php

/**
 Nama File : koneksi.php
 Developer : Sri Wahyuni Assami
 Company   : www.langitispirasi.co.id
 */

 //koneksi ke database universitaskotlin
 $con = mysqli_connect("localhost","root","","universitas_kotlin");

 //cek koneksi
 if (mysqli_connect_errno()){
     echo "Failed to connect to MySQL: ".mysqli_connect_error();
 }
?>