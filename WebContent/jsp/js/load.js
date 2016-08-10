window.onload=function () {
    //alert("load");
    var uploader = new qq.FileUploader({
    // pass the dom node (ex. $(selector)[0] for jQuery users)
    element: document.getElementById('file-uploader'),
    // path to server-side upload script
    action: 'imageUpload',

    // additional data to send, name-value pairs
    params: {
       // param1: document.getElementById("gId").value
    },

    // validation    
    // ex. ['jpg', 'jpeg', 'png', 'gif'] or []
    allowedExtensions: ['jpg', 'jpeg', 'png', 'gif'],        
    // each file size limit in bytes
    // this option isn't supported in all browsers
    sizeLimit: 10*1024*1024,//max size   
    minSizeLimit: 1024, // min size

    // set to true to output server response to console
    debug: true,

    messages: {
        // error messages, see qq.FileUploaderBasic for content 
        typeError: "Unfortunately the file(s) you selected weren't the type we were expecting. Only {extensions} files are allowed.",
            sizeError: "{file} is too large, maximum file size is {sizeLimit}.",
            minSizeError: "{file} is too small, minimum file size is {minSizeLimit}.",
            emptyError: "{file} is empty, please select files again without it.",
            onLeave: "The files are being uploaded, if you leave now the upload will be cancelled."           
    },


    // events         
    // you can return false to abort submit
    onSubmit: function(id, fileName){
      //  console.log(fileName.path);
        console.log('Submit');
    },
    onProgress: function(id, fileName, loaded, total){
        console.log('On Progress');
    },
    onComplete: function(id, fileName, responseJSON){
        console.log('On Complete');
        console.log(id);
        console.log(fileName);
        console.log(responseJSON);
        document.getElementById('displayImage').setAttribute('src',responseJSON.path);

    },
    onCancel: function(id, fileName){
        console.log('On Cancel');
    },
    onError: function(id, fileName, xhr){
        console.log('On Error');
    },

    showMessage: function(message){ 
        alert(message);
         }     


});  
};
