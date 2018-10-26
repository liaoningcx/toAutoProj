//当前页
var currentPage = 1;

$(document).ready(function(){
    var query = {};
    query.taTestNBA0 = "123456";
    $.ajax({
        type: "POST", //提交数据的类型 分为POST和GET
        async: false,
        // url: "/thirdTestBy0/queryThirdTestBy0",  //提交url 注意url必须小写
        url: "/thirdTestBy0/testEasyuidg",  //提交url 注意url必须小写
        data: query,
        success: function (data) {
            var resultData = JSON.parse(data);//转换成json对象
            $('#dgData').datagrid('loadData', resultData);
        }
    });
})

function clearUpdateForm(){

}
function saveUpdateForm(){

}
function saveInsForm(){

}
function resetInsForm(){

}