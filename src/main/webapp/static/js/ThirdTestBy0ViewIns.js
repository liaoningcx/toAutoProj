$(document).ready(function(){
	$("#btn_search").bind("click",function(){

	})
})

function insert() {
	var param = {};
	param.taTestNBA0 = $("#taTestNBA0").val();
	param.taTestNBA1 = $("#taTestNBA1").val();
	param.taTestNBA2 = $("#taTestNBA2").val();
	param.taTestNBA3 = $("#taTestNBA3").val();
	param.taTestNBA4 = $("#taTestNBA4").val();
	//jQuery.blockUI({message: "正在查询数据，请稍候..."});

	//jQuery.ajax()

	jQuery.post(
		'/insert',
		{
			'':param
		},
		function (result) {
			//jQuery.unblockUI();
			if (result.code == 200) {
				alert("成功");
			} else {
				alert("错误！" + result.message);
			}
		},
		"json"
	);
}
