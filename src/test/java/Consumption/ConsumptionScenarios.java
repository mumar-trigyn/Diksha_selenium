package Consumption;

import org.testng.annotations.Test;

import pageActions.Book_Creation;

import pageActions.CertificateCreation;
import pageActions.CourseAssessmentMethods;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.SendForReviewMethods;
import pageActions.CourseConsumptionMethods;
import pageActions.Course_Creation;
import pageActions.TPDMethods;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.ExcelDataProvider;

public class ConsumptionScenarios extends BaseClass {

	@Test

		public void searchTvLessonWithNameAndDoidAndConsume() throws Exception {
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			UserOnBoarding.logout();
			UserOnBoarding.login("Public User1");
			 String name = excel.getContentName("TvLesson");
			 String id =excel.getDoID("TvLesson");
			CourseConsumptionMethods.searchContentForConsumption(id);
			CourseConsumptionMethods.searchContentForConsumption(name);
			
		}
	


	@Test
		public void searchETextbookWithNameAndDoidAndQRCode() throws Exception {

		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
        String Bookname = Book_Creation.CreateBookWithQRCodeAndSendForReview();
        UserOnBoarding.logout();
        UserOnBoarding.login("Reviewer");
		UpForReviewMethods.eTextbook_up_For_Review(Bookname);
		UserOnBoarding.logout();
		UserOnBoarding.login("Public User1");
		String name = excel.getContentName("ETextBook");
		 String id =excel.getDoID("ETextBook");
		 String QRCode ="V9X1R7";
		CourseConsumptionMethods.searchEtextbookForConsumption(id);
		CourseConsumptionMethods.searchEtextbookForConsumption(name);
		CourseConsumptionMethods.searchEtextbookForConsumption(QRCode);
	}
	
	@Test
	public void VerifyUserClickOnViewAllAndCloseButtonForTheMyCoursesSectionAndCourseCardDetailIsDisplayed() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		Course_Consumption.UserDisplayCourseCardDetailsAndViewAllAndCloseButttonInMyCourseSection();

	}
	
	@Test
	public void VerifyUserIsAbleToGetTheCompletionCertificate() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=excel.getContentName("PDF");
		String course=Course_Creation.UploadContentFromLibrary(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UploadContentMethods.publishCourseFromUpForReview(course);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		TPDMethods.createBatchAndAddCertificate(course);
		CertificateCreation.AddCompletionCertificateToCourse();
		UserOnBoarding.logout();
		UserOnBoarding.login("Public User1");
		Course_Consumption.consumeCourseContent(course);
		
		
		
	}
	
	@Test
	public void VerifyUserSeeCeritificateCriteriaAndBatchDetailsInTheCourseTOC() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=excel.getContentName("PDF");
		String course=Course_Creation.UploadContentFromLibrary(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UploadContentMethods.publishCourseFromUpForReview(course);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		TPDMethods.createBatchAndAddCertificate(course);
		CertificateCreation.AddCompletionCertificateToCourse();
		UserOnBoarding.logout();
		UserOnBoarding.login("Public User1");
		CertificateCreation.UserAbleToSeeCeritificateCriteriaAndBatchDetailsInCourseTOC(course);
		
			
	}
	
	@Test
	public void VerifyUserIsAbleToGetTheMeritCertificate() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
//		String courseAssesment=CourseAssessmentMethods.createAssessmentWithQuestion();
//		SendForReviewMethods.sendCourseAssessment_For_Review(courseAssesment);
//		UserOnBoarding.logout();
//		UserOnBoarding.login("Reviewer");
//		UpForReviewMethods.up_For_Review(courseAssesment);
//		UserOnBoarding.logout();
//		UserOnBoarding.login("Creator");
		
		String contentName=excel.getContentName("CourseAssessment");
		String course=Course_Creation.UploadContentFromLibrary(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UploadContentMethods.publishCourseFromUpForReview(course);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		TPDMethods.createBatchAndAddCertificate(course);
		CertificateCreation.AddMeritCertificateToCourse();;
		UserOnBoarding.logout();
		UserOnBoarding.login("Public User1");
		Course_Consumption.consumeCourseAssesment(course);
		
			
		
	}

	
	@Test
	public void checkCourseExpiryMessageForUser() throws Exception {
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=excel.getContentName("CourseAssessment");
//		String contentName=UploadContentMethods.UploadPdf();
//		SendForReviewMethods.sendPdf_For_Review(contentName);
//		UserOnBoarding.logout();
//		UserOnBoarding.login("Reviewer");
//		UpForReviewMethods.up_For_Review(contentName);
//		UserOnBoarding.logout();
//		UserOnBoarding.login("Creator");
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
		CourseConsumptionMethods.validateBatchExpiryDate();
	}
	
	//@Test
	//Not in scope for now, will work on this later
	public void checkContentForDownloadedQRFile() throws Exception {
	UserOnBoarding.schoolheadicon();
	UserOnBoarding.bmcpopuphandle();
	UserOnBoarding.locationpopuphandle();
	UserOnBoarding.login("Public User1");
	String id=excel.readDataForDownloadedQRCodeFile();
	CourseConsumptionMethods.searchEtextbookForConsumption(id);
	
	
	
	}

}
