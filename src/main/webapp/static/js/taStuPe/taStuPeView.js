//当前页
var currentPage = 1;

$(document).ready(function(){
    $("#btn_search").bind("click",function(){
        var val = "qerw";
        alert("查询开始！");
        toQuery(val);
    })
})

function toQuery(po) {
    clearData();
    //jQuery.blockUI({message: "正在查询数据，请稍候..."});
    jQuery.post(
        '/findTaStuPe',
        {
            'po': po
        },
        function (result) {
            //jQuery.unblockUI();
            if (result.code == 200) {
                showPageInfo(result.data);
            } else {
                alert("错误！" + result.message);
            }
        }
    );
}


//清除上次数据
function clearData() {
    $("#tbodyGrid").html("");
}

function showPageInfo(pageInfo) {
    if(pageInfo == null||pageInfo.result==null||pageInfo.result.length==0){
        alert("查询为空！")
        return;
        }
    showDateArray(pageInfo.result);
    PageBar.fillHtml("gotoCurrentPage", "pageDiv", pageInfo);//填充分页框
}

function delTaStuPe(id){
    jQuery.post(
        '/delTaStuPe',
        {
            'VID': id
        },
        function (result) {
            //jQuery.unblockUI();
            if (result.code == 200) {
                alert("成功！")
            } else {
                alert("错误！" + result.message);
            }
        }
    );
}

function showDateArray(dataArray) {
    for(var i=0 ;i<dataArray.length;i++){
        var str = "<tr id=" + dataArray[i].VID + ">";
            str += "<td align='center'><a href='showModTaStuPeView?id="+dataArray[i].VID+"'>修改</a>"+"<a href='#' onclick='delTaStuPe("+dataArray[i].VID+")'>删除</a>"+"</td>";
                    str += "<td>" + dataArray[i].TaTestNBA0 + "</td>";
                    str += "<td>" + dataArray[i].TaTestNBA1 + "</td>";
                    str += "<td>" + dataArray[i].TaTestNBA2 + "</td>";
                    str += "<td>" + dataArray[i].TaTestNBA3 + "</td>";
                    str += "<td>" + dataArray[i].TaTestNBA4 + "</td>";
                    str += "<td style='display: none;'>" + dataArray[i].VID + "</td>";
            str += "</tr>";
        $("#tbodyGrid").append(str);
    }
}