window.onscroll = function() {myFunction()};

var header = document.getElementById("myHeader");
var sticky = header.offsetTop;

function myFunction() {
  if (window.pageYOffset > sticky) {
    header.classList.add("sticky");
  } else {
    header.classList.remove("sticky");
  }
}
function my(){
  var x=document.getElementById("pr").value;
  var y=document.getElementById("rt").value;
  var z=document.getElementById("rn").value;
  var a=document.getElementById("rd").value;
  var b=document.getElementById("prm").value;
  var c=document.getElementById("of").value;
  var d=document.getElementById("sample").value;
  $('#valid').empty();
 $('#valid').append('<p>'+"product"+":"+'<span>'+x+'</span></p>'+
 '<p>'+"ReportType"+":"+'<span>'+y+'</span></p>'+
 '<p>'+"ReportName"+":"+'<span>'+z+'</span></p>' +
 '<p>'+"ReportDescription"+":"+'<span>'+a+'</span></p>'+
 '<p>'+"Permission"+":"+'<span>'+b+'</span></p>'+
 '<p>'+"OutputFolder"+":"+'<span>'+c+'</span></p>'+
 '<p>'+"sample"+":"+'<span>'+d+'</span></p>'
 );
   
   }
   function  daterange(){
    var startdate=document.getElementById("sdate").value;
    var enddate=document.getElementById("edate").value;
    var dayweek=document.getElementById("week").value;
    $('#valid1').empty();
   $('#valid1').append('<p>'+"StartDate"+":"+'<span>'+startdate+'</span></p>'+
                        '<p>'+"EndDate"+":"+'<span>'+enddate+'</span></p>'+
                        '<p>'+"DayofWeek"+":"+'<span>'+dayweek+'</span></p>'
   
   );
   }
   function demograph(){
    $('#valid2').empty();
    var sage=document.getElementById("sa").value;
    var eage=document.getElementById("ea").value

    var d=["HHLD","P","M","F","W"];
    var demograph=document.forms["myform"];
    for (var i = 0; i <  demograph.length; i++) {
     if (demograph[i].checked) {
       if(demograph[i].value=="Households"){
        $('#valid2').append('<p>'+"HHLD"+":"+'<span>'+demograph[i].value+'</span></p>');
       }
       else{
       $('#valid2').append('<p>'+d[i]+sage+"-"+eage+":"+'<span>'+demograph[i].value+'</span></p>');
       }
     }
    
   }
   }
 function prosel(){
        var o=document.getElementById("org").value;
        var p=document.getElementById("program").value;
       var g=document.getElementById("gener").value;
       var gd=document.getElementById("generd").value;
       $('#valid4').empty();
   $('#valid4').append('<p>'+"Originator"+":"+'<span>'+o+'</span></p>'+
   '<p>'+"Program"+":"+'<span>'+p+'</span></p>'+
   '<p>'+"Gener"+":"+'<span>'+g+'</span></p>'+
   '<p>'+"GenerDetails"+":"+'<span>'+gd+'</span></p>'
   );
        }
function metrics(){
  $('#valid5').empty();
  var met =document.forms["metrics"];
  console.log("inside metrics")
  for (var i = 0; i < met.length; i++) {
    if (met[i].checked){
      console.log("inside if")
     $("#valid5").append('<p>'+met[i].name+": "+'<span>'+met[i].value+'</span></p>');

    }
  }
}

