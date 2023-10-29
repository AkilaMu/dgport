document.getElementById('download-btn').addEventListener('click',function(){
    var link=document.createElement('a');
    link.href='https://www.w3schools.com/images/myw3schoolsimage.jpg';
    link.download='myImage.jpg';
    link.click();
});