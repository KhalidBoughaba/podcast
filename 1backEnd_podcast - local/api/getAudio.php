<?php
include("../config.php");

$query="SELECT * FROM audio";

$raw = mysqli_query($con,$query);

while($res=mysqli_fetch_array($raw)){
    $data[]=$res;
}
print(json_encode($data));

?>