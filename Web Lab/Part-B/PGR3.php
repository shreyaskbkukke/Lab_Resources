<html>
    <body>
        <?php
            //array with same key-values occures once and other keys-values appended
            $array1 = array("first"=> "one","second"=>"two","third"=>"three");
            $array2 = array("first"=> "one",2 =>"ten",3 =>"three");
            echo "array 1 is"."<br/>";
            foreach ($array1 as $key => $value) 
            {
                echo "key=" . $key. ", value=" . $value;
                echo "<br><br>";
            }
            echo "array2 is" . "<br/>";
            foreach ($array2 as $key => $value) 
            {
                echo "key=" . $key .", value=" . $value;
                echo "<br><br>";
                
            }
            $mrarray = $array1 + $array2;
            //it also works
            //$mrarray = array_merge($array1,$array2);
            echo "content of newfile.txt is <br><br>";
            $myfile = fopen("newfile.txt", "w") or die("Unable to open file!");
            foreach ($mrarray as $key => $value) 
            {
                fwrite($myfile, $value);
                fwrite($myfile, "<br>");
            }
            fclose($myfile);
            $myfile1 = fopen("newfile.txt", "r") or die("Unable to open file!");
            echo fread($myfile1, filesize("newfile.txt"));
            fclose($myfile1);
        ?>
    </body>
</html>
            