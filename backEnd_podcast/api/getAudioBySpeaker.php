<?php
include("../config.php");

$query = "SELECT title, location, category,image, sub_category FROM audio
        JOIN speaker
        ON audio.IDspeaker = speaker.id
        JOIN category
        ON audio.IDcategory = category.id
        WHERE audio.IDspeaker = 1"; // 1 should be dynamic value (variable)

$raw = mysqli_query($con, $query);

while ($res = mysqli_fetch_array($raw)) {
    $data[] = $res;
}
print(json_encode($data));