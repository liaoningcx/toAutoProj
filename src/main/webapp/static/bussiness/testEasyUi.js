//当前页
var currentPage = 1;

$(document).ready(function(){
    var data = "{'total':28,'rows':[{'productid':'FI-SW-01','productname':'Koi','unitcost':10.00,'status':'P','listprice':36.50,'attr1':'Large','itemid':'EST-1'},    {'productid':'K9-DL-01','productname':'Dalmation','unitcost':12.00,'status':'P','listprice':18.50,'attr1':'Spotted Adult Female','itemid':'EST-10'},	{'productid':'RP-SN-01','productname':'Rattlesnake','unitcost':12.00,'status':'P','listprice':38.50,'attr1':'Venomless','itemid':'EST-11'},	{'productid':'RP-SN-01','productname':'Rattlesnake','unitcost':12.00,'status':'P','listprice':26.50,'attr1':'Rattleless','itemid':'EST-12'},	{'productid':'RP-LI-02','productname':'Iguana','unitcost':12.00,'status':'P','listprice':35.50,'attr1':'Green Adult','itemid':'EST-13'},	{'productid':'FL-DSH-01','productname':'Manx','unitcost':12.00,'status':'P','listprice':158.50,'attr1':'Tailless','itemid':'EST-14'},	{'productid':'FL-DSH-01','productname':'Manx','unitcost':12.00,'status':'P','listprice':83.50,'attr1':'With tail','itemid':'EST-15'},	{'productid':'FL-DLH-02','productname':'Persian','unitcost':12.00,'status':'P','listprice':23.50,'attr1':'Adult Female','itemid':'EST-16'},	{'productid':'FL-DLH-02','productname':'Persian','unitcost':12.00,'status':'P','listprice':89.50,'attr1':'Adult Male','itemid':'EST-17'},	{'productid':'AV-CB-01','productname':'Amazon Parrot','unitcost':92.00,'status':'P','listprice':63.50,'attr1':'Adult Male','itemid':'EST-18'}]}";

    // $("#dgData").datagrid({
    //     url:'/thirdTestBy0/testEasyuidg',
    //     columns:[
    //         [
    //             {field:'productid',title:'产品编号',width:'300px'},
    //             {field:'productname',title:'产品名称',width:'300px'},
    //             {field:'unitcost',title:'花费',width:'300px'},
    //         ]
    //     ]
    // })
    // $("#dgData").datagrid("reload");
    var query = {};
    query.taTestNBA0 = "123456";
    $.ajax({
        type: "POST", //提交数据的类型 分为POST和GET
        async: false,
        url: "/thirdTestBy0/queryThirdTestBy0",  //提交url 注意url必须小写
        data: query,
        success: function (data) {
            var jsondata = eval(data);
            //var jsData = (new Function("", "return " + data))();
            var resultData = jsondata.data;
            $('#dg').datagrid('loadData', resultData);
        }
    });

})
//清除上次数据
function clearData() {
    $("#dgData").html('');
}
