$(document).ready(function () {
    $('#btn_sub').on('click',function () {
        var data = {};
        $.each($('#form_sub').serializeArray(),function(index, o){
            data[o.name] = o.value;
        });

        $.ajax({
            url:$('#url').val(),
            type:"post",
            dataType: "json",
            contentType: "application/json",
            data : JSON.stringify(data),
            success : function (res) {
                console.log(res);
            }
        });
    });
});