function prdetails(){
  var ab=document.getElementById("td").value;
  var bc=document.getElementById("ts").value;
  var cd=document.getElementById("te").value;
  var ef=document.getElementById("nt").value;
  $('#valid6').empty();
  $('#valid6').append('<p>'+"TotalDuration"+":"+'<span>'+ab+'</span></p>'+
  '<p>'+"TelecastStartTime"+":"+'<span>'+bc+'</span></p>'+
  '<p>'+"TelecastEndTime"+":"+'<span>'+cd+'</span></p>'+
  '<p>'+"# of Telecast"+":"+'<span>'+ef+'</span></p>'
  );
}
function reportop(){
  $('#valid7').empty();
  var ReportOP=document.forms["report"];
    for (var i = 0; i <  ReportOP.length; i++) {
     if (ReportOP[i].checked) {
      $('#valid7').append('<p>'+'<span>'+ReportOP[i].value+'</span></p>');
     }
    
   }
}
function test(){
  var x=document.getElementById('org').value;
  var CNN=["NEW DAY","CNN NEWSROOM","INSIDE POLITICS","CNN RIGHT NOW","SITUATION ROOM","CNN TONIGHT","CNN NEWSROOM LIVE","EARLY START","AT THIS HOUR",             
      "LEAD WITH JAKE TAPPER" ,"ERIN BURNETT OUTFRONT",  "ANDERSON COOPER 360",  "SPORTSCENTER LATE "    
         ];
 var ESPN=["FIRST TAKE   L" , "BASEBALL RAIN D ELAY    L ","MLB WEEKDAY-AFTERNOON   L","MLB HOLIDAY L ","COLL FTBL COUNTDOWN L","SPORTSCENTER 12AM  L ","SPORTSCENTER 1AM  L",
         "MLB REGULAR SEASON REPEAT","SPORTSCENTER MORNING "];
         var NFLN=[" GOOD MORNING FOOTBALL", "NFL NOW","FULL GAME BROADCAST","SUPER BOWL CLASSICS","NFL FANTASY LIVE  ","NFL TOTAL ACCESS ","TENNIS: US OPEN AFT   L",
         "SPORTSCENTER EARLY  L","TENNIS: US OPEN PRIME  L"];

         var CNBC=["SQUAWK BOX","SQUAWK ON THE STREET ","SQUAWK ALLEY ","FAST MONEY HALFTIME RPRT ","POWER LUNCH " ,"CLOSING BELL" ,"FAST MONEY  ","MAD MONEY" ,"HIGH RISK REWARD CANNABIS",
         "JAY LENOS GARAGE "                  ];

         if(x==="CNN"){
          $('.multiselect').empty();
          console.log("inside if condition")
           for(var i=0;i<CNN.length;i++){
            $('.multiselect').append('<label><input type="checkbox" name="option[]" value="'+CNN[i]+'">'+CNN[i]+'</label>');
            $('.multiselect').trigger("chosen:updated");
           }
          }
          else if(x==="ESPN"){
            $('.multiselect').empty();
            for(var i=0;i<ESPN.length;i++){
              $('.multiselect').append('<label><input type="checkbox" name="option[]" value="'+ESPN[i]+'">'+ESPN[i]+'</label>');
              $('.multiselect').trigger("chosen:updated");
             }
          }
          else if(x==="NFLN"){
            $('.multiselect').empty();
            for(var i=0;i<NFLN.length;i++){
              $('.multiselect').append('<label><input type="checkbox" name="option[]" value="'+NFLN[i]+'">'+NFLN[i]+'</label>');
              $('.multiselect').trigger("chosen:updated");
             }
          }
          else if(x==="CNBC"){
            $('.multiselect').empty();
            for(var i=0;i<CNBC.length;i++){
              $('.multiselect').append('<label><input type="checkbox" name="option[]" value="'+CNBC[i]+'">'+CNBC[i]+'</label>');
              $('.multiselect').trigger("chosen:updated");
             }
          }
}

      function mychange(){
        var x=document.getElementById('org').value;
        var CNN=["NEW DAY","CNN NEWSROOM","INSIDE POLITICS","CNN RIGHT NOW","SITUATION ROOM","CNN TONIGHT","CNN NEWSROOM LIVE","EARLY START","AT THIS HOUR",             
            "LEAD WITH JAKE TAPPER" ,"ERIN BURNETT OUTFRONT",  "ANDERSON COOPER 360",  "SPORTSCENTER LATE "    
               ];
        var ESPN=["FIRST TAKE   L" , "BASEBALL RAIN D ELAY    L ","MLB WEEKDAY-AFTERNOON   L","MLB HOLIDAY L ","COLL FTBL COUNTDOWN L","SPORTSCENTER 12AM  L ","SPORTSCENTER 1AM  L",
                      "MLB REGULAR SEASON REPEAT","SPORTSCENTER MORNING "];
          var NFLN=[" GOOD MORNING FOOTBALL", "NFL NOW","FULL GAME BROADCAST","SUPER BOWL CLASSICS","NFL FANTASY LIVE  ","NFL TOTAL ACCESS ","TENNIS: US OPEN AFT   L",
      "SPORTSCENTER EARLY  L","TENNIS: US OPEN PRIME  L"];
        var CNBC=["SQUAWK BOX","SQUAWK ON THE STREET ","SQUAWK ALLEY ","FAST MONEY HALFTIME RPRT ","POWER LUNCH " ,"CLOSING BELL" ,"FAST MONEY  ","MAD MONEY" ,"HIGH RISK REWARD CANNABIS",
      "JAY LENOS GARAGE " ];
         if(x==="CNN"){
          console.log("inside if condition")
           for(var i=0;i<CNN.length;i++){
            $('#program').append('<option value="'+CNN[i]+'" id="'+CNN[i]+'">'+CNN[i]+'</option>');
            $('#program').trigger("chosen:updated");
           }
          }
          else if(x==="ESPN"){
            console.log("inside else if")
                for(var i=0;i<ESPN.length;i++){
            $('#program').append('<option value="'+ESPN[i]+'" id="'+ESPN[i]+'">'+ESPN[i]+'</option>');
            $('#program').trigger("chosen:updated");
           }
          }
          else if(x==="NFLN"){
            console.log("inside else if")
                for(var i=0;i<NFLN.length;i++){
            $('#program').append('<option value="'+NFLN[i]+'" id="'+NFLN[i]+'">'+NFLN[i]+'</option>');
            $('#program').trigger("chosen:updated");
           }
          }
          else if(x==="CNBC"){
            console.log("inside else if")
                for(var i=0;i<CNBC.length;i++){
            $('#program').append('<option value="'+CNBC[i]+'" id="'+CNBC[i]+'">'+CNBC[i]+'</option>');
            $('#program').trigger("chosen:updated");
           }
          }
          $('#program').empty();
        }
