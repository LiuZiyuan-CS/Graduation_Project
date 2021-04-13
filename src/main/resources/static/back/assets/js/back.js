/**
 * 
 */

$(function(){
	var rememberStaffName = $.cookie("rememberStaffName");
	if (rememberStaffName != null) {
		$('#signInForm').children('input[name=staffName]').val(rememberStaffName);
		$('#rememberStaffName').prop(
				'checked', true);
	}
	;
	
	
	$("#signInForm").validate({
		rules : {
			staffName : {
				required : true,
				maxlength : 5,
			},
			staffPassword : {
				required : true,
			},
			
		},
		messages : {
			staffName : {
				required : '请输入姓名',
				maxlength : '姓名长度不超过五个字',
			},
			staffPassword : {
				required : '请输入密码',
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
	
	
})
/*后台登录函数*/
function doLogin(){
	if($("#signInForm").valid()){
		$.post("doLogin",$("#signInForm").serialize(),function(result){
			if(result.resultCode==1){
				window.location.href = "index.html";
			}else{
				$('#loginAlert').html("<a href='#' class='close' data-dismiss='alert'>&times;</a><strong>警告！</strong>"+result.message);
				$('#loginAlert').show();
			}
		})
	}else{
		alert("请将表单信息填写完整再提交！");
	}
	
}