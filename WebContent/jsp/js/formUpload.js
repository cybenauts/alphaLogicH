function stacking (argument) {
	if(document.getElementById("firstname").value!="" && document.getElementById("zip").value!="")
	{
		document.getElementById("formU").submit();
		
	}
}
/*	window.onload=function(){
		if(window.location.href.split("=")[1]!=undefined)
			{
			document.getElementById("formImageU").submit;
			}
		
	
}*/
	/* if(window.location.href.split("=")[1]!==){
	 	;*/

	var checkemail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
var checkname = /^[a-zA-Z ]{3,32}$/;
var checkphone = /^[2-9]{2}\d{8}$/;
var alphanum = /^[a-zA-Z0-9_-]{3,11}$/;
var checknum=/^[0-9]*$/;
var fileURL;
/*from dashboard add new client module*/
function sendData() {
    //alert("in function");
    //alert(FileTransfer!==null);
    var firstname = $("#firstname").val();
    var lastname = $("#lastname").val();
    var email = $("#email").val();
    var phone = $("#phone").val();
    var address1 = $("#address1").val();
    var address2 = $("#address2").val();
    var city = $("#city").val();
    var zip = $("#zip").val();
  
    alert(firstname+":::"+lastname+":::"+email+":::"+phone+":::"+address1+":::"+city+":::"+zip);
    if (firstname.match(checkname)) {
        if (lastname.match(checkname)) {
            if (email.match(checkemail)) {
                if (phone.match(alphanum)) {
                    if (address1.match(alphanum)) {
                        if (city.match(checkname)) {
                            if (zip.match(alphanum)) {
                                //document.getElementById('loading').style.display = 'block';
                                var xhttp = new XMLHttpRequest();
                                xhttp.onreadystatechange = function() {
                                    //alert(xhttp.responseText);
                                    if (xhttp.readyState == 4 && xhttp.status == 200) {
                                        //Trim really necessary .................................................[IMPORTANT]
                                        //alert(xhttp.responseText.trim());
                                        if (xhttp.responseText.trim()) {
                                            //uploadFile(); //image upload
                                        	//alert(document.getElementById('formImageU'));
                                           document.getElementById('formImageU').submit();
                                        } else {
                                            $("#notify").text('Invalid Entries');
                                            setTimeout(function() {
                                                $("#notify").text('Add a new customer');
                                            }, 3000);
                                        }
                                    } 
                                };

                                xhttp.open("POST", "addCustomer", true);
                                var parameters = "firstname=" + firstname + "&lastname=" + lastname + "&email=" + email + "&phone=" + phone + "&address1=" + address1 + "&address2=" + address2 + "&city=" + city + "&zip=" + zip;
                                //alert(parameters);

                                xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                                xhttp.send(parameters);
                            } else {
                                alert("Invalid Postal Code");
                                //$("[name='userContactNo']").attr('placeholder', 'Invalid');
                                $("#zip").focus();

           /*                     setTimeout(function() {
                                    $("[name='userContactNo']").attr('placeholder', 'Mobile Number');
                                }, 3000);*/
                            }

                        } else {
                            alert("Invalid City Value");
                            //$("[name='userRoomNo']").attr('placeholder', 'Invalid');
                            $("#city").focus();

                       /*     setTimeout(function() {
                                $("[name='userRoomNo']").attr('placeholder', 'Room Number');
                            }, 3000);*/
                        }
                    } else {
                        alert("Invalid Address Value");
                       /* $("[name='stex']").attr('placeholder', 'Invalid');*/
                        $("#address1").focus();

                  /*      setTimeout(function() {
                            $("[name='stex']").attr('placeholder', 'Stex');
                        }, 3000);*/
                    }
                } else {
                    alert("Invalid Phone Number");
                    //$("[name='summers']").attr('placeholder', 'Invalid');
                    $("#phone").focus();

              /*      setTimeout(function() {
                        $("[name='summers']").attr('placeholder', 'Summers');
                    }, 3000);*/
                }
            } else {
                alert("Invalid Email Address");
               // $("[name='userHometown']").attr('placeholder', 'Invalid');
                $("#email").focus();

            /*    setTimeout(function() {
                    $("[name='userHometown']").attr('placeholder', 'Home Town');
                }, 3000);*/
            }
        } else {
            alert("Invalid LastName");
            /*$("[name='userId']").attr('placeholder', 'Invalid');*/
            $("#lastname").focus();

       /*     setTimeout(function() {
                $("[name='userId']").attr('placeholder', 'User Id');
            }, 3000);*/
        }
    } else {
        alert("Invalid FirstName");
        //$("[name='userName']").attr('placeholder', 'Invalid');
        $("#firstname").focus();

  /*      setTimeout(function() {
            $("#uName").attr('placeholder', 'User Name');
        }, 3000);*/
    }
}

