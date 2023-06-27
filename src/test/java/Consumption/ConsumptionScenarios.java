package Consumption;

import org.testng.annotations.Test;

import pageActions.Book_Creation;
import pageActions.CertificateCreation;
import pageActions.CourseAssessmentMethods;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.SendForReviewMethods;
import pageActions.TPDMethods;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.ExcelDataProvider;

public class ConsumptionScenarios extends BaseClass {

	//@Test
		public void seachBookWithNameAndDoid() throws Exception {
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			UserOnBoarding.logout();
			UserOnBoarding.login("Public User1");
			 String name = excel.getContentName("PDF");
			 String id =excel.getDoID("Course");
			Course_Consumption.searchContentForConsumption(id);
			
		}
	
	//@Test
	public void VerifyUserSearchAndConsumeThePublishedLiveContents() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String Bookname = Book_Creation.CreatorAddAllTypeOfContentAndSendForReview();
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.eTextbook_up_For_Review(Bookname);
		UserOnBoarding.logout();
		UserOnBoarding.login("Public User1");
		Course_Consumption.searchContentAndConsumption(Bookname);
	}
	
	//@Test
	public void VerifyUserClickOnViewAllAndCloseButtonForTheMyCoursesSectionAndCourseCardDetailIsDisplayed() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		Course_Consumption.UserDisplayCourseCardDetailsAndViewAllAndCloseButttonInMyCourseSection();

	}
	
//	@Test
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
	
//	@Test
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
	
}
