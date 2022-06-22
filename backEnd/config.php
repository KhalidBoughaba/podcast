<?php

$host = "localhost";
$user = "id18848374_khalid";
$password = "6je-Y[g8G{OK/>U9";
$dbname = "id18848374_podkhotabae";
// Create connection
$con = mysqli_connect($host, $user, $password,$dbname);

// Check connection
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

