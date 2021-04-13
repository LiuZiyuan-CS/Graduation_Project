/**
 * 
 */
	$("[data-toggle='wechat_popover']")
			.popover(
					{
						animation : true,// 淡入淡出
						html : true,// content中插入html代码
						container : "body",
						content : "<img src=\"/front/assets/images/social_QRcode/Wechat.jpg\" style='height:30%;width:100%'>",// 插入图片的路径
																																// 及 样式
					});
	$("[data-toggle='weibo_popover']")
			.popover(
					{
						animation : true,// 淡入淡出
						html : true,// content中插入html代码
						container : "body",
						content : "<img src=\"/front/assets/images/social_QRcode/Weibo.jpg\" style='height:30%;width:100%'>",// 插入图片的路径
																																// 及 样式
					});
	$("#roomDetailCheckInForm").validate({
		rules : {
			checkInDate : {
				dateISO: true,
			},
			checkOutDate : {
				dateISO:true,
			},
			adultNum : {
				required : true,
			},
			childNum : {
				required : true,
			},
		},
		messages : {
			checkInDate : {
				dateISO : '请输入入住时间',
			},
			checkOutDate : {
				dateISO : '请输入退房时间',
			},
			checkOutDate : {
				required : '请输入入住成人人数',
			},
			checkOutDate : {
				required : '请输入入住儿童人数',
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
/*
 * 打开头像上传框
 */
function uploadProfile() {
	$("#profile-icon").trigger('click');
}
/*
 * 头像上传
 */
$('#profile-icon').fileupload({
	dataType : 'json',
	url : "userProfileUpload",// 文件的后台接受地址
	// 上传完成之后的操作，显示在img里面
	done : function(e, result) {
		console.log(result);
		if (result.result.resultCode == 1) {
			$("#profileImg").attr({
				src : result.result.data
			});
		} else {
			alert(result.result.message)
		}
	}
})

function checkAvailableRoomInIndexPage() {
	$.post("checkAvailableRoom", $("#checkInForm").serialize(),
			function(result) {

			})
}

function checkAvailableRoomInRoomDetailPage(){
	$.post("checkAvailableRoomInRoomDetailPage",$("#roomDetailCheckInForm").serialize(),function(result){
		
	})
}
