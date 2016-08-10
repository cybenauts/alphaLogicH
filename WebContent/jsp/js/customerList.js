window.onload=function(){
	showResult();
}

    function showResult() {
        //alert("show r");
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            //alert(xmlhttp.responseText);
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                var response = JSON.parse(xmlhttp.responseText);
                alert(response['1'].cId);
                alert(Object.keys(response).length);
            	setList(response);
                // var c = JSON.parse(localStorage.getItem("search"));
                // alert(c[1] + ":::" + c.length);
            }
        };
        xmlhttp.open("GET", "http://localhost:8080/AlphaLogicAdmin/fillCustomer", true);
        xmlhttp.send();
    
}

function setList(res) {
    console.log("in setList:"+res.cLastName);
    var ls = document.getElementById("list");
    var dropList;
    var data1;
    var data2;
    var data3;
    var data4;
    var text1;
    var text2;
    var text3;
    var text4;

        for (var i = 0; i < Object.keys(res).length; i++) {
            //console.log(c[i][0]+":::"+c[i][1]+" "+str);
                dropList = document.createElement("tr");
                dropList.className = "gradeA";
                ls.appendChild(dropList);
                data1 = document.createElement("td");
               text1= document.createTextNode(res[i].cId);
               data1.appendChild(text1);
               dropList.appendChild(data1);

               data2=document.createElement("td");
               text2=document.createTextNode(res[i].cFirstName);
               data2.appendChild(text2);
               dropList.appendChild(data2);

               data3=document.createElement("td");
               text3=document.createTextNode(res[i].cLastName);
               data3.appendChild(text3);
               dropList.appendChild(data3);

               data4=document.createElement("td");
               text4=document.createTextNode(res[i].cEmail);
               data4.appendChild(text4);
               dropList.appendChild(data4);     
               $('#datatable1').DataTable({
           		"dom": 'lCfrtip',
           		"order": [],
           		"colVis": {
           			"buttonText": "Columns",
           			"overlayFade": 0,
           			"align": "right"
           		},
           		"language": {
           			"lengthMenu": '_MENU_ entries per page',
           			"search": '<i class="fa fa-search"></i>',
           			"paginate": {
           				"previous": '<i class="fa fa-angle-left"></i>',
           				"next": '<i class="fa fa-angle-right"></i>'
           			}
           		}
           	});

           	$('#datatable1 tbody').on('click', 'tr', function() {
           		$(this).toggleClass('selected');
           	});
        }
        // alert(c[1] + ":::" + c.length);
    }
  /*  $(".tr").click(function(event) {
       $(this).css({
            'opacity': '0.9'
        });
        var id=this.childNodes[0].childNodes[0].innerHTML;
        //var id=wh.split(":")[0];
       //alert(id);
       window.location.href="studentprofile.html?pId="+id;
    });*/
