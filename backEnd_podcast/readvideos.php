<?php
    include("config.php");
?>
<!doctype html>
<html>
    <head>
        <style>
            video{
                float: left;
            }
        </style>
    </head>
    <body>
        <div>
          
        <?php
        $fetchVideos = mysqli_query($con, "SELECT * FROM speakers ORDER BY id DESC");
        while($row = mysqli_fetch_assoc($fetchVideos)){
            $location = $row['location'];
            
            echo "<div >";
            echo  "<audio controls>
                        <source src='".$location."' controls width='320px' height='200px' >
                    </audio> ";
            // echo "<video src='".$location."' controls width='320px' height='200px' >";
            echo "</div>";
        }
        ?>
          
        </div>

    </body>
</html>
