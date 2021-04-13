/**
 * Sign-in 自定义js函数
 */
$(function() {
	var remeberUsername = $.cookie("remeberUsername");
	if (remeberUsername != null) {
		$('#signInForm').children('input[name=userName]').val(remeberUsername);
		$('#signInForm').children('input[name=rememberUsername]').prop(
				'checked', true);
	}
	;

	$("#signInForm").validate({
		rules : {
			userName : {
				required : true,
				maxlength : 5,
			},
		},
		messages : {
			userName : {
				required : '请输入姓名',
				maxlength : '姓名长度不超过五个字',
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
	/**
	 * 注册表单验证
	 */
	$("#signUpForm").validate({
		rules : {
			userName : {
				required : true,
				maxlength : 5,
			},
			userTelephone : {
				required : true,
				digits : true,
				minlength : 11,
			},
			userIdcard : {
				required : true,
				minlength : 18,
				maxlength : 18,
			},
			userEmail : {
				required : true,
				email : true,
			},
			userPassword : {
				required : true,
			},
			confirmPassword : {
				required : true,
				equalTo : "#signUpPwd",
			}
		},
		messages : {
			userName : {
				required : '请输入姓名',
				maxlength : '姓名长度不超过五个字',
			},
			userTelephone : {
				required : '请输入联系电话',
				digits : '请勿输入数字以外的字符',
				minlength : '请输入正确的联系方式',
			},
			userIdcard : {
				required : '请输入身份证号码',
				minlength : '请输入18位的身份证号码',
				maxlength : '请输入18位的身份证号码',
			},
			userEmail : {
				required : '请输入邮箱地址',
				email : '请输入正确的邮箱地址',
			},
			userPassword : {
				required : '请输入密码',
			},
			confirmPassword : {
				required : '请再次输入密码',
				equalTo : '两次密码输入不一致',
			}
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
	/**
	 * 重置密码表单验证
	 */
	$("#resetPasswordForm").validate({
		rules : {
			userName : {
				required : true,
				maxlength : 5,
			},
			userEmail:{
				required: true,
				email: true,
			},
			verificationCode:{
				required:true,
			},
			userPassword : {
				required : true,
			},
			confirmPassword : {
				required : true,
				equalTo : "#resetPwd",
			},
		},
		messages : {
			userName : {
				required : '请输入姓名',
				maxlength : '姓名长度不超过五个字',
			},
			userEmail:{
				required: '请输入邮箱',
				email: '请输入正确的邮箱格式',
			},
			verificationCode:{
				required:'请输入您收到的验证码',
			},
			userPassword : {
				required : '请输入新密码',
			},
			confirmPassword : {
				required : '请再次输入密码',
				equalTo : "两次密码输入不一致",
			}
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});

})
/** 登录操作函数，回调result对象* */
function signIn() {
	$.post('dologin', $('#signInForm').serialize(), function(result) {
		if (result.resultCode == 1) {
			window.location.href = "index.html";
		} else if (result.resultCode == 0) {
			alert(result.message);
			// $("#alertDiv").css({"display":"block"});
			// $("#alertDiv").html(result.message);
		}
	})
}
/** 注册操作函数，回调result **/
function signUp() {
	if($("#signUpForm").valid()){
		$.post("doreg", $("#signUpForm").serialize(), function(result) {
			if (result.resultCode == 1) {
				alert("成功")
				/*
				 * var dialogInfo = bootbox.dialog({ message: '<p class="text-center mb-0"><i
				 * class="fa fa-spin fa-cog"></i>'+result.message+'</p>',
				 * closeButton: false }); setTimeout(function(){
				 * dialogInfo.modal('hide'); },1200);
				 * $("#roomTypeTable").bootstrapTable('refresh');
				 */
			} else {
				alert("失败")
				/*
				 * var dialogInfo = bootbox.dialog({ message: '<p class="text-center mb-0"><i
				 * class="fa fa-spin fa-cog"></i>'+result.message+'</p>',
				 * closeButton: false }); setTimeout(function(){
				 * dialogInfo.modal('hide'); },1200);
				 */
			}
		});
	}else{
		alert("请将表单信息填写完整再提交！");
	}
}
//请求发送验证码
function sendVerificationCode() {
	var userName = $("#resetPasswordForm>input[name='userName']").val();
	var userEmail = $("#resetPasswordForm>input[name='userEmail']").val();
	if(userName!=null&&userEmail!=null){
		$.post("sendVerificationCode", {
			userName : userName,
			userEmail : userEmail,
		}, function(result) {
			if (result.resultCode == 1) {
				if (result.resultCode == 1) {
					alert(result.message);
				}
				if (result.resultCode == 2) {
					alert(result.message);
				}
				if (result.resultCode == 0) {
					alert(result.message);
				}
			}
		})
	}else{
		alert("用户姓名和邮箱地址不能为空");
	}
	
}
//重置密码
function resetPassword() {
	if($("#resetPasswordForm").valid()){
		
		$.post("resetPassword", $("#resetPasswordForm").serialize(), function(
				result) {
			if (result.resultCode == 1) {
				alert(result.message);
				setTimeout("location.href = 'signIn.html'", 3000);// 3000毫秒后跳转
			}
			if (result.resultCode == 0) {
				alert(result.message);
			}
		})
		
	}else{
		alert("请将表单信息填写完整再提交！");
	}
	
}

/*$("#username").change(function() {
	var userName = signUpForm['username'].value;
	$.post("doname", {
		name : userName
	}, function(result) {
		if (result.resultCode == 1) {
			$("#username").css("color", "green");
		} else {
			$("#username").css("color", "red");
			
			 * var dialogInfo = bootbox.dialog({ message: '<p class="text-center mb-0"><i
			 * class="fa fa-spin fa-cog"></i>'+result.message+'</p>',
			 * closeButton: false }); setTimeout(function(){
			 * dialogInfo.modal('hide'); },1200);
			 
			$("#username").val("");
		}
	})
});*/

