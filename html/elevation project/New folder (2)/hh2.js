function abc(){
    var retVal=confirm("Do you want to continue?");
        if(retVal==true){
            document,Write("user wants to continue!");
            returntrue;
        }
        else{
            document.write("user does not want to continue!");
            return false;
        }
}
