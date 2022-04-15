<!doctype html>
<html>
    <head>
        <?php
        include("config.php");
    
        if(isset($_POST['but_upload'])){
            $maxsize = 10485760; // 10MB

            $name = $_FILES['file']['name'];
            $target_dir = "audios/";
            $target_file = $target_dir . $_FILES["file"]["name"];

            // Select file type
            $videoFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));

            // Valid file extensions
            $extensions_arr = array("mp3");

            // Check extension
            if( in_array($videoFileType,$extensions_arr) ){
                
                // Check file size
                if(($_FILES['file']['size'] >= $maxsize) || ($_FILES["file"]["size"] == 0)) {
                    echo "File too large. File must be less than 10MB.";
                }else{
                    // Upload
                    if(move_uploaded_file($_FILES['file']['tmp_name'],$target_file)){
                        // Insert record
                        $query = "INSERT INTO speakers(name,location) VALUES('".$name."','".$target_file."')";

                        mysqli_query($con,$query);
                        echo "Upload successfully.";
                    }
                }

            }else{
                echo "Invalid file extension.";
            }
        
        }
        
        ?>
    </head>
    <body>
        <form method="post" action="" enctype='multipart/form-data'>
        <label>speaker</label>
        <input type="text" name="speaker">
<br>
<br>
        <label>title audio</label>
        <input type="text" name="title">
<br>
<br>
        <label>category</label>
        <input type="text" name="category">
<br>
<br>

            <input type='file' name='file' />
            <input type='submit' value='Upload' name='but_upload'>
        </form>

    </body>
</html>
