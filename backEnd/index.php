<!doctype html>
<html>
    <head>
        <?php
        include("config.php");
    
        if(isset($_POST['publish'])){
            $speaker = $_POST['speaker'];
            $title = $_POST['title'];
            $category = $_POST['category'];
            $sub_category = $_POST['sub_category'];


            ######## Upload Image ########
            if($_FILES["image"]["error"] === 4){
                echo "No image selected";
            }else{
                $img_name = $_FILES['image']['name'];
                $image_size = $_FILES["image"]["size"];
                $tmp_img_name = $_FILES['image']['tmp_name'];

                $valid_image_extention = ['jpg', 'jpeg', 'png'];
                $image_extention = explode('.', $img_name);
                $image_extention = strtolower(end($image_extention));
                if(!in_array($image_extention, $valid_image_extention)){
                    echo "Invalid image extention";
                }else if($image_size > 1000000){
                    echo "Image size is too large";
                }else{
                    $newImageName = $img_name;
                    
                    move_uploaded_file($tmp_img_name, 'images/' . $newImageName);
                    $query = "INSERT INTO speaker(category, image) VALUES('".$category."','".$newImageName."')";
                    mysqli_query($con,$query);
                    echo "Image uploaded";
                }

            }
            ######## Uploading Audio ########
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
                        $query = "INSERT INTO audio(title, location, IDcategory, IDspeaker) VALUES('".$title."','".$target_file."','".$sub_category."' ,'5')";
                        $result = mysqli_query($con,$query);
                        
                        // if($result){
                        //     $IDspeaker = $con->insert_id;

                        // }
                        
                        header("Location: index.php");
                        echo "Data Insert successfully.";
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
        <label>Sub Category</label>
        <select name="sub_category">
            <option value="1">???????? ????????????</option>
            <option value="2">???????? ????????????????</option>
            <option value="3">?????????? ??????????</option>
        </select>
<br>
<br>
        <label>Upload Audio</label>
        <input type='file' name='file' />
<br>
<br>
        <label>Upload Image</label>
        <input type='file' name='image' accept=".jpg, .jpeg, .png" />

        <input type='submit' value='Publish' name='publish'>
        </form>

    </body>
</html>