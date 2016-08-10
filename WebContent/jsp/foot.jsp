</section>
			</div><!--end #content-->
			<!-- END CONTENT -->

			<!-- BEGIN MENUBAR-->
			<div id="menubar" class="menubar-inverse ">
				<div class="menubar-fixed-panel">
					<div>
						<a class="btn btn-icon-toggle btn-default menubar-toggle" data-toggle="menubar" href="javascript:void(0);">
							<i class="fa fa-bars"></i>
						</a>
					</div>
					<div class="expanded">
						<a href="html/dashboards/dashboard.html">
							<span class="text-lg text-bold text-primary ">MATERIAL&nbsp;ADMIN</span>
						</a>
					</div>
				</div>
				<div class="menubar-scroll-panel">

					<!-- BEGIN MAIN MENU -->
					<ul id="main-menu" class="gui-controls">

						<!-- BEGIN DASHBOARD -->
						<li>
							<a href="layout?i=dashboard" class="active">
								<div class="gui-icon"><i class="md md-home"></i></div>
								<span class="title">Dashboard</span>
							</a>
						</li><!--end /menu-li -->
						<!-- END DASHBOARD -->

						<!-- BEGIN EMAIL -->
						<li>
							<a href="layout?i=cCustomer">
								<div class="gui-icon"><i class="fa fa-user"></i></div>
								<span class="title">Customer</span>
							</a>
							<!--start submenu -->
							<!-- <ul>
								<li><a href="html/mail/inbox.html" ><span class="title">Inbox</span></a></li>
								<li><a href="html/mail/compose.html" ><span class="title">Compose</span></a></li>
								<li><a href="html/mail/reply.html" ><span class="title">Reply</span></a></li>
								<li><a href="html/mail/message.html" ><span class="title">View message</span></a></li>
							</ul> --><!--end /submenu -->
						</li><!--end /menu-li -->
						<!-- END EMAIL -->

						<!-- BEGIN DASHBOARD -->
						<li>
							<a>
								<div class="gui-icon"><i class="md md-web"></i></div>
								<span class="title">Product</span>
							</a>
							<!--start submenu -->
							<ul>
								<li><a href="layout?i=pCategory" ><span class="title">Category</span></a></li>
								<li><a href="layout?i=pProduct" ><span class="title">Product</span></a></li>
							</ul> <!-- -end /submenu -->
						</li><!--end /menu-li -->
						<!-- END DASHBOARD -->

						<!-- BEGIN UI -->
						<li class="gui-folder">
							<a href="layout?i=oOrder">
								<div class="gui-icon"><i class="fa fa-puzzle-piece fa-fw"></i></div>
								<span class="title">Order</span>
							</a>
							<!--start submenu -->
							<!-- <ul>
								<li><a href="html/ui/colors.html" ><span class="title">Colors</span></a></li>
								<li><a href="html/ui/typography.html" ><span class="title">Typography</span></a></li>
								<li><a href="html/ui/cards.html" ><span class="title">Cards</span></a></li>
								<li><a href="html/ui/buttons.html" ><span class="title">Buttons</span></a></li>
								<li><a href="html/ui/lists.html" ><span class="title">Lists</span></a></li>
								<li><a href="html/ui/tabs.html" ><span class="title">Tabs</span></a></li>
								<li><a href="html/ui/accordions.html" ><span class="title">Accordions</span></a></li>
								<li><a href="html/ui/messages.html" ><span class="title">Messages</span></a></li>
								<li><a href="html/ui/offcanvas.html" ><span class="title">Off-canvas</span></a></li>
								<li><a href="html/ui/grid.html" ><span class="title">Grid</span></a></li>
								<li class="gui-folder">
									<a href="javascript:void(0);">
										<span class="title">Icons</span>
									</a>
									<!start submenu -->
						<!-- 			<ul>
										<li><a href="html/ui/icons/materialicons.html" ><span class="title">Material Design Icons</span></a></li>
										<li><a href="html/ui/icons/fontawesome.html" ><span class="title">Font Awesome</span></a></li>
										<li><a href="html/ui/icons/glyphicons.html" ><span class="title">Glyphicons</span></a></li>
										<li><a href="html/ui/icons/skycons.html" ><span class="title">Skycons</span></a></li>
									</ul><!end /submenu 
								</li><!end /menu-li 
							</ul><!end /submenu   -->
						</li><!--end /menu-li -->
						<!-- END UI -->

						<!-- BEGIN TABLES -->
						<li class="gui-folder">
							<a>
								<div class="gui-icon"><i class="fa fa-table"></i></div>
								<span class="title">General</span>
							</a>
							<!--start submenu -->
							<ul>
								<li><a href="layout?i=gShipping" ><span class="title">Shipping</span></a></li>
								<li><a href="layout?i=gReviews" ><span class="title">Reviews</span></a></li>
								<li><a href="layout?i=gInventory" ><span class="title">Inventory</span></a></li>
								<li><a href="layout?i=gEvents" ><span class="title">Events</span></a></li>
							</ul><!--end /submenu -->
						</li><!--end /menu-li -->
						<!-- END TABLES -->

						<!-- BEGIN FORMS -->
						<li class="gui-folder">
							<a href="layout?i=mContent"> <!-- specific to diffrentiate -->
								<div class="gui-icon"><span class="glyphicon glyphicon-list-alt"></span></div>
								<span class="title">Content</span>
							</a>
							<!--start submenu -->
							<!-- <ul>
								<li><a href="html/forms/basic.html" ><span class="title">Form basic</span></a></li>
								<li><a href="html/forms/advanced.html" ><span class="title">Form advanced</span></a></li>
								<li><a href="html/forms/layouts.html" ><span class="title">Form layouts</span></a></li>
								<li><a href="html/forms/editors.html" ><span class="title">Editors</span></a></li>
								<li><a href="html/forms/validation.html" ><span class="title">Form validation</span></a></li>
								<li><a href="html/forms/wizard.html" ><span class="title">Form wizard</span></a></li>
							</ul> --><!--end /submenu -->
						</li><!--end /menu-li -->
						<!-- END FORMS -->

						<!-- BEGIN PAGES -->
						<li class="gui-folder">
							<a>
								<div class="gui-icon"><i class="md md-assessment"></i></div>
								<span class="title">Reports</span>
							</a>
								<!--start submenu -->
									<ul>
										<li><a href="layout?i=rCustomer" ><span class="title">Customer</span></a></li>
										<li><a href="layout?i=rPayment" ><span class="title">Payment</span></a></li>
										<li><a href="layout?i=rSales" ><span class="title">Sales</span></a></li>
										<li><a href="layout?i=rInventory"><span class="title">Inventory</span></a></li>
									</ul><!--end /submenu -->
								</li><!--end /menu-li -->
								
					<!-- END MAIN MENU -->

					<div class="menubar-foot-panel">
						<small class="no-linebreak hidden-folded">
							<span class="opacity-75">Copyright &copy; 2016</span> <strong>AlphaLogic</strong>
						</small>
					</div>
				</div><!--end .menubar-scroll-panel-->
			</div><!--end #menubar-->
			<!-- END MENUBAR -->

			<!-- BEGIN OFFCANVAS RIGHT -->
			<div class="offcanvas">

				<!-- BEGIN OFFCANVAS SEARCH -->
				<div id="offcanvas-search" class="offcanvas-pane width-8">
					<div class="offcanvas-head">
						<header class="text-primary">Search</header>
						<div class="offcanvas-tools">
							<a class="btn btn-icon-toggle btn-default-light pull-right" data-dismiss="offcanvas">
								<i class="md md-close"></i>
							</a>
						</div>
					</div>
					<div class="offcanvas-body no-padding">
						<ul class="list ">
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>A</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar4.jpg?1404026791" alt="" />
									</div>
									<div class="tile-text">
										Alex Nelson
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar9.jpg?1404026744" alt="" />
									</div>
									<div class="tile-text">
										Ann Laurens
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>J</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar2.jpg?1404026449" alt="" />
									</div>
									<div class="tile-text">
										Jessica Cruise
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar8.jpg?1404026729" alt="" />
									</div>
									<div class="tile-text">
										Jim Peters
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>M</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar5.jpg?1404026513" alt="" />
									</div>
									<div class="tile-text">
										Mabel Logan
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar11.jpg?1404026774" alt="" />
									</div>
									<div class="tile-text">
										Mary Peterson
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar3.jpg?1404026799" alt="" />
									</div>
									<div class="tile-text">
										Mike Alba
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>N</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar6.jpg?1404026572" alt="" />
									</div>
									<div class="tile-text">
										Nathan Peterson
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>P</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar7.jpg?1404026721" alt="" />
									</div>
									<div class="tile-text">
										Philip Ericsson
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
							<li class="tile divider-full-bleed">
								<div class="tile-content">
									<div class="tile-text"><strong>S</strong></div>
								</div>
							</li>
							<li class="tile">
								<a class="tile-content ink-reaction" href="#offcanvas-chat" data-toggle="offcanvas" data-backdrop="false">
									<div class="tile-icon">
										<img src="assets/img/avatar10.jpg?1404026762" alt="" />
									</div>
									<div class="tile-text">
										Samuel Parsons
										<small>123-123-3210</small>
									</div>
								</a>
							</li>
						</ul>
					</div><!--end .offcanvas-body -->
				</div><!--end .offcanvas-pane -->
				<!-- END OFFCANVAS SEARCH -->

				<!-- BEGIN OFFCANVAS CHAT -->
				<div id="offcanvas-chat" class="offcanvas-pane style-default-light width-12">
					<div class="offcanvas-head style-default-bright">
						<header class="text-primary">Chat with Ann Laurens</header>
						<div class="offcanvas-tools">
							<a class="btn btn-icon-toggle btn-default-light pull-right" data-dismiss="offcanvas">
								<i class="md md-close"></i>
							</a>
							<a class="btn btn-icon-toggle btn-default-light pull-right" href="#offcanvas-search" data-toggle="offcanvas" data-backdrop="false">
								<i class="md md-arrow-back"></i>
							</a>
						</div>
						<form class="form">
							<div class="form-group floating-label">
								<textarea name="sidebarChatMessage" id="sidebarChatMessage" class="form-control autosize" rows="1"></textarea>
								<label for="sidebarChatMessage">Leave a message</label>
							</div>
						</form>
					</div>
					<div class="offcanvas-body">
						<ul class="list-chats">
							<li>
								<div class="chat">
									<div class="chat-avatar"><img class="img-circle" src="assets/img/avatar1.jpg?1403934956" alt="" /></div>
									<div class="chat-body">
										Yes, it is indeed very beautiful.
										<small>10:03 pm</small>
									</div>
								</div><!--end .chat -->
							</li>
							<li class="chat-left">
								<div class="chat">
									<div class="chat-avatar"><img class="img-circle" src="assets/img/avatar9.jpg?1404026744" alt="" /></div>
									<div class="chat-body">
										Did you see the changes?
										<small>10:02 pm</small>
									</div>
								</div><!--end .chat -->
							</li>
							<li>
								<div class="chat">
									<div class="chat-avatar"><img class="img-circle" src="assets/img/avatar1.jpg?1403934956" alt="" /></div>
									<div class="chat-body">
										I just arrived at work, it was quite busy.
										<small>06:44pm</small>
									</div>
									<div class="chat-body">
										I will take look in a minute.
										<small>06:45pm</small>
									</div>
								</div><!--end .chat -->
							</li>
							<li class="chat-left">
								<div class="chat">
									<div class="chat-avatar"><img class="img-circle" src="assets/img/avatar9.jpg?1404026744" alt="" /></div>
									<div class="chat-body">
										The colors are much better now.
									</div>
									<div class="chat-body">
										The colors are brighter than before.
										I have already sent an example.
										This will make it look sharper.
										<small>Mon</small>
									</div>
								</div><!--end .chat -->
							</li>
							<li>
								<div class="chat">
									<div class="chat-avatar"><img class="img-circle" src="assets/img/avatar1.jpg?1403934956" alt="" /></div>
									<div class="chat-body">
										Are the colors of the logo already adapted?
										<small>Last week</small>
									</div>
								</div><!--end .chat -->
							</li>
						</ul>
					</div><!--end .offcanvas-body -->
				</div><!--end .offcanvas-pane -->
				<!-- END OFFCANVAS CHAT -->

			</div><!--end .offcanvas-->
			<!-- END OFFCANVAS RIGHT -->

		</div><!--end #base-->
		<!-- END BASE -->

		<!-- BEGIN JAVASCRIPT -->
		<script src="assets/js/libs/jquery/jquery-1.11.2.min.js"></script>
		<script src="assets/js/libs/jquery/jquery-migrate-1.2.1.min.js"></script>
		<script src="assets/js/libs/bootstrap/bootstrap.min.js"></script>
		<script src="assets/js/libs/spin.js/spin.min.js"></script>
		<script src="assets/js/libs/autosize/jquery.autosize.min.js"></script>
		<script src="assets/js/libs/moment/moment.min.js"></script>
		<script src="assets/js/libs/flot/jquery.flot.min.js"></script>
		<script src="assets/js/libs/flot/jquery.flot.time.min.js"></script>
		<script src="assets/js/libs/flot/jquery.flot.resize.min.js"></script>
		<script src="assets/js/libs/flot/jquery.flot.orderBars.js"></script>
		<script src="assets/js/libs/flot/jquery.flot.pie.js"></script>
		<script src="assets/js/libs/flot/curvedLines.js"></script>
		<script src="assets/js/libs/jquery-knob/jquery.knob.min.js"></script>
		<script src="assets/js/libs/sparkline/jquery.sparkline.min.js"></script>
		<script src="assets/js/libs/nanoscroller/jquery.nanoscroller.min.js"></script>
		<script src="assets/js/libs/d3/d3.min.js"></script>
		<script src="assets/js/libs/d3/d3.v3.js"></script>
		<script src="assets/js/libs/rickshaw/rickshaw.min.js"></script>
		<script src="assets/js/core/source/App.js"></script>
		<script src="assets/js/core/source/AppNavigation.js"></script>
		<script src="assets/js/core/source/AppOffcanvas.js"></script>
		<script src="assets/js/core/source/AppCard.js"></script>
		<script src="assets/js/core/source/AppForm.js"></script>
		<script src="assets/js/core/source/AppNavSearch.js"></script>
		<script src="assets/js/core/source/AppVendor.js"></script>
		<!-- <!-- <script src="assets/js/core/demo/Demo.js"></script>
		<script src="assets/js/core/demo/DemoDashboard.js"></script> --> -->
		<!-- END JAVASCRIPT -->

		</body>
</html>
