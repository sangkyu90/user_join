<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<Script>
var AjaxUtil = function(conf){
	var xhr = new XMLHttpRequset();
	var url = conf.url;
	var method = conf.method?conf.method:'GET';
	var param = conf.param?conf.param='{}';
	
	var success = conf.success?conf.success:function(res){
		alert(res);
	}
	var error = conf.error?conf.error:function(res){
		alert(res);
	}
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4){
			if(xhr.status=="200"){
				success(xhr.responseText);
			}else{
				error(xhr.responseText);
			}
		}
	}
	xhr.open(method,url);
	if(method!='GET'){
		xhr.setRequestHeader('Content-type','application/json;charset=utf-8');
	}
	this.send =function(){
		xhr.send(param);
		
	}
}

window.addEventListener('load',function(){
	var conf = {
			url : '/joininfo',
			success: function(res){
				res= JSON.parse(res);
				var html = '';
				for(var li or res){
					html +='<tr>';
					html +='<td>'+ ji.ujNum + '</td>';
					html +='<td><input type="text" id="ujId"'+ji.ujNum +'"value=""'+ ji.ujId + '</td>';
					html +='<td><input type="text" id="ujPwd"'+ji.ujNum +'"value=""'+ ji.ujPwd + '</td>';
					html +='<td><input type="text" id="ujLocal"'+ji.ujNum +'"value=""'+ ji.ujLocal + '</td>';
					html +='<td><input type="text" id="ujName"'+ji.ujNum +'"value=""'+ ji.ujname + '</td>';
					html +='<td><input type="text" id="ujEmali"'+ji.ujNum +'"value=""'+ ji.ujEmail + '</td>';
					html +='<td><input type="text" id="ujGender"'+ji.ujNum +'"value=""'+ ji.ujGender + '</td>';
					html +='<td><input type="text" id="ujBirth"'+ji.ujNum +'"value=""'+ ji.ujBirth + '</td>';
					html +='<td><input type="text" id="ujMobile"'+ji.ujNum +'"value=""'+ ji.ujMobile + '</td>';
					html +='<td><input type="text" id="ujAddress"'+ji.ujNum +'"value=""'+ ji.ujAddress + '</td>';
					html +='<td><button onclick="updateJoinInfo('+ji.ujNum+')">수정</button><button onclick="deletJoinInfo('+ji.ujNum + ')">삭제</button></td>';
				}
				document.querySelector('#jiBody').insertAdjacentHTML('beforeend',html);
			}
	}
	var au = new AjaxUtil(conf);
	au.send();
});
</Script>
<body>
	ujName :
	<input type="text" name="ujname">
	<button>검색</button>
	<table border="1">
		<thead>
			<tr>
				<th>ujNum</th>
				<th>ujId</th>
				<th>ujPwd</th>
				<th>ujLocal</th>
				<th>ujName</th>
				<th>ujEmail</th>
				<th>ujGender</th>
				<th>ujBirth</th>
				<th>ujMobile</th>
				<th>ujAddress</th>
				<th>수정/삭제</th>
			</tr>
		</thead>
		<tbody id="jiBody">

		</tbody>
	</table>
	<script>
		
		function updateJoinInfo(ujnum){
			var ujId= document.querySelector("#jiId"+jinum).value;
			var ujPwd= document.querySelector("#jiPwd"+jinum).value;
			var ujLocal= document.querySelector("#jiLocal"+jinum).value;
			var ujName= document.querySelector("#jiName"+jinum).value;
			var ujEmail= document.querySelector("#jiEmail"+jinum).value;
			var ujGender= document.querySelector("#jiGender"+jinum).value;
			var ujBirth= document.querySelector("#jiBirth"+jinum).value;
			var ujMobile= document.querySelector("#jiMobile"+jinum).value;
			var ujAddress= document.querySelector("#jiAddress"+jinum).value;
			var params= {jiId:jiId,jiPwd:jiPwd,jiLocal:jiLocal,jiName:jiName,jiEmail:jiEmail,jiGender:jiGender,jiBirth:jiBirth,jiMobile:jiMobile,jiAddress:jiAddress}
		params = JSON.stringify(params);
			
			var conf ={
					url : '/joininfo/' +jiNum,
					method : 'PUT',
					param : params,
					success : function(res){
						alert(res);
					}
			}
			var au =new AjaxUtil(conf);
			au.send();
		}
		function deleteJoinInfo(jinum){
			var conf={
					url : '/joininfo/' + jinum,
					method : 'DELETE',
					success : function(res){
						alert(res);
						location.herf = '/url/joinnifo:list';
					}
			}
		
		</script>

</body>
</html>