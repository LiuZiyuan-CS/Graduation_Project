//打开修改房型信息模态框
   	function updateRoomType(roomType){
   		//模态框内每一个input框value的设置
   		$("#roomTypeNumber").val(roomType.roomTypeNumber);
   		$("#roomTypeName").val(roomType.roomTypeName);
   		$("#roomTypePrice").val(roomType.roomTypePrice);
   		$("#roomTypeSize").val(roomType.roomTypeSize);
   		$('#roomTypeAdult').val(roomType.roomTypeAdult);
   		$('#roomTypeChild').val(roomType.roomTypeChild);
   		$('#roomTypeIntrodution').val(roomType.roomTypeIntrodution);
   		//每一个input框添加readonly属性
   		$("#roomTypeName").attr("readonly", "readonly");
   		$("#roomTypePrice").attr("readonly", "readonly");
   		$("#roomTypeSize").attr("readonly", "readonly");
   		$("#roomTypeAdult").attr("readonly", "readonly");
   		$("#roomTypeChild").attr("readonly", "readonly");
   		$("#roomTypeIntrodution").attr("readonly", "readonly");
   		$('#roomTypeUpdateBtn').attr("disabled", "disabled")
   		//显示房型信息模态框
   		$('#roomTypeModal').modal('show');
   	}
   	/*选中checkbox打开对应房型模态框input框的修改权限*/
   	function modify(checkbox,str){
   		if ( checkbox.checked == true){
   		 	switch(str){
   		 		case "roomTypeName":
   		 			$("#roomTypeName").removeAttr("readonly");
   		 			$("#roomTypeName").focus();
   					$("#roomTypeName").select();
   		 			break;
   		 		case "roomTypePrice":
   		 			$("#roomTypePrice").removeAttr("readonly");
		 			$("#roomTypePrice").focus();
					$("#roomTypePrice").select();
		 			break;
   		 		case "roomTypeSize":
   		 			$("#roomTypeSize").removeAttr("readonly");
		 			$("#roomTypeSize").focus();
					$("#roomTypeSize").select();
	 				break;
   				case "roomTypeAdult":
   					$("#roomTypeAdult").removeAttr("readonly");
   		 			$("#roomTypeAdult").focus();
   					$("#roomTypeAdult").select();
		 			break;
   				case "roomTypeChild":
   					$("#roomTypeChild").removeAttr("readonly");
   		 			$("#roomTypeChild").focus();
   					$("#roomTypeChild").select();
		 			break;
   				case "roomTypeIntrodution":
   					$("#roomTypeIntrodution").removeAttr("readonly");
   		 			$("#roomTypeIntrodution").focus();
   					$("#roomTypeIntrodution").select();
		 			break;
   				case "facilityServiceBedType":
   					$("#facilityServiceBedType").removeAttr("readonly");
   		 			$("#facilityServiceBedType").focus();
   					$("#facilityServiceBedType").select();
		 			break;
   				case "facilityServiceBedNumber":
   					$("#facilityServiceBedNumber").removeAttr("readonly");
   		 			$("#facilityServiceBedNumber").focus();
   					$("#facilityServiceBedNumber").select();
		 			break;	
		 			
   		 	}
   		}else{
   			//取消checked 则input框重新设置为readonly
   			switch(str){
		 		case "roomTypeName":
		 			$("#roomTypeName").attr("readonly", "readonly");
		 			break;
		 		case "roomTypePrice":
		 			$("#roomTypePrice").attr("readonly", "readonly");
		 			break;
		 		case "roomTypeSize":
		 			$("#roomTypeSize").attr("readonly", "readonly");
	 				break;
				case "roomTypeAdult":
					$("#roomTypeAdult").attr("readonly", "readonly");
		 			break;
				case "roomTypeChild":
					$("#roomTypeChild").attr("readonly", "readonly");
		 			break;
				case "roomTypeIntrodution":
					$("#roomTypeIntrodution").attr("readonly", "readonly");
		 			break;
				case "facilityServiceBedType":
					$("#roomTypeIntrodution").attr("readonly", "readonly");
		 			break;
				case "facilityServiceBedNumber":
					$("#roomTypeIntrodution").attr("readonly", "readonly");
		 			break;
		 	}
   		}
   	}
   	/*房型模态框和房型服务模态框中的input内容修改后，提交按钮可以使用*/
   	$("#roomTypeName").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#roomTypePrice").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#roomTypeSize").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#roomTypeAdult").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#roomTypeChild").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#roomTypeIntrodution").change(function() {
   		$("#roomTypeUpdateBtn").removeAttr("disabled");
   	});
   	$("#facilityServiceBedType").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("#facilityServiceBedNumber").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("input[name=facilityServiceWifi]").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("input[name=facilityServiceRoomService]").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("input[name=facilityServiceBreakfast]").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("input[name=facilityServiceLaundry]").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	$("input[name=facilityServiceTransferService]").change(function() {
   		$("#facilityServiceUpdateBtn").removeAttr("disabled");
   	});
   	/*/房型模态框和房型服务模态框中的input内容修改后，提交按钮可以使用*/
   	
   	/*房型模态框中的form表单验证规则*/
   	$("#roomTypeForm").validate({
		rules : {
			roomTypeName : {
				required : true,
			},
			roomTypePrice : {
				required : true,
				digits:true,
			},
			roomTypeSize : {
				required : true,
				digits:true,
			},
			roomTypeAdult : {
				required : true,
				digits:true,
			},
			roomTypeChild : {
				required : true,
				digits:true,
			},
			roomTypeIntrodution : {
				required : true,
				maxlength: 60,
			},
		},
		messages : {
			roomTypeName : {
				required : "请填写房型名称",
			},
			roomTypePrice : {
				required : '请填写价格',
				digits:'请勿输入数字以外的字符',
			},
			roomTypeSize : {
				required : '请填写房型面积',
				digits:'请勿输入数字以外的字符',
			},
			roomTypeAdult : {
				required : '请填写入住成人数',
				digits:'请勿输入数字以外的字符',
			},
			roomTypeChild : {
				required : '请填写入住儿童数',
				digits:'请勿输入数字以外的字符',
			},
			roomTypeIntrodution : {
				required : '请输入房型描述',
				maxlength: '描述信息最多不超过60个字（含标点）',
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
   	/*房型模态框中的form表单验证规则*/
   	
   	/*房型信息更新ajax请求*/
   	function updateRoomTypeInfo(){
   		if(	$("#roomTypeForm").valid()){
   			$.post("updateRoomTypeInfo",$("#roomTypeForm").serialize(),function(result){
   				if(result.resultCode==1){
   					alert(result.message);
   				}else{
   					alert("系统繁忙，请稍后再试")
   				}
   			})
   		}else{
   			alert("请将表单填写完整再提交");
   		}
   	}
   	/*打开房型服务信息模态框函数，并且设置对应的input框数据，*/
   	function updateFacilityService(facilityService){
   		$("#facilityServiceBedType").val(facilityService.facilityServiceBedType);
   		$("#facilityServiceBedNumber").val(facilityService.facilityServiceBedNumber);
   		//jquery 多参数查询对应的dom元素
   		$("input[name=facilityServiceWifi][value="+facilityService.facilityServiceWifi+"]").attr("checked","checked"); 
   		$("input[name=facilityServiceRoomService][value="+facilityService.facilityServiceRoomService+"]").attr("checked","checked");   
   		$("input[name=facilityServiceBreakfast][value="+facilityService.facilityServiceBreakfast+"]").attr("checked","checked");
   		$("input[name=facilityServiceLaundry][value="+facilityService.facilityServiceLaundry+"]").attr("checked","checked");
   		$("input[name=facilityServiceTransferService][value="+facilityService.facilityServiceTransferService+"]").attr("checked","checked");
   		//设置对应input框的readonly属性
   		$("#facilityServiceBedType").attr("readonly", "readonly");
   		$("#facilityServiceBedNumber").attr("readonly", "readonly");
   		$('#facilityServiceUpdateBtn').attr("disabled", "disabled");
   		//房型服务信息模态框提交按钮添加点击事件。PS：比房型信息模态框优化更好，集成度更高
   		$('#facilityServiceUpdateBtn').on("click",function(){
   			 if($("#facilityServiceForm").valid()){
   				$.post("updateFacilityServiceInfo?facilityServiceId="+facilityService.facilityServiceId,$("#facilityServiceForm").serialize(),function(result){
   						if(result.resultCode==1){
   							alert(result.message);
   							$('#facilityServiceModal').modal('hide');
   							$('#roomTypeInfoTable').bootstrapTable('refresh')
   						}else{
   							alert("系统繁忙请稍后再试");
   						}
   					});
   			}else{
   				alert("请将表单填写完整再提交")
   			} 
   		});
   		$("#facilityServiceModal").modal("show");
   	}
   	/*打开房型服务信息模态框函数，并且设置对应的input框数据，*/
   	/*房型服务信息框中的表单验证规则*/
	$("#facilityServiceForm").validate({
		rules : {
			facilityServiceBedType : {
				required : true,
			},
			facilityServiceBedNumber : {
				required : true,
				digits:true,
			},
		},
		messages : {
			facilityServiceBedType : {
				required : "请输入床型品牌",
			},
			facilityServiceBedNumber : {
				required : "请填写床铺数量",
				digits:"请勿填写非数字以外的字符",
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
	/*房型服务信息框中的表单验证规则*/
	
   	/*新增房型模态框表单验证规则，PS:遗留了file accept属性验证问题没解决*/
	$("#addRoomTypeForm").validate({
		rules : {
			roomTypeNumber : {
				required : true,
				digits: true,
			},
			roomTypeName : {
				required : true,
				maxlength: 15,
			},
			roomTypePrice : {
				required : true,
				digits:true,
			},
			roomTypeSize : {
				required : true,
				digits:  true,
			},
			roomTypeAdult : {
				required : true,
				digits: true,
				rangelength:[1,10],
			},
			roomTypeChild : {
				required : true,
				digits: true,
				rangelength:[0,10],
			},
			roomTypeIntrodution : {
				required : true,
				maxlength:60,
			},
			facilityServiceBedType : {
				required : true,
			},
			facilityServiceBedNumber : {
				required : true,
				digits:true,
			},
			facilityServiceWifi : {
				required : true,
			},
			facilityServiceRoomService : {
				required : true,
			},
			facilityServiceBreakfast : {
				required : true,
			},
			facilityServiceLaundry : {
				required : true,
			},
			facilityServiceTransferService : {
				required : true,
			},
		},
		messages : {
			roomTypeNumber : {
				required : "请填写房型号",
				digits: "请填写数字",
			},
			roomTypeName : {
				required : "请填写房型名",
				maxlength: "名字不能超过15字",
			},
			roomTypePrice : {
				required : "请填写房型价格",
				digits: "请填写数字",
			},
			roomTypeSize : {
				required : "请填写房型面积",
				digits:  "请填写数字",
			},
			roomTypeAdult : {
				required : "请填写入住最大成人数",
				digits: "请填写数字",
				rangelength:"每间房人数范围[1,10]",
			},
			roomTypeChild : {
				required : "请填写入住最大儿童数",
				digits: "请填写数字",
				rangelength: "每间房人数范围[0,10]",
			},
			roomTypeIntrodution : {
				required : '请输入房型描述',
				maxlength: '描述信息最多不超过60个字（含标点）',
			},
			facilityServiceBedType : {
				required : "请输入床型品牌",
			},
			facilityServiceBedNumber : {
				required : "请填写床铺数量",
				digits:"请勿填写非数字以外的字符",
			},
			facilityServiceWifi : {
				required : "请填写是否有Wi-Fi信号",
			},
			facilityServiceRoomService : {
				required : "请填写是否有房间服务",
			},
			facilityServiceBreakfast : {
				required : "请填写是否有免费供应早餐",
			},
			facilityServiceLaundry : {
				required : "请填写房内是否有洗衣服务",
			},
			facilityServiceTransferService : {
				required : "请填写是否免费接送",
			},
		},

		errorElement : "em",
		sucess : function(em) {
			label.text(" ").addClass("success");
		}

	});
	/*新增房型模态框表单验证规则，PS:遗留了file accept属性验证问题没解决*/
	
	/*新增房型按钮 onclick事件*/
   	function addRoomType(){
   		//取对象必须要用原生js
   		var formData = new FormData(document.getElementById('addRoomTypeForm'));
   		if($("#addRoomTypeForm").valid()){
   			$.ajax({
                type: "POST",
                url: "addRoomType",
                data: formData,
                dataType: "json",
                processData: false, // 告诉jQuery不要去处理发送的数据
                contentType: false, // 告诉jQuery不要去设置Content-Type请求头
                success: function(result){
		                	if(result.resultCode==1){
		       					alert(result.message);
		       				}else{
		       					alert(result.message);
		       				}
                         }
            });
   		}else{
   			alert("请将表单填写完整再提交");
   		}
   		
   	} 
   	/*新增房型按钮 onclick事件*/
   	
   	/* 表格加载 */
   	$('#roomTypeInfoTable')
   			.bootstrapTable(
   					{
   						method : "POST",
   						contentType : "application/x-www-form-urlencoded",
   						dataType : "json",
   						url : "loadRoomTypeInfo", // 执行加载表格的PostMapping
   						pagination : true, // 分页
   						striped : true, // 是否显示行间隔色
   						search : false, // 显示搜索框
   						sidePagination : "server", // 服务端处理分页
   						showRefresh : true,
   						pageNumber : 1, // 初始化加载第一页，默认第一页
   						pageSize : 10, // 每页的记录行数（*）
   						pageList : [ 5, 10, 15, 20 ],
   						classes : "table table-bordered table-striped table-sm ", // 这里设置表格样式
   						toolbar : '#toolbar',
   						detailView: true, //扩展子表
   						showToggle : true, // 是否显示详细视图和列表视图的切换按钮
   						showColumns : true, // 是否显示所有的列
   						cardView : false, // 是否显示详细视图
   						queryParams : function queryParams(params) {
   							params.search = this.search;
   							params.pageNumber = this.pageNumber;
   							return params;
   						},
   						sidePagination : "server",
   						responseHandler : function(result) {
   							// console.log(result);
   							return {
   								"total" : result.total,// 总页数
   								"rows" : result.list
   							// 数据
   							}
   						},
   						columns : [
	   							{
	   				                checkbox: true
	   				            },
   								{
   									field : 'roomTypeNumber',
   									sortable : true,
   									title : '房型号'
   								},
   								{
   									field : 'roomTypeName',
   									sortable : true,
   									title : '房型名称',
   								},
   								{
   									field : 'roomTypePrice',
   									sortable : true,
   									title : '价格',
   								},
   								{
   									field : 'roomTypeSize',
   									sortable : true,
   									title : '房型面积',
   								/*
   								 * formatter:function formatDate(value,row,index){
   								 * var d = new Date(value); var
   								 * times=d.getFullYear() + '年' + (d.getMonth() + 1) +
   								 * '月' + d.getDate() + '日 ' + d.getHours() + ':' +
   								 * d.getMinutes() + ':' + d.getSeconds(); return
   								 * times; }
   								 */
   								},
   								{
   									field : 'roomTypeAdult',
   									sortable : true,
   									title : '最大入住成人数',
   								},
   								{
   									field : 'roomTypeChild',
   									sortable : true,
   									title : '最大入住儿童数',
   								},
   								{
   									field : 'roomTypeAvailableNumber',
   									sortable : true,
   									title : '剩余可用房间数',
   								},
   								{
   									filed : 'roomTypeId',
   									title : '操作',
   									formatter : function(value, row, index) {
   										// 通过formatter可以自定义列显示的内容
   										// value：当前field的值，即id
   										// row：当前行的数据
   										var roomType = JSON.stringify(row);
   										var result = "";
   											result += "<a class='btn btn-xs blue'  title='修改' onclick='updateRoomType("
   													+ roomType
   													+ ")'><span class='glyphicon glyphicon-pencil'></span></a>"
   													+ "<a class='btn btn-xs red'  title='删除' onclick='deleteRoomType("
   													+ roomType
   													+ ")'><span class='	glyphicon glyphicon-remove'></span></a>";
   										return result;
   									}
   								}, ],
   					// 注册加载子表的事件。注意下这里的三个参数！
   					// index：父表当前行的行索引。
   					// row：父表当前行的Json数据对象。
   					// $detail：当前行下面创建的新行里面的td对象。
   				
   						 onExpandRow: function (index, row, $detail) {
   					  		//console.log(row); 
	   					  	//if(row.consumptionType==1){
	   					  		InitSubTable(index, row, $detail); 
	   					  	//} 
   					  }

   					});
  //初始化子表格(无线循环)
    InitSubTable = function (index, row, $detail) {
        var facilityServiceId = row.facilityService.facilityServiceId;
        var detailTable = $detail.html('<table></table>').find('table');
        $(detailTable).bootstrapTable({
            url: 'loadFacilityServiceInfoByFacilityServiceId',
           	method: 'POST',
            contentType : "application/x-www-form-urlencoded",
			dataType : "json",
            queryParams: function queryParams(params) {
				params.facilityServiceId = facilityServiceId;
				return params;
            },
            ajaxOptions: { id: facilityServiceId },
            clickToSelect: true,
            uniqueId: "id",
            pageSize: 5,
            pageList: [5,10],
            columns: [{
                field: 'facilityServiceBedType',
                title: '床铺型号'
            },{
                field: 'facilityServiceBedNumber',
                title: '床铺数量'
            }, {
                field: 'facilityServiceWifi',
                title: 'Wi-Fi',
                formatter:function formatFacilityServiceWifi(value,row,index){
                	var str;
					switch (value) {
					case "0":
						str = "无";
						break;
					case "1":
						str = "全覆盖";
						break;
					}
					return str;
				} 
            }, {
                field: 'facilityServiceRoomService',
                title: '客房服务',
                formatter:function formatFacilityServiceRoomService(value,row,index){
                	var str;
					switch (value) {
					case "0":
						str = "有偿服务";
						break;
					case "1":
						str = "免费提供";
						break;
					}
					return str;
				} 
            },
            {
                field: 'facilityServiceBreakfast',
                title: '早餐服务',
                formatter:function formatFacilityServiceBreakfast(value,row,index){
                	var str;
					switch (value) {
					case "0":
						str = "有偿提供";
						break;
					case "1":
						str = "免费提供";
						break;
					}
					return str;
				} 
            }, 
            {
                field: 'facilityServiceLaundry',
                title: '洗衣服务',
                formatter:function formatFacilityServiceLaundry(value,row,index){
                	var str;
					switch (value) {
					case "0":
						str = "无";
						break;
					case "1":
						str = "免费使用";
						break;
					}
					return str;
				} 
            },
            {
                field: 'facilityServiceTransferService',
                title: '接送服务',
                formatter:function formatFacilityServiceTransferService(value,row,index){
                	var str;
					switch (value) {
					case "0":
						str = "无";
						break;
					case "1":
						str = "免费使用";
						break;
					}
					return str;
				} 
            },
            {
					filed : 'facilityServiceTransferId',
					title : '操作',
					formatter : function(value, row, index) {
						// 通过formatter可以自定义列显示的内容
						// value：当前field的值，即id
						// row：当前行的数据
						var facilityService = JSON.stringify(row);
						var result = "";
							result += "<button class='btn btn-success'  title='修改' onclick='updateFacilityService("
									+ facilityService
									+ ")'>修改</button>"
						return result;
					}
            }
            ],
            //无线循环取子表，直到子表里面没有记录
            onExpandRow: function (index, row, $Subdetail) {
                oInit.InitSubTable(index, row, $Subdetail);
            }
        });
    };