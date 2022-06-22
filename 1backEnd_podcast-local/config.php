<?php

$host = "localhost";
$user = "root";
$password = "";
$dbname = "podcast";
// Create connection
$con = mysqli_connect($host, $user, $password,$dbname);

// Check connection
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

/*
 else if (isset($_GET['id']) && isset($_GET['uid'])) {
    
    $id = $_GET['id'];
    $uid = $_GET['uid'];
    $query = "SELECT title, location, category,image, sub_category FROM audio
    JOIN speaker
    ON audio.IDspeaker = speaker.id
    JOIN category
    ON audio.IDcategory = category.id
    WHERE audio.IDspeaker = $id AND IDcategory = $uid ;  -- 1 should be dynamic value (variable)

    $raw = mysqli_query($con, $query);

    while ($res = mysqli_fetch_array($raw)) {
    $data[] = $res;
    }
    print(json_encode($data));
 }
*/