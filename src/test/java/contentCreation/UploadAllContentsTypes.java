package contentCreation;

import org.testng.annotations.Test;

import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class UploadAllContentsTypes extends BaseClass {
    @Test
	public void uploadPdf() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadPdf();
		UploadContentMethods.sendPdf_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
	
   // @Test
	public void uploadMp4() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadMp4();
		UploadContentMethods.sendPdf_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
    //@Test
	public void uploadEpub() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadEpub();
		UploadContentMethods.sendEpub_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
  //  @Test
	public void uploadWebm() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadWebm();
		UploadContentMethods.sendWebm_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
    
   // @Test
	public void uploadH5p() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadH5p();
		UploadContentMethods.sendH5p_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
    
    //@Test
	public void uploadYTContent() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadYoutubeContent();
		UploadContentMethods.sendYoutubeContent_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
    
   // @Test
	public void uploadHtmlContent() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginascreator();
		String contentName=UploadContentMethods.UploadHtmlContent();
		UploadContentMethods.sendHtmlContent_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
    
    
}
