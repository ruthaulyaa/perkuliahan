<?php 
    $nim = "11S20018";
    $nama = "Ruth Aulya Silalahi";
?>
<html>
    <head>
        <title>cis.del.ac.id</title>
        <style>
            th,td {
                padding-right: 100px;
                text-align: left;
            }
            hr {
                width:60%;
                text-align:left;
                margin-left:0;
            }
        </style>
    </head>
    <body>
        <h2>Kartu Rencana Studi (KRS)</h2>
        <hr>
        <table class="table">
            <tbody>
                <tr>
                    <th scope="row">NIM</th>
                    <td><?php echo $nim ?></td>
                </tr>
                <tr>
                    <th scope="row">NAMA</th>
                    <td><?php echo $nama ?></td>
                </tr>
            </tbody>
        </table>
        <br><br>
        <?php
        $daftarKRS = array(
            array("11S3109", "Pengembangan Aplikasi Berbasis Web", 4),
            array("11S3101", "Analisis dan Perancangan Perangkat Lunak", 3),
            array("10S3109", "Kecerdasan Buatan", 3),
            array("11S3116", "Teori Bahasa Formal dan Automata", 3),
            array("11S3112", "Pengujian dan Penjaminan Mutu Perangkat Lunak", 3),
            array("11S3105", "Kriptografi dan Keamanan Informasi", 3),
        );
        echo "<table>
            <tr>
                <th>Kode Mata Kuliah</th>
                <th>Nama Mata Kuliah</th>
                <th>SKS</th>
            </tr>";
            $total = 0;
            foreach ($daftarKRS as $krs) {
                echo "<tr>
                    <td>{$krs[0]}</td>
                    <td>{$krs[1]}</td>
                    <td>{$krs[2]}</td>
                </tr>";
                $total += $krs[2];
            }
            echo "<tr>
                <td>TOTAL</td>
                <td></td>
                <td>{$total}</td>
            </tr>
        </table>";?>
    </body>
</html>