function myage(){
  var arr=[5,8,11,14,20,25,30,35,40,45,50,55,65,70,75]
  var no=document.getElementById("sa").value;
  var num=parseInt(no);
  for(var i=0;i<arr.length;i++){
    while(num<arr[i]){
      $('#ea').append('<option value="'+String(arr[i])+'" id="'+String(arr[i])+'">'+arr[i]+'</option>');
      $('#ea').trigger("chosen:updated");
    }
  }
}
jQuery.fn.multiselect = function() {
  $(this).each(function() {
      var checkboxes = $(this).find("input:checkbox");
      checkboxes.each(function() {
          var checkbox = $(this);
          // Highlight pre-selected checkboxes
          if (checkbox.prop("checked"))
              checkbox.parent().addClass("multiselect-on");

          // Highlight checkboxes that the user selects
          checkbox.click(function() {
              if (checkbox.prop("checked"))
                  checkbox.parent().addClass("multiselect-on");
              else
                  checkbox.parent().removeClass("multiselect-on");
          });
      });
  });
};
$(function() {
  $(".multiselect").multiselect();
});
function test2(){ 
  $('#valid4').empty();
  var o=document.getElementById("org").value;
  var g=document.getElementById("gener").value;
  var gd=document.getElementById("generd").value;
  var ps =document.forms["psel"];
  $("#valid4").append('<p>'+"Originator :"+'<span>'+o+'</span></p>');
  $("#valid4").append('<p>'+"Program:"+"</p>");
  console.log("inside metrics")
  for (var i = 0; i < psel.length; i++) {
    if (psel[i].checked){
      console.log("inside if")
     $("#valid4").append('<p>'+'<span style="margin-left: 55px">'+psel[i].value+'</span></p>');
    }
  }
  $("#valid4").append('<p>'+"Gener :"+'<span>'+g+'</span></p>');
  $("#valid4").append('<p>'+"Gender Details :"+'<span>'+gd+'</span></p>');
}