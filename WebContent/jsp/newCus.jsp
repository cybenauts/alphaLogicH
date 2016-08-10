<%@ include file="head.jsp"%>
 <link type="text/css" rel="stylesheet" href="jsp/css/fileuploader.css" />
                    <div class="section-header">
    <ol class="breadcrumb">
        <li><a href="html/pages/contacts/search.html">Contacts</a></li>
        <li class="active">Add customer</li>
    </ol>
</div>
<div class="section-body contain-lg">
    <div class="row">
        <!-- BEGIN ADD CONTACTS FORM -->
        <div class="col-md-12">
            <div class="card">
                <div class="card-head style-primary">
                    <header id="notify">Add a new customer</header>
                </div>
                <script src="assets/js/libs/jquery/jquery-1.11.2.min.js"></script>
                <form class="form" role="form" method="post" id="formU"  action="formImageUpload"  enctype="multipart/form-data">
                    <!-- BEGIN DEFAULT FORM ITEMS -->
                    <div class="card-body style-primary form-inverse">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group floating-label">
                                            <input type="text" class="form-control input-lg" id="firstname" name="firstname" required="required">
                                            <label for="firstname">First name</label>
                                        </div>
                                    </div>
                                    <!--end .col -->
                                    <div class="col-md-6">
                                        <div class="form-group floating-label">
                                            <input type="text" class="form-control input-lg" id="lastname" name="lastname" required="required">
                                            <label for="lastname">Last name</label>
                                        </div>
                                    </div>
                                    <!--end .col -->
                                </div>
                                <!--end .row -->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group floating-label">
                                            <input type="email" class="form-control" id="email" name="email" required="required">
                                            <label for="company">Email</label>
                                        </div>
                                    </div>
                                    <!--end .col -->
                                </div>
                                <!--end .row -->
                            </div>
                            <!--end .col -->
                        </div>
                        <!--end .row -->
                    </div>
                    <!--end .card-body -->
                    <!-- END DEFAULT FORM ITEMS -->
                    <!-- BEGIN FORM TABS -->
                    <div class="card-head style-primary">
                        <ul class="nav nav-tabs tabs-text-contrast tabs-accent" data-toggle="tabs">
                            <li class="active"><a href="#contact">CONTACT INFO</a></li>
                        </ul>
                    </div>
                    <!--end .card-head -->
                    <!-- END FORM TABS -->
                    <!-- BEGIN FORM TAB PANES -->
                    <div class="card-body tab-content">
                        <div class="tab-pane active" id="contact">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="phone" name="phone" data-inputmask="'mask':'(999) 999-9999'" required="required">
                                                <label for="phone">Phone</label>
                                            </div>
                                        </div>
                                        <!--end .col -->
                                    </div>
                                    <!--end .row -->
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="address1" name="address1" required="required">
                                                <label for="street">Address 1</label>
                                            </div>
                                        </div>
                                        <!--end .col -->
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="address2" name="address2">
                                                <label for="streetnumber">Address 2</label>
                                            </div>
                                        </div>
                                        <!--end .col -->
                                    </div>
                                    <!--end .row -->
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="city" name="city" required="required">
                                                <label for="city">City</label>
                                            </div>
                                        </div>
                                        <!--end .col -->
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="number" class="form-control" id="zip" name="zip" required="required">
                                                <label for="zip">Pin Code</label>
                                            </div>
                                        </div>
                                        <!--end .col -->
                                    </div>
                                    <!--end .row -->
                                </div>
                                <!--end .col -->
                            </div>
                            <!--end .row -->
                        </div>
                        <!--end .tab-pane -->
                        <!-- ne -->
                       
                   
                    <!--end .card-body.tab-content -->
                    <!-- END FORM TAB PANES -->
                    <!-- BEGIN FORM FOOTER -->
                    
                    <!--end .card-actionbar -->
                    <!-- END FORM FOOTER -->
                    
                    <div class="col-lg-offset-1 col-md-10">
                                <div class="card">
                                    <div class="card-head style-primary">
                                        <header>Image Uploader</header>
                                    </div>
                                    <div class="card-body no-padding">
                                       <!-- <form action="formImageUpload" method="post" action="formImageUpload" id="formImageU" enctype="multipart/form-data"> -->
                                        <input type="file" name="file" size="50" />
                                                                            <!--    </form>
 -->                                    </div><!--end .card-body -->
                                </div><!--end .card -->
                                <em class="text-caption">Dropzone Image  upload</em>
                            </div><!--end .col -->
                         
                      
                        <script src="assets/js/libs/dropzone/dropzone.min.js"></script>
                   
                      
                      </div>
            <!--end .card -->
                <div class="card-actionbar">
                        <div class="card-actionbar-row">
                            <a class="btn btn-flat" href="customer.jsp">CANCEL</a>
                            <input type="submit"  class="btn btn-flat btn-accent" value="ADD THIS PERSON">
                      </div>
                      <!-- onclick="sendData()" -->
                      <script src="jsp/js/formUpload.js"></script>
                        <!--end .card-actionbar-row -->
                                        </div>
                </form>

                  

          
        </div>
        <!--end .col -->
        <!-- END ADD CONTACTS FORM -->
    </div>
    <!--end .row -->
</div>
<!--end .section-body -->
<%@ include file="foot.jsp"%>