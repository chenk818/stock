<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/inc.jsp"%>



<body>
	<!-- 为 ECharts 准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 1200px; height: 600px;"></div>

	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var code = '<%=request.getParameter("code")%>';
		var start = <%=request.getParameter("start")%>;
		var end = <%=request.getParameter("end")%>;
		var data = [];
		$(document).ready(function() {
			$.getJSON('query', {code:code,start:start,end:end}, function(d) {
				var data = [];
				console.log(d);
				console.log(d.length);
				console.log(d[0])
				for(idx in d) {
					obj = d[idx];
					data.push({name:obj.name,value:[obj.dealtime,obj.tclose]});
				}
				var myChart = echarts.init(document.getElementById('main'));
				// 指定图表的配置项和数据
				var option = {
					title : {
						text : '时间轴'
					},
					tooltip : {
						trigger: 'axis',
				        formatter: function (params) {
				            params = params[0];
				            return params.name + ":" + params.value[0] + ' : ' + params.value[1];
				        },
				        axisPointer: {
				            animation: false
				        }
					},
					xAxis : {
						type : 'time',
						splitLine : {
							show : true
						}
					},
					yAxis : {
						type : 'value',
						boundaryGap : [ 0, 1 ],
						splitLine : {
							show : true
						}
					},
					series : [ {
						name : '模拟数据',
						type : 'line',
						showSymbol : false,
						hoverAnimation : false,
						data : data
					} ]
				};

				// 使用刚指定的配置项和数据显示图表。
				myChart.setOption(option);
			});
		});

		
	</script>

</body>