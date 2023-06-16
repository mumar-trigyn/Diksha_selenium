package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.CourseAssessmentMethods;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.SendForReviewMethods;
import pageActions.TPDMethods;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class CreateCourseAndPublish extends BaseClass{
	
	//@Test
	public void createCourseSendForReviewAndPublish() throws Exception {
		
		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=UploadContentMethods.UploadPdf();
		SendForReviewMethods.sendPdf_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.up_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		String course=Course_Creation.UploadContentFromLibrary(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UploadContentMethods.publishCourseFromUpForReview(course);
		
		
	}
	
	//@Test
	public void verifyAddFromLibraryInCourse()throws Exception {
		
		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=UploadContentMethods.UploadPdf();
		SendForReviewMethods.sendPdf_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.up_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		String course=Course_Creation.checkUploadContentFromLibrary(contentName);
	
	}
	
	//	@Test
		public void CreateBatchWithFutureDate() throws Exception {
			
			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
			
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			String contentName=UploadContentMethods.UploadPdf();
			SendForReviewMethods.sendPdf_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UpForReviewMethods.up_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			String course=Course_Creation.UploadContentFromLibrary(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			TPDMethods.createBatchAndVerify(course);
			
		}
	
	
	
	
	//	@Test
		public void userJoinsTheCourse() throws Exception {
			
			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
			
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			String contentName=excel.getContentName("PDF");
//			String contentName=UploadContentMethods.UploadPdf();
//			SendForReviewMethods.sendPdf_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Reviewer");
//			UpForReviewMethods.up_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Creator");
			String course=Course_Creation.UploadContentFromLibrary(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			TPDMethods.createBatch(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Public User1");
			TPDMethods.userEnrollsInCourse(course);
		}
	//	@Test
		public void verifyOnlyOneOpenBatch() throws Exception {
			
			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
			
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			String contentName=UploadContentMethods.UploadPdf();
			SendForReviewMethods.sendPdf_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UpForReviewMethods.up_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
//			String contentName=excel.getContentName("PDF");
			String course=Course_Creation.UploadContentFromLibrary(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			TPDMethods.verifyOneBatchInCourse(course);
		
		}
	
	//	@Test
		public void verifyDiscussionForumForCourse() throws Exception {
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			String contentName=UploadContentMethods.UploadPdf();
			SendForReviewMethods.sendPdf_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UpForReviewMethods.up_For_Review(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
//			String contentName=excel.getContentName("PDF");
			String course=Course_Creation.UploadContentFromLibrary(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			TPDMethods.openDiscussionForum(course);
		
		}
	
	//	@Test
		public void addMentorInCourseAndVerify() throws Exception {
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
//			String contentName=UploadContentMethods.UploadPdf();
//			SendForReviewMethods.sendPdf_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Reviewer");
//			UpForReviewMethods.up_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Creator");
			String contentName=excel.getContentName("PDF");
			String course=Course_Creation.UploadContentFromLibrary(contentName);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			TPDMethods.addMentor(course);
			UserOnBoarding.logout();
			UserOnBoarding.login("Admin");
			TPDMethods.verifyAddMentor(course);
		}
		
	//    @Test
	     public void verifyAddCourseAssessmentInCourse() throws Exception {
	    	 UserOnBoarding.teachericon();
	   		UserOnBoarding.bmcpopuphandle();
	   		UserOnBoarding.locationpopuphandle();
	   		UserOnBoarding.login("Creator");
//	   		String Assessment=excel.getContentName("CourseAssessment");
			String Assessment=CourseAssessmentMethods.createAssessmentWithQuestion();
			SendForReviewMethods.sendCourseAssessment_For_Review(Assessment);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UpForReviewMethods.up_For_Review(Assessment);
			UserOnBoarding.logout();
			UserOnBoarding.login("Creator");
			String course=Course_Creation.UploadContentFromLibrary(Assessment);
			UserOnBoarding.logout();
			UserOnBoarding.login("Reviewer");
			UploadContentMethods.publishCourseFromUpForReview(course);
			UserOnBoarding.logout();
			
	     }  
	
	 //		@Test
			public void verifyMentorCanCreateBatch() throws Exception {
				UserOnBoarding.schoolheadicon();
				UserOnBoarding.bmcpopuphandle();
				UserOnBoarding.locationpopuphandle();
				UserOnBoarding.login("Creator");
//				String contentName=UploadContentMethods.UploadPdf();
//				SendForReviewMethods.sendPdf_For_Review(contentName);
//				UserOnBoarding.logout();
//				UserOnBoarding.login("Reviewer");
//				UpForReviewMethods.up_For_Review(contentName);
//				UserOnBoarding.logout();
//				UserOnBoarding.login("Creator");
				String contentName=excel.getContentName("PDF");
				String course=Course_Creation.UploadContentFromLibrary(contentName);
				UserOnBoarding.logout();
				UserOnBoarding.login("Reviewer");
				UploadContentMethods.publishCourseFromUpForReview(course);
				UserOnBoarding.logout();
				UserOnBoarding.login("Creator");
				TPDMethods.addMentor(course);
				UserOnBoarding.logout();
				UserOnBoarding.login("Admin");
				TPDMethods.verifyAddMentor(course);
			}
			
 		@Test
			public void userUnenrollsFromTheCourse() throws Exception {
 			
 			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
 			
				UserOnBoarding.schoolheadicon();
				UserOnBoarding.bmcpopuphandle();
				UserOnBoarding.locationpopuphandle();
				UserOnBoarding.login("Creator");
			//	String contentName=excel.getContentName("PDF");

				String contentName=UploadContentMethods.UploadPdf();
				SendForReviewMethods.sendPdf_For_Review(contentName);
				UserOnBoarding.logout();
				UserOnBoarding.login("Reviewer");
				UpForReviewMethods.up_For_Review(contentName);
				UserOnBoarding.logout();
				UserOnBoarding.login("Creator");
				String course=Course_Creation.UploadContentFromLibrary(contentName);
				UserOnBoarding.logout();
				UserOnBoarding.login("Reviewer");
				UploadContentMethods.publishCourseFromUpForReview(course);
				UserOnBoarding.logout();
				UserOnBoarding.login("Creator");
				TPDMethods.createBatch(course);
				UserOnBoarding.logout();
				UserOnBoarding.login("Public User1");
				TPDMethods.userEnrollsInCourse(course);
				TPDMethods.userUnenrollsInCourse(course);
			}
}
