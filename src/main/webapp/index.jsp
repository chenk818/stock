<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/inc.jsp"%>



<body>

<ul id='stocks'>
</ul>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		$(document).ready(function() {
			$.getJSON('list',function(d) {
				for(idx in d) {
					obj = d[idx];
					var msg = "<li><a  href='line.jsp?code=" + obj.code + "'>" + obj.name + "</a></li>";
			        $("#stocks").append(msg);
				}
			});
		});

		
	</script>

</body>