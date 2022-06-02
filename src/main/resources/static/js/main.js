alert("hello");

$.ajax({
    url: "getdata",
    success: function(re) {
        alert("통신확인됨" + re);
        $("#divBox").html("통신확인됨" + re);
    }
})