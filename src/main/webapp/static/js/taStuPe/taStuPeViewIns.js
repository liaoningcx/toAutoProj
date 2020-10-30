$(document).ready(function(){
	$("#btn_search").bind("click",function(){

	})
})

function insertTaStuPe() {
	var param = {};
	param.TaTestNBA0 = $("#TaTestNBA0").val();
	param.TaTestNBA1 = $("#TaTestNBA1").val();
	param.TaTestNBA2 = $("#TaTestNBA2").val();
	param.TaTestNBA3 = $("#TaTestNBA3").val();
	param.TaTestNBA4 = $("#TaTestNBA4").val();
	//jQuery.blockUI({message: "正在查询数据，请稍候..."});

	//jQuery.ajax()

	jQuery.post(
		'/insertTaStuPe',
		{
			'taStuPe':param
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
