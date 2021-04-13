/**
 * 
 */
$("#staffSignUpForm").validate({
		rules : {
			staffName : {
				required:true,
				maxlength:5,
			},
			staffIdcard : {
				required : true,
				rangelength:[18,18],
				digits:true,
			},
			staffTelephone : {
				required : true,
				digits:true,
			},
			staffEmail : {
				required : true,
				email : true,
			},
		},
		messages : {
			staffName : {
				required:"请填写员工姓名",
				maxlength:"姓名最长不得超过5个字",
			},
			staffIdcard : {
				required : "请填写身份证号码",
				rangelength:"请填写正确的18位身份证号",
				digits:"请勿填写除数字以外的字符",
			},
			staffTelephone : {
				required : "请填写联系方式",
				digits:"请勿填写除数字以外的字符",
			},
			staffEmail : {
				required : "请填写员工邮箱地址",
				email : "请输入正确的邮箱格式",
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
		function insertStaff(){
			$.post("insertStaff",$('#staffSignUpForm').serialize(),function(result){
				if(result.resultCode=1){
					alert(result.message);
				}else{
					alert(result.message);
				}
			})
		}