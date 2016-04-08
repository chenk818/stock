<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/inc.jsp"%>



<body>
	<!-- 为 ECharts 准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 1200px; height: 600px;"></div>

	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var codes = '<%=request.getParameter("codes")%>';
		var start = <%=request.getParameter("start")%>;
		var end = <%=request.getParameter("end")%>;
		var data = [];
		$(document).ready(function() {
			$.getJSON('query', {codes:codes,start:start,end:end}, function(d) {
				var data = [];
				for(pos in d) {
					var _data = {data:[],name:'股市',type:'line',showSymbol : false,
							hoverAnimation : false,};
					
					for(idx in d[pos]) {
						obj = d[pos][idx];
						var rate = 1;
						if(obj.code=='0000001') {
							rate = 30;
						}
						_data.data.push({name:obj.name,value:[obj.dealtime,obj.tclose/rate]});
					}
					data.push(_data);
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
				        	var s = params[0].value[0] + ":";
				        	for(idx in params) {
				        		s += params[idx].name + "=" + params[idx].value[1] + ";";
				        	}
				        	return s;
				            
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
					series : data
				};

				// 使用刚指定的配置项和数据显示图表。
				myChart.setOption(option);
			});
		});

		
	</script>

</body>