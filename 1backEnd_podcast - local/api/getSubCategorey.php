<?php
include("../config.php");

$data=json_decode(file_get_contents("php://input"));

if(isset($data->category)){
    $cat=$data->category;
    $query="SELECT DISTINCT sub_category,image FROM speakers WHERE category=".$cat;

    $raw = mysqli_query($con,$query);

    while($res=mysqli_fetch_array($raw)){
        $dat[]=$res;
    }
    print(json_encode($dat));
}

?>