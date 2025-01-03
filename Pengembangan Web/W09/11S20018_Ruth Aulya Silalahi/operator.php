<?php 
    $minuman = "Teh Sosro";
    $satuan = "Botol";
    $harga = 7500;
    define("DISCOUNT", 20);
    $harga_diskon = $harga * (1-(DISCOUNT/100)); ?>
<html>
    <head><title>Variabel</title></head>
    <body><h4>Datang Barang Jualan: </h4>
    <?php echo("Minuman: " . $minuman. '<br>');
    echo("Satuan: " . $satuan . '<br>');
    echo("Harga jual: Rp." . $harga . '<br>');
    echo("Diskon: " . DISCOUNT . "%" . '<br>'); 
    echo("Harga diskon:  Rp." .$harga_diskon . '<br>');?>
    </body>
</html>
