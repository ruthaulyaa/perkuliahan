<?php
    define("DISCOUNT", 20);
    $dataBarang = array("Teh Sosro","Botol",
    'harga' => 7500,);
    $harga_diskon = $dataBarang['harga'] * (1-(DISCOUNT/100)); ?>
<html>
    <head><title>Variables</title></head>
    <body><h4>Data Barang Jualan: </h4>
    <?php
    echo("Minuman : " . $dataBarang[0] . '<br>');
    echo("Satuan : " . $dataBarang[1] . '<br>');
    echo("Harga Jual : Rp." . $dataBarang['harga'] .
    '<br>');
    echo("Diskon : " . DISCOUNT . "%" . '<br>');
    echo("Harga Diskon : Rp." . $harga_diskon . '<br>');
    ?>
    </body>
</html>