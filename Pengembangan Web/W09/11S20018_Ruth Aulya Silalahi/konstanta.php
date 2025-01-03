<?php 
    $nim = "11S20018";
    $nama = "Ruth Aulya Silalahi";
    $angkatan = 2020;
    define("MAX_KELAS", 48); ?>
<html>
    <head><title>Variabel</title></head>
    <body><h4>Profil Mahasiswa: </h4>
    <?php echo("Nim: " . $nim . '<br>');
    echo("Nama: " . $nama . '<br>');
    echo("Angkatan: " . $angkatan . '<br>');
    echo("Mahasiswa perkelas: " . MAX_KELAS . '<br>');?>
    </body>
</html>