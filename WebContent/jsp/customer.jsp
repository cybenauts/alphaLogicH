	<%@ include file="head.jsp"%>
	<%@page import="com.alphalogicadmin.services.FillTable"%>>
		<link type="text/css" rel="stylesheet" href="assets/css/theme-default/libs/DataTables/jquery.dataTables.css?1423553989" />
		<link type="text/css" rel="stylesheet" href="assets/css/theme-default/libs/DataTables/extensions/dataTables.colVis.css?1423553990" />
		<link type="text/css" rel="stylesheet" href="assets/css/theme-default/libs/DataTables/extensions/dataTables.tableTools.css?1423553990" />
	
	
	<!-- <script src="jsp/js/customerList.js"></script> -->

	
			<!-- BEGIN CONTENT-->
					<div class="section-header">
						<h2 class="text-primary">Customers</h2>
					</div>
					<div class="section-body">

						<!-- BEGIN DATATABLE 1 -->
						<!-- <div class="row">
							<div class="col-md-8"> -->
								<div class="card">
							<!-- BEGIN SEARCH HEADER -->
							<div class="card-head style-primary">
								<div class="tools pull-left">
									<form class="navbar-search" role="search">
										<div class="form-group">
											<input type="text" class="form-control" name="contactSearch" placeholder="Enter your keyword">
										</div>
										<button type="submit" class="btn btn-icon-toggle ink-reaction"><i class="fa fa-search"></i></button>
									</form>
								</div>
								<div class="tools">
									<a class="btn btn-floating-action btn-default-light" href="addCustomerPageRedirection"><i class="fa fa-plus"></i></a>
								</div>
							</div><!--end .card-head -->
							<!-- END SEARCH HEADER -->
							</div><!-- End card -->
							<!-- </div> --><!--end .col -->
						<!-- </div> --><!--end .row -->
						<div class="row">
							<!-- <div class="col-md-12">
								<h4>Example 1: Show/hide columns</h4>
							</div> --><!--end .col -->
							<div class="col-lg-12">
								<div class="table-responsive">
									<table id="datatable1" class="table table-striped table-hover">
										<thead>
											<tr>
												<th class="sort-numeric">Customer Id</th>
												<th class="sort-alpha">Firstname</th>
												<th class="sort-alpha">Lastname</th>
												<!-- <th class="sort-numeric">Engine version</th> -->
												<th class="sort-alpha">Email</th>
												<th>Edit</th>
												<th class="sort-numeric">Status</th>
											</tr>
										</thead>
										<tbody id="list">
											
									<% String c= new FillTable().fillCustomer();%>
									<%=c %>
											
										</tbody>
									</table>
								</div><!--end .table-responsive -->
							</div><!--end .col -->
						</div><!--end .row -->
						<!-- END DATATABLE 1 -->

						<hr class="ruler-xxl"/>
	<script src="assets/js/libs/jquery/jquery-1.11.2.min.js"></script>
		<script src="jsp/js/customerStatusList.js"></script>
						
					</div><!--end .section-body -->
					
	<%@ include file="foot.jsp"%>
	<script src="assets/js/libs/DataTables/jquery.dataTables.min.js"></script>
		<script src="assets/js/libs/DataTables/extensions/ColVis/js/dataTables.colVis.min.js"></script>
		<script src="assets/js/libs/DataTables/extensions/TableTools/js/dataTables.tableTools.min.js"></script>
	<script src="assets/js/core/demo/DemoTableDynamic.js"></script>
	